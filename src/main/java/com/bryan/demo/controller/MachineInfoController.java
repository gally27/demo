package com.bryan.demo.controller;

import com.bryan.demo.dal.dao.UserMapper;
import com.bryan.demo.dal.entity.UserDO;
import com.bryan.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MachineInfoController {

    @Autowired
    UserService userService;

    @RequestMapping("/getMachineInfo")
    String getMachineInfo() {
        return "Hello World!";
    }

    @RequestMapping("/")
    @ResponseBody
    String homePage() {
        UserDO userDO = userService.findById(1L);
        return "welcome bryan!"+userDO.getNick() + " "+userDO.getAge();
    }
}
