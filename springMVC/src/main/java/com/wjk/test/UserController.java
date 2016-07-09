package com.wjk.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wjk on 16/7/8.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
    @RequestMapping(value = "/index")
    public ModelAndView userIndex(String username, String password) {
        ModelAndView mav = new ModelAndView("user/success");

        mav.addObject("username", username);
        mav.addObject("password", password);
        return mav;
    }

}
