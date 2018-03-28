package com.szhtwl.mapper;

import java.util.List;

import com.szhtwl.bean.OfficeBuild;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface OfficeBuildMapper extends CRUDMapper<OfficeBuild>{

}