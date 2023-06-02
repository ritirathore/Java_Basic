package com.wiley.bookpub.view;

import java.util.Scanner;

import com.wiley.bookpub.controller.SkillController;

public class SkillView {

	public static void addSkill() {
		Scanner sc= new Scanner(System.in);
		
		SkillController scCtrl= new SkillController();
		int result= scCtrl.addSkill(0, null, null, 0,0);
		
	}
}
