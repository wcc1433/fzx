package com.szhtwl.controller;

import com.szhtwl.bean.Admin;
import com.szhtwl.service.api.IAdminService;
import com.szhtwl.util.StringUtil;
import com.szhtwl.vo.ResultVO;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/admin")
public class LoginAction {

    private final Logger LOGGER = LoggerFactory.getLogger(LoginAction.class);

    @Autowired
    private IAdminService adminService;

    @RequestMapping("/login")
    public ResultVO adminLogin(HttpSession session, String verificationCode, Admin admin) {
        if(!StringUtil.notEmpty(verificationCode)) {
            return new ResultVO("500", "验证码错误");
        }
        String code = (String) session.getAttribute("verificationCode");
        if(!verificationCode.equals(code)) {
            return new ResultVO("500", "验证码错误");
        }

        if(StringUtil.notEmpty(admin.getName()) || StringUtil.notEmpty(admin.getPassword())) {
            ResultVO resultVO =  adminService.login(admin);
            session.setAttribute("admin", resultVO.getData());
            resultVO.setData(null);
            return resultVO;
        }

        return new ResultVO("500", "用户名或密码错误");
    }
}
