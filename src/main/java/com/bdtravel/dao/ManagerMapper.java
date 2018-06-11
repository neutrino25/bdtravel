package com.bdtravel.dao;

import com.bdtravel.entity.Manager;

import java.util.List;

public interface ManagerMapper {
    public int insertManager(Manager manager);

    public int deleteManager(String id);

    public List<Manager> getAllManager(String name);

    public Manager confirmManager(Manager manager);
}
