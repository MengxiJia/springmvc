package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MytestController {
       @RequestMapping("/demo")
       public String mytest(HttpServletRequest req) {
    	   String id=req.getParameter("myname");
    	   System.out.println(id);
    	   return "new";
       }
       
       @RequestMapping("/demo2")
       public String mytest2(int id) {
    	   System.out.println("id:"+id);
    	   return "new";
       }
       
       @RequestMapping("/demo3")
       public String mytest3(@RequestParam(value="myname")String name) {
    	   System.out.println("id:"+name);
    	   return "new";
       }
       
       @RequestMapping(value="/demo4/{id}")
       public String mytest4(@PathVariable("id") int id) {
    	   System.out.println("id:"+id);
    	   return "new";
       }

       //×¢ÒâµÇÂ½µÄÁ´½Ó
       
      
}
