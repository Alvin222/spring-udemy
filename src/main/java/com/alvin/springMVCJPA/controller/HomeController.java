package com.alvin.springMVCJPA.controller;

import com.alvin.springMVCJPA.model.Alien;
import com.alvin.springMVCJPA.repository.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController
{

    @Autowired
    private AlienRepo repo;

    @RequestMapping("/")
    public String home()
    {
        return "index";
    }

    @GetMapping("/getAliens")
    public String getAliens(Model model){
        model.addAttribute("result",repo.findAll());
        return "showAliens.jsp";
    }

    @GetMapping("/getAlien")
    public String getAlien(@RequestParam int aid,Model model){
        Alien alien = repo.getOne(aid);
        model.addAttribute(alien);
        return "result";
    }

    @GetMapping("/getalienbyname")
    public String getAlien(@RequestParam String aname,Model model){
        Alien alien = repo.findByAname(aname);
        model.addAttribute(alien);
        return "result";
    }

    @PostMapping("/addAlien")
    public String addAlien(@ModelAttribute Alien alien){
        repo.save(alien);
        return "result";
    }
}