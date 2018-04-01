package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PojoController {
	 @RequestMapping(value="/pojo1")
     public String mypojo1(Order order) {
  	   System.out.println("oaddress:"+order.getOaddress());
  	   System.out.println("odate:"+order.getOdate());
  	   return "order";
  	   //order是实际指向的jsp
     }
	 
  
     @RequestMapping(value="/pojo2")
     public String mypojo2(Order order) {
  	   User u =order.getUser();
  	   System.out.println("oaddress:"+order.getOaddress());
  	   System.out.println("uname:"+u.getUname());
  	   return "order2";
     }
}
