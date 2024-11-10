package dev.nickowen.deploy_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TheController {
	
	@RequestMapping("/welcome")
    @ResponseBody
	public String welcome() {
		return "You did it.";
	}

}
