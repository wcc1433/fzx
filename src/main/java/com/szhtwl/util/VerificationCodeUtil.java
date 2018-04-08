package com.szhtwl.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 * 生成验证码的工具类
 */
public class VerificationCodeUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(VerificationCodeUtil.class);
    private static final Random random = new Random();
    private static final String RANDOMSTR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String RANDOMNUM = "0123456789";
    private static final String RANDOMSTRANDNUM = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int CODE_LENGTH = 4;//验证码位数

    public static int width = 60, height = 20;//验证码默认大小

    /**
     * 返回 4位的验证码（纯字符）
     * @return
     */
    public static String getStrCode() {
        String code = "";
        for(int i = 0; i < CODE_LENGTH; i++) {
            code += RANDOMSTR.charAt(random.nextInt(RANDOMSTR.length()));
        }
        return code;
    }

    /**
     * 返回 4位的验证码（纯数字）
     * @return
     */
    public static String getNumCode() {
        String code = "";
        for(int i = 0; i < CODE_LENGTH; i++) {
            code += RANDOMNUM.charAt(random.nextInt(RANDOMNUM.length()));
        }
        return code;
    }

    /**
     * 返回 4位的验证码（字符数字混合）
     * @return
     */
    public static String getStrAndNumCode() {
        String code = "";
        for(int i = 0; i < CODE_LENGTH; i++) {
            code += RANDOMSTRANDNUM.charAt(random.nextInt(RANDOMSTRANDNUM.length()));
        }
        return code;
    }

    /**
     * 生成验证码(png)（只处理前 4位字符）
     * @param verificationCode
     */
    public static ByteArrayOutputStream getVerificationCodeImage(String verificationCode) {
        // 创建图片
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics gra = image.getGraphics();
        // 绘制背景色(随机)
        gra.setColor(getRandColor(200, 250));
        gra.fillRect(0, 0, width, height);

        // 设置字体色
        gra.setColor(Color.black);
        gra.setFont(new Font("Times New Roman", Font.BOLD, 18));

        // 随机产生155条干扰线，使图象中的认证码不易被其它程序探测到
        int x = 10, y = 10;
        for (int i = 0; i < 100; i++) {
            gra.setColor(getRandColor(120, 220));
            x = random.nextInt(width);
            y = random.nextInt(height);
            int xl = random.nextInt(12);
            int yl = random.nextInt(12);
            gra.drawLine(x, y, x + xl, y + yl);
        }

        for(int i = 0; i < verificationCode.length(); i++) {
            // 调用函数出来的颜色相同，可能是因为种子太接近，所以只能直接生成
            gra.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));// 每个字符的颜色不一样
            gra.drawString(String.valueOf(verificationCode.charAt(i)), 13 * i + 6, 12 + random.nextInt(5));
        }
        gra.dispose();

        ByteArrayOutputStream imageOutputStream = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "png", imageOutputStream);
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
            return null;
        }

        return imageOutputStream;
    }

    /**
     * 给定范围获得随机颜色
     * @param fc
     * @param bc
     * @return
     */
    private static Color getRandColor(int fc, int bc) {
        if (fc > 255) {
            fc = 255;
        }
        if (bc > 255) {
            bc = 255;
        }
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }
}
