package controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
     @ResquestMapping("/first")
     public String getFirst() {
    	 return "firstpage";
     }
}

