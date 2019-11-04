package com.lgf.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: lgf
 * @Date: 2019/10/21
 * @Description: com.lgf.web.controller
 * @version: 1.0
 */
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
