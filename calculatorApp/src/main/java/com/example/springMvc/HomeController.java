package com.example.springMvc;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }


    @RequestMapping("/compound")     //to map /compound request in url
    public ModelAndView compInterest(@RequestParam("p") int p, @RequestParam("r") int r, @RequestParam("t") int t, @RequestParam(value = "i", required = false) String i,ModelAndView mv){
        double result = (p * (Math.pow(1 + r / 100.0, t) - 1))+p;
        mv.addObject("result", result);
        mv.setViewName("result.jsp");
        return mv;
    }

    @RequestMapping("/simple")     //to map /simple request in url
    public ModelAndView simpInterest(@RequestParam("p") int p, @RequestParam("r") int r, @RequestParam("t") int t, @RequestParam(value = "i", required = false) String i,ModelAndView mv){
        double result=(p*r*t)/100+p;
        mv.addObject("result",result);  //added value of result attribute as result
        mv.setViewName("result.jsp");
        return mv;
    }


}
