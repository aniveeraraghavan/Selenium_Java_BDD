package com.ha.football;

public class League {

	public static void main(String[] args) {
		// Initialize player class and load the data
		Player p1 = new Player();
		p1.playerName = "Raina";

		Player p2 = new Player();
		p2.playerName = "Dhoni";

		Player p3 = new Player();
		p3.playerName = "Ashwin";

		Player[] players = new Player[3];
		players[0] = p1;
		players[1] = p2;
		players[2] = p3;

		Player p4 = new Player();
		p4.playerName = "Kholi";
		Player p5 = new Player();
		p5.playerName = "Mark";
		Player p6 = new Player();
		p6.playerName = "Henry";

//		Player[] players2 = new Player[3];
//		players2[0] = p4;
//		players2[1] = p5;
//		players2[2] = p6;
		Player[] players2= {p4,p5,p6};
		

		Team t1 = new Team();
		t1.teamName = "CSK";
		t1.playerArray = players;
		System.out.println(t1.teamName);
	//this below line will give only the location of the array
		System.out.println(t1.playerArray);
		// for each loop to print the player details
		for (Player tp1 : t1.playerArray) {
			System.out.println(tp1.playerName);

		}

		Team t2 = new Team();
		t2.teamName = "RCB";
		t2.playerArray = players2;
		System.out.println(t2.teamName);
		for (Player tp2 : t2.playerArray) {

			System.out.println(tp2.playerName);
		}

	}

}
