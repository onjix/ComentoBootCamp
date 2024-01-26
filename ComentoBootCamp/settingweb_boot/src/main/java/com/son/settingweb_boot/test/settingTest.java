package com.son.settingweb_boot.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.son.settingweb_boot.service.StatisticService;



@Controller
public class settingTest {


    @Autowired
    private StatisticService service;

    @ResponseBody
    @RequestMapping("/sqlyear")
    public Map<String, Object> sqlyear(String year) throws Exception{

        return service.yearloginNum(year);
    }

    @ResponseBody
    @RequestMapping("/sqlMonth")
    public Map<String, Object> sqlMonth(String yearMonth) throws Exception {
        return service.yearMonthloginNum(yearMonth);
    }

    @ResponseBody
    @RequestMapping("/sqlDay")
    public Map<String, Object> sqlDay(String yearMonthDay) throws Exception {
        return service.yearMonthDayloginNum(yearMonthDay);
    }

    @ResponseBody
    @RequestMapping("/sqlDayAvg")
    public Map<String, Object> sqlDayAvg() throws Exception {
        return service.dayAvgLoginNum();
    }

    @RequestMapping("/test")
    public ModelAndView test() throws Exception{
        ModelAndView mav = new ModelAndView("test");
        mav.addObject("name", "sonpj");
        List<String> resultList = new ArrayList<String>();
        resultList.add("!!!HELLO WORLD!!!");
        resultList.add("설정 TEST!!!");
        resultList.add("설정 TEST!!!");
        resultList.add("설정 TEST!!!!!");
        resultList.add("설정 TEST!!!!!!");
        mav.addObject("list", resultList);
        return mav;
    }

}