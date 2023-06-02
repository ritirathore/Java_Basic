package com.wiley.bookpub.controller;

import com.wiley.bookpub.dao.SkillDAOImpl;
import com.wiley.bookpub.model.Skillstore;

public class SkillController {


	SkillDAOImpl impl= new SkillDAOImpl();
	public int addSkill(int id, String bookname, String author, int edition, int isbn) {
		Skillstore skill= new Skillstore(id,bookname,author, isbn, edition);
				return impl.addSkill(skill);
	}
}
