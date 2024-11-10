package dev.nickowen.deploy_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TheController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "You did it.";
	}

}
