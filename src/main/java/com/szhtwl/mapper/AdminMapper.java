package com.szhtwl.mapper;

import com.szhtwl.bean.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper extends CRUDMapper<Admin> {

    Admin login(@Param("name") String name, @Param("enable") Byte enable);
}
