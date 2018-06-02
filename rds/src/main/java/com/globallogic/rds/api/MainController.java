package com.globallogic.rds.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping(path="/rutadelsoftware")
	public @ResponseBody String getAllUsers() {
		return "aplicacion corriendo :)";
	}
}
