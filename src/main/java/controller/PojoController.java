package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PojoController {
	 @RequestMapping(value="/pojo1")
     public String mypojo1(Order order) {
  	   System.out.println("oaddress:"+order.getOaddress());
  	   System.out.println("odate:"+order.getOdate());
  	   return "";
  	   //order是实际指向的jsp
     }
	 
	 @RequestMapping(value="/order1")
     public String getPojo1() {
  	   return "order1";
     }
	 
	 
	 
     @RequestMapping(value="/pojo2")
     public String mypojo2(Order order) {
  	   User u = order.getUser();
  	   System.out.println("oaddress:"+order.getOaddress());
  	   System.out.println("uname:"+u.getUname());
  	   return "order2";
  	   //只需要在控制台输出 不需要转到什么页面去,所以没写跳转的页面
     }
     @RequestMapping(value="/order2")
     public String getPojo2() {
  	   return "order2";
     }
    
     
}
