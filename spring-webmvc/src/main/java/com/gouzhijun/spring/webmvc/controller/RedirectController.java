package com.gouzhijun.spring.webmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * 测试Spring的RedirectController
 * Created by gouzhijun
 * on 2018/6/1
 */
@Controller
public class RedirectController {

    @GetMapping("/postRequest")
    @ResponseBody
    public String postRequest(RedirectAttributes redirectAttributes, HttpServletResponse response) throws IOException{
        redirectAttributes.addFlashAttribute("message", "gouzhijun");
        response.sendRedirect("/getRequest");
        return "redirect:/getRequest";
    }

    @GetMapping("/getRequest")
    @ResponseBody
    public String getRequest(String message) {
        return "result : " + message;
    }
}
