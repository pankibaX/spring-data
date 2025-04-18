package com.pankiba.jpashowcase.domain;

public enum Grade {

	Developer(1001, "Developer"), Lead(1002, "Lead"), Architect(1003, "Architect"), Intern(1004, "Intern"),
	Senior_Developer(1005, "Senior Developer"), Lead_Developer(1006, "Lead Developer"), Manager(1007, "Manager"),
	Analyst(1008, "Analyst");

	private final int levelCode;
	private final String level;

	Grade(int levelCode, String level) {
		this.levelCode = levelCode;
		this.level = level;
	}

	public int getLevelCode() {
		return this.levelCode;
	}

	public String getLevel() {
		return level;
	}
}
