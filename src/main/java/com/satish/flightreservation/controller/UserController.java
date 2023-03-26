package com.satish.flightreservation.controller;

import com.satish.flightreservation.entity.User;
import com.satish.flightreservation.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserRepository repository;

    @RequestMapping("/showReg")
    public String showRegistrationPage() {
        return "login/RegisterUser";
    }

    @RequestMapping(value = "registerUser",method = RequestMethod.GET)
    public String register(){
        return "login/LoginUser";
    }

    @RequestMapping(value = "registerUser",method = RequestMethod.POST)
    public String register(@ModelAttribute("user") User user, ModelMap modelMap){
        repository.save(user);
        modelMap.addAttribute("email",user.getEmail());
        return "login/LoginUser";
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(@RequestParam("email") String email,@RequestParam("password") String password,ModelMap modelMap){
        User user=repository.findByEmail(email);
        if(user.getPassword().equals(password)){
            return "FindFlight";
        }else{
            modelMap.addAttribute("msg","Invalid username or password!!");
        }
        return "login/LoginUser";
    }

}
