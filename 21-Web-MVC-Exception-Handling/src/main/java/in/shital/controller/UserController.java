package in.shital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/user")
	public String getWishMsg(Model model) {
		String msg1="Welcome here...";
		String s=null;
		s.length();
		model.addAttribute("msg", msg1);
		return "index";
	}
}
