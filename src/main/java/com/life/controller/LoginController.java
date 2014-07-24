package com.life.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.life.entity.LoginStatus;

/**
 * Login Controller<br>
 * @author Henrybit
 * @version 1.0
 * @since 2014/07/24
 */
@RestController
public class LoginController {
	
	/**
	 * handle Get or Post request for /login by returning a new instance of the {@link com.life.entity.LoginStatus LoginStatus} class<br>
	 * @param name email or phone
	 * @param passwd
	 * @param identifyingCode
	 * @return
	 */
	@RequestMapping("/login")
	public LoginStatus login(@RequestParam(value="loginName", required=true) String name, 
			@RequestParam(value="password",required=true) String passwd, 
			@RequestParam(value="identifyingCode",required=false) String identifyingCode) {
		return new LoginStatus();
	}
	
	public LoginStatus validLogin() {
		return new LoginStatus();
	}
	
	@RequestMapping("/logout")
	public LoginStatus logout() {
		return new LoginStatus();
	}
}
