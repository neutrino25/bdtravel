package com.bdtravel.service;

import com.bdtravel.entity.QueryVo;
import com.bdtravel.entity.TastyFood;
import com.bdtravel.utils.Page;

import java.util.List;

public interface FoodService {
    List<TastyFood> selectFoodList();
    Page<TastyFood> selectFoodPageByQueryVo(QueryVo vo);
    //新增
    void addFood(TastyFood tastyFood);
    void deleteById(Integer id);
    int updateFood(TastyFood tastyFood);
    TastyFood getFoodById(Integer id);
}
