package com.teamb.shareoffice.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@RequestMapping("test")
	public String test() {
		
		return "member/test";
	}
}
