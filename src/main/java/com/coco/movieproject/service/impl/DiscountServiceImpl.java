package com.coco.movieproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.coco.movieproject.entity.Discount;
import com.coco.movieproject.service.DiscountService;
import com.coco.movieproject.mapper.DiscountMapper;
import org.springframework.stereotype.Service;

/**
* @author 86178
* @description 针对表【t_discounts】的数据库操作Service实现
* @createDate 2024-10-15 20:59:51
*/
@Service
public class DiscountServiceImpl extends ServiceImpl<DiscountMapper, Discount>
    implements DiscountService{

}




