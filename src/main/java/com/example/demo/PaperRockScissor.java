package com.example.demo;

import java.util.Random;

public class PaperRockScissor {
	public static Hand playPaperRockScissor() {
		Random random = new Random();
		int hand = random.nextInt(1, 4);
		Hand result = new Hand();
		// 1 -> グー
		// 2 -> チョキ
		// 3 -> パー
		if (hand == 1) {
			result.setHand("グー");
		}
		else if (hand == 2) {
			result.setHand("チョキ");
		}
		else if (hand == 3) {
			result.setHand("パー");
		}
		
		return result;
	}
}
