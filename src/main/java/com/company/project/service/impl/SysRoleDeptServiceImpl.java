package com.company.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.company.project.entity.sys.SysRoleDeptEntity;
import com.company.project.mapper.sys.SysRoleDeptMapper;
import com.company.project.service.SysRoleDeptService;
import org.springframework.stereotype.Service;


@Service("sysRoleDeptService")
public class SysRoleDeptServiceImpl extends ServiceImpl<SysRoleDeptMapper, SysRoleDeptEntity> implements SysRoleDeptService {


}