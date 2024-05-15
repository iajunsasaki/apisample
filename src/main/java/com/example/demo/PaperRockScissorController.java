package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaperRockScissorController {
	private static List<Hand> handHistory = new ArrayList<Hand>();
	
	@GetMapping("/")
	@CrossOrigin
	public Hand index(Model model) {
		Hand hand = PaperRockScissor.playPaperRockScissor();
		System.out.println(hand);
		handHistory.add(hand);
		return hand;
	}

	@GetMapping("/history")
	@CrossOrigin
	public List<Hand> history(Model model) {
		return handHistory;
	}
}
