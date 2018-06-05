package com.java2.mazegame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MazeMain {
	public MazeMain(){
		try {
			FileReader fr = new FileReader("maze.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String[] map = line.split(",");
			int col = Integer.parseInt(map[0]);
			int row = Integer.parseInt(map[1]);
			line= br.readLine();
			int trapCount = Integer.parseInt(line);
			Maze m = new Maze(row, col, trapCount);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}
	public static void main(String[] args) {
		new MazeMain();
	}

	class Maze {
		int row, col;
		int trapCount;
		int[] traps;
		Player player;

		public Maze(int row, int col, int trapCount) {
			super();
			this.row = row;
			this.col = col;
			this.trapCount = trapCount;

		}
		
	}
	class Player{
		int hp=100;
		int postition = 0;
	}
}