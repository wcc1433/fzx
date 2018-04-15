package com.szhtwl.service.api;

import com.szhtwl.bean.Admin;
import com.szhtwl.vo.ResultVO;

public interface IAdminService extends ICRUDService {

    ResultVO login(Admin admin);
}
