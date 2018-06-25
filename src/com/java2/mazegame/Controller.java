package com.java2.mazegame;

import java.util.List;

public class Controller {
	int row;
	int col;
	int traps;
	int[] trapLocation;
	List<String> number;
	Player player = new Player();

	public Controller(int row, int col, int traps, int[] trapLocation, List<String> number) {
		this.row = row;
		this.col = col;
		this.traps = traps;
		this.trapLocation = trapLocation;
		this.number = number;
	}

	public void judgement() {
		int judgment;
		System.out.print("陷阱位置:");
		for (int i = 0; i < trapLocation.length; i++) {
			System.out.print(trapLocation[i]+"\t");
			
		}
		System.out.println(" ");
		for (int i = 0; i < number.size(); i++) {
			if (player.hp > 0) {
				judgment = 0;
				System.out.println("請輸入方向：");
				System.out.println(number.get(i));
				switch (number.get(i)) {
				case "8":
					if (player.postition / 6 == 0) {
						System.out.println("撞牆!");
						player.hp = player.hp - 5;
					} else {
						player.postition = player.postition - 6;
						for (int a = 0; a < trapLocation.length; a++) {
							if (trapLocation[a] == player.postition) {
								judgment = 1;
							}
						}
						if (judgment == 1) {
							player.hp = player.hp - 20;
						} else {
							player.hp = player.hp - 1;
						}
					}
					if (player.hp > 0) {
						System.out.println("目前位置：" + player.postition);
						System.out.println("目前血量：" + player.hp);
						break;
					} else {
						System.out.println("Game Over!");
						break;
					}
				case "2":
					if (player.postition / 6 == 3) {
						System.out.println("撞牆!");
						player.hp = player.hp - 5;
					} else {
						player.postition = player.postition + 6;
						for (int a = 0; a < trapLocation.length; a++) {
							if (trapLocation[a] == player.postition) {
								judgment = 1;
							}
						}
						if (judgment == 1) {
							player.hp = player.hp - 20;
						} else {
							player.hp = player.hp - 1;
						}
					}
					if (player.hp > 0) {
						System.out.println("目前位置：" + player.postition);
						System.out.println("目前血量：" + player.hp);
						break;
					} else {
						System.out.println("Game Over!");
						break;
					}
				case "4":
					if (player.postition % 6 == 0) {
						System.out.println("撞牆!");
						player.hp = player.hp - 5;
					} else {
						player.postition = player.postition - 1;
						for (int a = 0; a < trapLocation.length; a++) {
							if (trapLocation[a] == player.postition) {
								judgment = 1;
							}
						}
						if (judgment == 1) {
							player.hp = player.hp - 20;
						} else {
							player.hp = player.hp - 1;
						}
					}
					if (player.hp > 0) {
						System.out.println("目前位置：" + player.postition);
						System.out.println("目前血量：" + player.hp);
						break;
					} else {
						System.out.println("Game Over!");
						break;
					}
				case "6":
					if (player.postition % 6 == 5) {
						System.out.println("撞牆!");
						player.hp = player.hp - 5;
					} else {
						player.postition = player.postition + 1;
						for (int a = 0; a < trapLocation.length; a++) {
							if (trapLocation[a] == player.postition) {
								judgment = 1;
							}
						}
						if (judgment == 1) {
							player.hp = player.hp - 20;
						} else {
							player.hp = player.hp - 1;
						}
					}
					if (player.hp > 0) {
						System.out.println("目前位置：" + player.postition);
						System.out.println("目前血量：" + player.hp);
						break;
					} else {
						System.out.println("Game Over!");
						break;
					}
				default:
					break;
				}
			}
		}
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getTraps() {
		return traps;
	}

	public void setTrapCount(int traps) {
		this.traps = traps;
	}

	public int[] getTrapLocation() {
		return trapLocation;
	}

	public void setTrapLocation(int[] trapLocation) {
		this.trapLocation = trapLocation;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public List<String> getNumber() {
		return number;
	}

	public void setNumber(List<String> number) {
		this.number = number;
	}

}
