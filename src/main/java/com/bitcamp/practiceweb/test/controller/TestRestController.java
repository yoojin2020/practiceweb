package com.bitcamp.practiceweb.test.controller;

import com.bitcamp.practiceweb.test.vo.TestVo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestRestController {

    @RequestMapping(value = "/testValue", method = RequestMethod.GET)
    public String getTestValue() {
        String TestValue = "레스트 컨트롤러 테스트";
        return TestValue;
    }

    @RequestMapping("/test")
    public ModelAndView test() throws Exception {
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "yoojin");
        List<String> testList = new ArrayList<String>();
        testList.add("a");
        testList.add("b");
        testList.add("c");
        mav.addObject("list", testList);
        return mav;
    }

}
