package com.example.demo;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/carform")
    public String loadTvForm(Model model){
        model.addAttribute("cardes", new Car());
        return "carform";
    }
    @PostMapping("/carform")
    public String processTvForm(@Valid Car cardes,
                                BindingResult result){
        if (result.hasErrors()){
            return "carform";
        }
        return "cardesconfirm";
    }
}
