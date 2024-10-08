package org.hdcola.carnet.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/buyer")
    public String buyer() {
        return "index";
    }

    @GetMapping("/seller")
    public String seller() {
        return "index";
    }
    
}
