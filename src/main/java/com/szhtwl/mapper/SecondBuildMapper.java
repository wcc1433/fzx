package com.szhtwl.mapper;

import java.util.List;

import com.szhtwl.bean.SecondBuild;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface SecondBuildMapper extends CRUDMapper<SecondBuild> {

}