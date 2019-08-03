package com.ergou.gittest.gittest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 程二狗
 * @since 2019/8/3 0003 11:24
 */

@RestController
public class UserController {
    @RequestMapping("/git")
    public String sayGit(){
        return  "hello git";
    }
}
