package com.szhtwl.service.impl;

import com.szhtwl.bean.CarBuild;
import com.szhtwl.bean.Page;
import com.szhtwl.enums.ExceptionEnum;
import com.szhtwl.enums.ResultEnum;
import com.szhtwl.exception.FzxException;
import com.szhtwl.mapper.CarBuildMapper;
import com.szhtwl.service.api.ICarBuildService;
import com.szhtwl.vo.ResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/26.
 */
@Service
@RequestMapping("/carBuildService")
@RestController
public class CarBuildService implements ICarBuildService {

    private final Logger LOGGER = LoggerFactory.getLogger(CarBuildService.class);

    @Autowired
    CarBuildMapper carBuildMapper;


    @RequestMapping("/findOne")
    @Override
    public ResultVO findOne(Integer id) {
        if(id ==null)
            throw new FzxException(ExceptionEnum.ID_NOT_EXIST);
        try{
            //
            CarBuild carBuild = carBuildMapper.findOne(id);
            if(carBuild==null){
                return new ResultVO(null, ResultEnum.HTTP_CODE_SUCCESS);
            }else{//
                return new ResultVO(carBuild, ResultEnum.HTTP_CODE_SUCCESS);
            }
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.info("CarBuildService:"+ExceptionEnum.SERVICE_ERROR);
        }
        return new ResultVO(null, ResultEnum.HTTP_CODE_ERROR);
    }

    @RequestMapping("/findList")
    @Override
    public ResultVO findList(CarBuild carBuild, Integer showPage, Integer rowSize, String condition) {
        Page page = new Page();
        try{
            //
            Integer currentSize = page.currentSize(showPage, rowSize, carBuildMapper.count(carBuild));
            List<CarBuild> list = carBuildMapper.findList(carBuild, currentSize, page.getRowSize(), condition);
            if(CollectionUtils.isEmpty(list)){
                return new ResultVO(null,ResultEnum.HTTP_CODE_SUCCESS);
            }
            return new ResultVO(list,ResultEnum.HTTP_CODE_SUCCESS);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResultVO(null,ResultEnum.HTTP_CODE_FIND_ERROR);
    }


    @Override
    public ResultVO update(CarBuild carBuild) {
        return null;
    }

    @Override
    public ResultVO insert(CarBuild carBuild) {
        return null;
    }

    @Override
    public ResultVO delete(Integer id) {
        return null;
    }
}
