package com.szhtwl.controller;

import com.szhtwl.util.VerificationCodeUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 验证码生成器
 */
@RestController
public class VericationCode {

    @RequestMapping("/verificationCode")
    public void getVerificationCode(HttpSession session, HttpServletResponse response) throws IOException {
        String code = VerificationCodeUtil.getNumCode();
        session.setAttribute("verificationCode", code);

        OutputStream out = response.getOutputStream();
        out.write(VerificationCodeUtil.getVerificationCodeImage(code).toByteArray());
        out.flush();
    }
}
