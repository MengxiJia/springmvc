package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
     @RequestMapping("/first")
     //�����firstָ�������������������
     public String getFirst() {
    	 return "firstpage";
     //firstpage��ʵ��������jsp
     }
}

