package io.ssc.antiquestore.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

    @RequestMapping("/home")
    public String getHome(Model model) {
        model.addAttribute("message", "Welcome to Artifacts, the merchant solution for antique stores.");

        return "home";
    }
}
