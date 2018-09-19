package com.mcnz.rps.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	
	
	@GetMapping("/playagame")
	public String playGame(@RequestParam(name="choice",required=false)
								String theChoice,
									Model model) {
		
		if (theChoice == null) {
			return "index";
		}
		
		String theOutcome = "error";
		if (theChoice.equals("rock")) {theOutcome= "tie";}
		if (theChoice.equals("scissors")) {theOutcome= "loss";}
		if (theChoice.equals("paper")) {theOutcome= "win";}
		
		model.addAttribute("outcome", theOutcome);
		return "results";
	}

}





