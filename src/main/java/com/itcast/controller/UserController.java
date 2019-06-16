package com.itcast.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itcast.model.User;
import com.itcast.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by Jie on 2019/6/16.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public void findById(HttpServletRequest request, HttpServletResponse response) throws Exception {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            long userid = Long.parseLong(request.getParameter("id"));
            User user = userService.findById(userid);
            ObjectMapper mapper = new ObjectMapper();
            response.getWriter().write(mapper.writeValueAsString(user));
            response.getWriter().close();
    }

}
