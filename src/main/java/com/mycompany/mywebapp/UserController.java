package com.mycompany.mywebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.mycompany.mywebapp.user.User;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private com.mycompany.mywebapp.user.UserService service;

    @GetMapping("/users")
    public String showUserList(Model model) {
        List<User> listUsers = service.listAll();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }
}