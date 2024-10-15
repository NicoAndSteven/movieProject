package com.coco.movieproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coco.movieproject.entity.User;
import com.coco.movieproject.service.UserService;
import com.coco.movieproject.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 86178
* @description 针对表【t_users】的数据库操作Service实现
* @createDate 2024-10-15 20:59:52
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




