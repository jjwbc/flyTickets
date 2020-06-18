package com.zx.back.web.controller;import com.zx.back.model.Flight;import com.zx.back.service.IflightService;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Controller;import org.springframework.ui.Model;import org.springframework.web.bind.annotation.RequestMapping;import javax.servlet.http.HttpSession;import java.util.List;@Controller@RequestMapping("flight")public class FlightController {    @Autowired    private IflightService iflightService;    //接收参数查询航班    @RequestMapping("flysearch")    public String search(String fBegin, String fEnd, String sTime, Model model, HttpSession session) {//      System.out.println(fBegin + fEnd + sTime);//      System.out.println(user);        List<Flight> flights = iflightService.findByAddrTime(fBegin, fEnd, sTime);        model.addAttribute("flights", flights);        return "flylist";    }    @RequestMapping("queryfly")    public String login() {        return "flysearch";    }}