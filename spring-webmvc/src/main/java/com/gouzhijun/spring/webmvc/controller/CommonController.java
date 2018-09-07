package com.gouzhijun.spring.webmvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 通用的测试controller的页面
 * Created by gouzhijun
 * on 2018/5/31
 */
@Controller
@RequestMapping("/")
public class CommonController {

    private static final Logger LOGGER = Logger.getLogger(CommonController.class);

    @RequestMapping("myService")
    public void getMyService(HttpServletRequest request, HttpServletResponse response) throws IOException {
        LOGGER.info("myService start");
        PrintWriter printWriter =  response.getWriter();
        printWriter.print("this is myService");
        printWriter.flush();
        printWriter.print("this is second request");
        printWriter.flush();
        LOGGER.info("myService end");
    }
}
