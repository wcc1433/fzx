package com.szhtwl.service.api;

import com.szhtwl.form.ConditionForm;
import com.szhtwl.vo.ResultVO;

import java.util.Map;

/**
 * Created by Administrator on 2018/3/26.
 */
public interface ICRUDService<T> {

    ResultVO findOne(Integer id);

    ResultVO findList(ConditionForm conditionForm, Integer showPage, Integer rowSize, String condition);

    ResultVO update(T t);

    ResultVO insert(T t);

    ResultVO delete(Integer id);
}
