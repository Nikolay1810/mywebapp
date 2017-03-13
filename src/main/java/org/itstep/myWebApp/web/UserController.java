package org.itstep.myWebApp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by student on 13.03.2017.
 */
@Controller
public class UserController {

    @Autowired


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getAll(Model model){
        //model.addAllAttributes("user", service);
        return "userList";
    }

}
