package com.szhtwl.service.impl;

import com.szhtwl.bean.Admin;
import com.szhtwl.enums.ResultEnum;
import com.szhtwl.form.ConditionForm;
import com.szhtwl.mapper.AdminMapper;
import com.szhtwl.service.api.IAdminService;
import com.szhtwl.vo.ResultVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminService implements IAdminService {

    @Resource
    private AdminMapper adminMapper;

    /**
     * 登陆
     * @param admin
     * @return
     */
    @Override
    public ResultVO login(Admin admin) {
        Admin login = adminMapper.login(admin.getName(), Admin.ENABLE);
        if(login != null && login.getPassword().equals(admin.getPassword())) {
            return new ResultVO(login, ResultEnum.HTTP_CODE_SUCCESS);
        }
        return new ResultVO("500", "用户名或密码错误");
    }

    /**
     * 根据 id查找
     * @param id
     * @return
     */
    @Override
    public ResultVO findOne(Integer id) {
        Admin admin = adminMapper.findOne(id);
        if(admin != null) {
            return new ResultVO(admin, ResultEnum.HTTP_CODE_SUCCESS);
        }
        return new ResultVO("500", "账号不存在");
    }

    @Override
    public ResultVO findList(ConditionForm conditionForm, Integer showPage, Integer rowSize, String condition) {
        return null;
    }

    @Override
    public ResultVO update(Object o) {
        return null;
    }

    @Override
    public ResultVO insert(Object o) {
        return null;
    }

    @Override
    public ResultVO delete(Integer id) {
        return null;
    }
}
