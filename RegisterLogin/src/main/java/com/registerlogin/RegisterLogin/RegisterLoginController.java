package com.registerlogin.RegisterLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterLoginController {
	@Autowired
	RegisterLoginCrudRepository myCrudRepo;

	@GetMapping(path = "/register")
	public String register() {
		return "register";
	}

	@PostMapping(path = "/register-successful")
	public String successfulRegister(RegisterLoginEntity registerEntity) {
		myCrudRepo.save(registerEntity);
		return "register-successful";
	}

	@GetMapping(path = "/login")
	public String login() {
		return "login";
	}

	@PostMapping(path = "/login-successful")
	public String successfulLogin(RegisterLoginEntity loginEntity) {
		Iterable<RegisterLoginEntity> loginInfo = myCrudRepo.findAll();
		for (RegisterLoginEntity myEntity : loginInfo) {
			if (myEntity.getUsername().equals(loginEntity.getUsername())
					&& myEntity.getPassword().equals(loginEntity.getPassword())) {
				return "login-successful";
			} else {
				return "failedlogin";
			}
		}
		return "login-successful";
	}
}
