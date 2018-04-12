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
     //�����firstָ�������������������
     public String getFirst() {
    	 return "firstpage";
     //firstpage��ʵ��������jsp
     }
     
     @RequestMapping("/this")
     public String mymain(HttpSession session) {
    	 String uname="u";
    	 session.setAttribute("uname", uname);
		return "";	 
     } 
     //��������
     @RequestMapping("/that")
     public String mydemo(@SessionAttribute("uname") String uname) {
    	 System.out.println(uname);
		return "";	 
     }
     //����
     
     @RequestMapping("/ajaxdemo")
     public @ResponseBody User ajaxdemo(@RequestBody User u) {   	 
		System.out.println("id"+u.getUname()+"ppp");
		System.out.println("id"+u.getUpassword()+"aaa");
    	 return u;
    	 
     }
     

}

