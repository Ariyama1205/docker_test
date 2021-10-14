package com.bk.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


/**
 * @author shengyong.huang
 * @date 2020-12-24
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/bk/")
public class ApiEntityController {

    @GetMapping("/test")
    public Boolean getTagTreeData() {
        return Boolean.TRUE;
    }

}
