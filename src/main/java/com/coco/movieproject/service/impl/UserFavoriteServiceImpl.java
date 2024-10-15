package com.coco.movieproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coco.movieproject.entity.UserFavorite;
import com.coco.movieproject.service.UserFavoriteService;
import com.coco.movieproject.mapper.UserFavoriteMapper;
import org.springframework.stereotype.Service;

/**
* @author 86178
* @description 针对表【t_user_favorites】的数据库操作Service实现
* @createDate 2024-10-15 20:59:52
*/
@Service
public class UserFavoriteServiceImpl extends ServiceImpl<UserFavoriteMapper, UserFavorite>
    implements UserFavoriteService{

}




