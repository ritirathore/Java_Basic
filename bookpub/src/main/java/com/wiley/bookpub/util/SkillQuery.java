package com.wiley.bookpub.util;

public class SkillQuery {

	public static String addSkill= "Insert into skillstore values(?,?,?,?,?)";
	public static String viewAllSkills= "select * from skillstore order by book_name";
}
