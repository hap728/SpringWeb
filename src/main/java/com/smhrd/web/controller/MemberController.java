package com.smhrd.web.controller;

import com.smhrd.web.dto.Cloud_Member;
import com.smhrd.web.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberService service;

    @GetMapping("/")
    public  String index(Model model){

        List<Cloud_Member> list = service.memberList();
        model.addAttribute("list", list);


        return "index";
    }

}
