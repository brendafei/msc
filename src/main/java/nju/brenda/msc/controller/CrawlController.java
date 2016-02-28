package nju.brenda.msc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/crawl")
public class CrawlController {
    
    @RequestMapping("/process")
    public String processCrawling() {
        System.out.println("in here...");
        return "start";
    }
    
}
