package org.itstep.myWebApp.web;

import org.itstep.myWebApp.model.User;
import org.itstep.myWebApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by student on 13.03.2017.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getAll(Model model){
        List<User> user = userService.getAll();
        model.addAttribute("userList", user);
        return "userList";
    }

    @RequestMapping(value = "/users/update", method = RequestMethod.GET)
    public String getUserId(HttpServletRequest req)
    {
        Integer userId = Integer.valueOf(req.getParameter(("id")));
        User user = userService.getById(userId);
        req.setAttribute("user", user);
        return "editUser";
    }

    @RequestMapping(value = "users/delete", method = RequestMethod.GET)
    public String  delete(HttpServletRequest req)
    {
        Integer userId = Integer.valueOf(req.getParameter("id"));
        userService.delete(userId);
        return "userList";
    }

    @RequestMapping(value = "users/create", method = RequestMethod.POST)
    public String crete(HttpServletRequest req)
    {
        String userId = req.getParameter("id");
        User user = userId.isEmpty() ? new User() : userService.getById(Integer.valueOf(userId));
        user.setName(req.getParameter("name"));
        user.setLastname(req.getParameter("lastname"));
        user.setCity(req.getParameter("city"));
        user.setEmail(req.getParameter("email"));

        userService.save(user);
        return "userList";
    }

}
