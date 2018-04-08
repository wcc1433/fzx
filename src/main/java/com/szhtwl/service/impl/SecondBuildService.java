package com.szhtwl.service.impl;

import com.szhtwl.bean.SecondBuild;
import com.szhtwl.form.ConditionForm;
import com.szhtwl.mapper.SecondBuildMapper;
import com.szhtwl.service.api.ISecondBuildService;
import com.szhtwl.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/3.
 */
@Service
@RestController
@RequestMapping("/secondBuildService")
public class SecondBuildService implements ISecondBuildService{


    @Autowired
    SecondBuildMapper secondBuildMapper;

    @Override
    public ResultVO findOne(Integer id) {
        return null;
    }

    @Override
    public ResultVO findList(ConditionForm conditionForm, Integer showPage, Integer rowSize, String condition) {
        return null;
    }

    @Override
    public ResultVO update(SecondBuild secondBuild) {
        return null;
    }

    @Override
    public ResultVO insert(SecondBuild secondBuild) {
        return null;
    }

    @Override
    public ResultVO delete(Integer id) {
        return null;
    }
}
