package com.game;

public class Main {

	public static void main(String[] args) {
		
		Player1 player = new Player1("bhargav","sword", 100);
		
//		System.out.println(player.getName());
//		System.out.println(player.getWeapon());
//		System.out.println(player.getHealth());
		
		
		Player2 beerlayer = new Player2("mnjal","mhine", 100, false);
		
		beerlayer.damageByGun1();
		beerlayer.damageByGun2();
		beerlayer.Heal();
		beerlayer.damageByGun1();

	}

}
