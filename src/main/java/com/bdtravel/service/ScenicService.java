package com.bdtravel.service;

import com.bdtravel.entity.QueryVo;
import com.bdtravel.entity.Scenic;
import com.bdtravel.utils.Page;

import java.util.List;

public interface ScenicService {
    List<Scenic> selectScenicList();
    Page<Scenic> selectPageByQueryVo(QueryVo vo);
    //新增
    void addScenic(Scenic scenic);
    public void deleteById(Integer id);
    int updateScenic(Scenic scenic);
    Scenic getScenicById(Integer id);
    int updateScenicSales(Integer id);
}
