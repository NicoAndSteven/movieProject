package com.coco.movieproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coco.movieproject.entity.Movie;
import com.coco.movieproject.service.MovieService;
import com.coco.movieproject.mapper.MovieMapper;
import org.springframework.stereotype.Service;

/**
* @author 86178
* @description 针对表【t_movies】的数据库操作Service实现
* @createDate 2024-10-15 20:59:52
*/
@Service
public class MovieServiceImpl extends ServiceImpl<MovieMapper, Movie>
    implements MovieService{

}




