package com.example.demo;

import java.util.Date;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaperRockScissorController {
	@GetMapping("/")
	@CrossOrigin
	public Hand index(Model model) {
		Hand hand = PaperRockScissor.playPaperRockScissor();
		model.addAttribute("title", "じゃんけんポン！!!!!");
		model.addAttribute("msg", hand);
		model.addAttribute("time", new Date());
		System.out.println(hand);
		return hand;
	}

}
