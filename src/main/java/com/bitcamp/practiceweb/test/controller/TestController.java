package com.bitcamp.practiceweb.test.controller;

import com.bitcamp.practiceweb.test.service.TestService;
import com.bitcamp.practiceweb.test.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    @RequestMapping(value = "/home")
    public String home(){

        return "index.html";
    }

    @ResponseBody
    @RequestMapping("/valueTest")
    public String valueTest(){
        String value = "테스트 String";
        return value;
    }

    @RequestMapping("/thymeleafTest")
    public String thymeleafTest(Model model) {
        TestVo testModel = new TestVo("yoojin", "유진") ;
        model.addAttribute("testModel", testModel);
        return "thymeleaf/thymeleafTest";
    }

    @Autowired
    TestService testService;

    @RequestMapping(value="/test2")
    public ModelAndView test2() throws Exception{
        ModelAndView mav = new ModelAndView("test");

        List<TestVo> testList = testService.selectTest();
        mav.addObject("list", testList);

        return mav;
    }
}
