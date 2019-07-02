package com.lwy.hust.Controller;

import com.lwy.hust.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class usercontroller {

    @Autowired
    private UserService userService;


}
