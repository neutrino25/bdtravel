package com.bdtravel.dao;

import com.bdtravel.entity.QueryVo;
import com.bdtravel.entity.Order;

import java.util.List;

public interface OrderMapper {
    List<Order> selectOrderList(String id);
    //总条数
    Integer postCountByQueryVo(QueryVo vo);
    //结果集
    List<Order> selectPostListByQueryVo(QueryVo vo);

    int updateStateById(Integer id);

    void updateStateToPayById(Integer id);

    int insertOrder(Order order);

    Order getOrderByNo(String no);
}
