package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
     @RequestMapping("/first")
     //里面的first指的是浏览器搜索的名字
     public String getFirst() {
    	 return "firstpage";
     //firstpage是实际搜索的jsp
     }
}

