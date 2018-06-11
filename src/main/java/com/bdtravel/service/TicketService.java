package com.bdtravel.service;

import com.bdtravel.entity.QueryVo;
import com.bdtravel.entity.Ticket;
import com.bdtravel.utils.Page;

import java.util.List;

public interface TicketService {
    Page<Ticket> selectTicketPageByQueryVo(QueryVo vo);
    List<Ticket> selectTicketListByFid(Integer fid);
    double selectPriceByFid(Integer fid);
    void deleteById(Integer id);
    void addTicket(Ticket ticket);
    int updateTicket(Ticket ticket);
    Ticket getTicketById(Integer id);
}
