package com.java2.mazegame;
//有一遊戲場地，長寬由執行當時決定，場地中亂數產生
//陷阱，陷阱數也由當時決定
//
//有一個玩家在這場地中，初始HP值為100，走一步消
//耗1HP，撞到邊界扣5HP，掉到陷阱裡扣20HP
//
//有個當案(maze.txt)資訊如下:
//	6,4
//	5
//	6,8,2,4,2,2,6,6,8,4,2,2,6
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MazeMain {
	public MazeMain(){
		try {
			
//			地圖大小
			FileReader fr = new FileReader("maze.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			String[] map = line.split(",");
			int col = Integer.parseInt(map[0]);
			int row = Integer.parseInt(map[1]);
//			陷阱數
			line= br.readLine();
			int trapCount = Integer.parseInt(line);
			Maze m = new Maze(row, col, trapCount);
			Random r = new Random();
			Set<String> set = new TreeSet<>();
			while (set.size() < trapCount) {
				String trap = String.valueOf(r.nextInt(24));
				set.add(trap);
			}
			Iterator it = set.iterator();
			m.traps = new int[set.size()];
			for (int a = 0; a < set.size(); a++) {
				int i = Integer.parseInt(String.valueOf(it.next()));
				m.traps[a] = i;
				System.out.println(m.traps[a]);
			}
			
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

		public int getTrapCount() {
			return trapCount;
		}

		public void setTrapCount(int trapCount) {
			this.trapCount = trapCount;
		}

		public int[] getTraps() {
			return traps;
		}

		public void setTraps(int[] traps) {
			this.traps = traps;
		}

		public Player getPlayer() {
			return player;
		}

		public void setPlayer(Player player) {
			this.player = player;
		}
		
	}
	class Player{
		int hp=100;
		int postition = 0;
	}
}