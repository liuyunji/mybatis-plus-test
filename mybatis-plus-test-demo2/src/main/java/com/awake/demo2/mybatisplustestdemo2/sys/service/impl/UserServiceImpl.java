package com.awake.demo2.mybatisplustestdemo2.sys.service.impl;

import com.awake.demo2.mybatisplustestdemo2.sys.entity.User;
import com.awake.demo2.mybatisplustestdemo2.sys.mapper.UserMapper;
import com.awake.demo2.mybatisplustestdemo2.sys.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author awake
 * @since 2019-04-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
