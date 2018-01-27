package com.whz.service.sys.impl;

import org.springframework.stereotype.Service;

import com.whz.common.annotation.BaseService;
import com.whz.mapper.sys.UserMapper;
import com.whz.model.sys.User;
import com.whz.model.sys.UserExample;
import com.whz.service.base.impl.BaseServiceImpl;
import com.whz.service.sys.UserService;
/**
 * 用户服务实现类
 * @author wenhz
 * @date 2018-1-27 下午04:46:36
 */
@Service
@BaseService
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User, UserExample> implements UserService{

}
