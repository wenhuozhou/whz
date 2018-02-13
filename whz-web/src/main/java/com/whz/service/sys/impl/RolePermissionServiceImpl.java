package com.whz.service.sys.impl;

import org.springframework.stereotype.Service;

import com.whz.common.annotation.BaseService;
import com.whz.mapper.sys.RolePermissionMapper;
import com.whz.model.sys.RolePermission;
import com.whz.model.sys.RolePermissionExample;
import com.whz.service.base.impl.BaseServiceImpl;
import com.whz.service.sys.RolePermissionService;
/**
 * 角色权限服务实现类
 * @author wenhz
 * @date 2018-1-27 下午04:46:36
 */
@Service
@BaseService
public class RolePermissionServiceImpl extends BaseServiceImpl<RolePermissionMapper, RolePermission, RolePermissionExample> implements RolePermissionService{

}
