package com.szhtwl.mapper;

import com.szhtwl.bean.LandBuild;
import org.apache.ibatis.annotations.Param;

public interface LandBuildMapper extends CRUDMapper<LandBuild>{

    Object findAll(@Param("landBuild")LandBuild landBuild,@Param("currentSize") Integer currentSize,@Param("rowSize")Integer rowSize);
}