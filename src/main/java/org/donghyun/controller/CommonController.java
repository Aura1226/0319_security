package org.donghyun.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class CommonController {
	
	@GetMapping("/accessError")
	public void accessDenied(Authentication auth, Model model) {//model에 자동으로 들어간다?
		
		log.error("--------------------------");
		log.error(auth);
		model.addAttribute("msg", "권한이 없는 사용자입니다.");
		
	}
	
	@GetMapping("/customLogin")
	public void loginPage(String error, String logout, Model model) {
		
		
		log.info("error:" + error);
		log.info("logout:"+ logout);
		
		//logout
		if(logout != null) {
			model.addAttribute("logout", "Logout!!");
		}
	}

	
	@GetMapping("/customLogout")
	public void customLogout() {
		
	}
}
