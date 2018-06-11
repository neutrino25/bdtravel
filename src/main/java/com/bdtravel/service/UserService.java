package com.bdtravel.service;

import com.bdtravel.entity.QueryVo;
import com.bdtravel.entity.User;
import com.bdtravel.utils.Page;

public interface UserService {
    public User confirmUser(User user);

    public int userRegister(User user);

    public User showUserDetail(User user);

    public int updateUserInfo(User user);

    public int active(String activeCode);

    public int checkUsername(String username);

    public Page<User> selectPageByQueryVo(QueryVo vo);

    public void updateStateById(String id);
}
