package com.bdtravel.service;

import com.bdtravel.entity.QueryVo;
import com.bdtravel.entity.Order;
import com.bdtravel.utils.Page;

import java.util.List;

public interface OrderService {
    Page<Order> selectOrderPageByQueryVo(QueryVo vo);
    List<Order> selectOrderListByFid(String fid);
    void updateStateById(Integer id);
    void updateStateToPayById(Integer id);
    int insertOrder(Order order);
    Order getOrderByNo(String no);
}
