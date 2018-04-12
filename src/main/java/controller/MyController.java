package controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class MyController {
     @RequestMapping("/first")
     //里面的first指的是浏览器搜索的名字
     public String getFirst() {
    	 return "firstpage";
     //firstpage是实际搜索的jsp
     }
     
     @RequestMapping("/this")
     public String mymain(HttpSession session) {
    	 String uname="u";
    	 session.setAttribute("uname", uname);
		return "";	 
     } 
     //建立对象
     @RequestMapping("/that")
     public String mydemo(@SessionAttribute("uname") String uname) {
    	 System.out.println(uname);
		return "";	 
     }
     //发送
     
     @RequestMapping("/ajaxdemo")
     public @ResponseBody User ajaxdemo(@RequestBody User u) {   	 
		System.out.println("id"+u.getUname()+"ppp");
		System.out.println("id"+u.getUpassword()+"aaa");
    	 return u;
    	 
     }
     

}

