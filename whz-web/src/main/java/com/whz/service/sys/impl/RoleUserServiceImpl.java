package com.whz.service.sys.impl;

import org.springframework.stereotype.Service;

import com.whz.common.annotation.BaseService;
import com.whz.mapper.sys.RoleUserMapper;
import com.whz.model.sys.RoleUser;
import com.whz.model.sys.RoleUserExample;
import com.whz.service.base.impl.BaseServiceImpl;
import com.whz.service.sys.RoleUserService;
/**
 * 角色用户服务实现类
 * @author wenhz
 * @date 2018-1-27 下午04:46:36
 */
@Service
@BaseService
public class RoleUserServiceImpl extends BaseServiceImpl<RoleUserMapper, RoleUser, RoleUserExample> implements RoleUserService{

}
