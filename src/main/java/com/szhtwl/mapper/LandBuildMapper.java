package com.szhtwl.mapper;

import java.util.List;
import java.util.Map;

import com.szhtwl.bean.LandBuild;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface LandBuildMapper extends CRUDMapper<LandBuild>{

    Object findAll(@Param("landBuild")LandBuild landBuild,@Param("currentSize") Integer currentSize,@Param("rowSize")Integer rowSize);
}