package com.falah.springMVC.models;

public class Dragon {
	
	private String dragonName;
	private String dragonElement;
	private int atk;
	private int def;
	private int hp;
	
	public Dragon() {
		super();
	}
	
	public Pokemon(String dragonName, String dragonElement, int atk, int def, int hp) {
		super();
		this.dragonName = dragonName;
		this.dragonElement = dragonElement;
		this.atk = atk;
		this.def = def;
		this.hp = hp;
	}
	
	public String getDragonName() {
		return dragonName;
	}
	public void setDragonName(String dragonName) {
		this.dragonName = dragonName;
	}
	public String getDragonElement() {
		return dragonElement;
	}
	public void setDragonElement(String dragonElement) {
		this.dragonElement = dragonElement;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	

}
