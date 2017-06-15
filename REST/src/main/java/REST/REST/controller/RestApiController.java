package REST.REST.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/start/")
public class RestApiController {
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String hello() {
		return "Hello!";
	}

}
