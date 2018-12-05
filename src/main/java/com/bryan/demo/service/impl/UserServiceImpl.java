package com.bryan.demo.service.impl;

import com.bryan.demo.dal.dao.UserMapper;
import com.bryan.demo.dal.entity.UserDO;
import com.bryan.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public UserDO findById(Long id) {

        UserDO userDO = userMapper.findById(1L);
        //return "welcome bryan!"+userDO.getNick() + " "+userDO.getAge();
        return userDO;
    }
}
