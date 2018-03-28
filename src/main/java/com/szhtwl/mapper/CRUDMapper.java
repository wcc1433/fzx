package com.szhtwl.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/3/26.
 */
public interface CRUDMapper<T> {

    T findOne(Integer id);

    List<T> findList(@Param("object") T t,@Param("currentSize")Integer currentSize, @Param("rowSize")Integer rowSize,@Param("condition")String condition);

    Integer count(T t);

    Integer update(T t);

    Integer insert(T t);

    Integer delete(Integer id);
}
