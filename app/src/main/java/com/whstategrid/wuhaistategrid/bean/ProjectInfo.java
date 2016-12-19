package com.whstategrid.wuhaistategrid.bean;

public class ProjectInfo implements ChooseInfo{
	public String classify;
	public String[] name;
	public	String number;
	public boolean isChoose = false;
	public boolean isChoose2 = false;
	public ProjectInfo(String classify, String[] name, String number) {
		super();
		this.classify = classify;
		this.name = name;
		this.number = number;
	}

}
