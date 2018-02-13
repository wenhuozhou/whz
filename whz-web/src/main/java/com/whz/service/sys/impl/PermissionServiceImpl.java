package com.whz.service.sys.impl;

import org.springframework.stereotype.Service;

import com.whz.common.annotation.BaseService;
import com.whz.mapper.sys.PermissionMapper;
import com.whz.model.sys.Permission;
import com.whz.model.sys.PermissionExample;
import com.whz.service.base.impl.BaseServiceImpl;
import com.whz.service.sys.PermissionService;
/**
 * 权限服务实现类
 * @author wenhz
 * @date 2018-1-27 下午04:46:36
 */
@Service
@BaseService
public class PermissionServiceImpl extends BaseServiceImpl<PermissionMapper, Permission, PermissionExample> implements PermissionService{

}
