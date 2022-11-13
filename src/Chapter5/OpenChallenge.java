package Chapter5;

import java.util.Scanner;

abstract class GameObject {
   protected int distance; // 캐릭터의 이동 거리
   protected int x, y; // 현재 위치

   public boolean collide(GameObject p) {
      if (this.x == p.getX() && this.y == p.getY()) {
         System.out.println("catch!");
         return true;
      } else {
         return false;
      }
   }

   protected abstract void move(); // 움직인 거리

   protected abstract char getShape(); // 곰과 물고기의 모양

   public GameObject(int distance, int x, int y) {
      this.distance = distance;
      this.x = x;
      this.y = y;
   }

   public int getDistance() {
      return distance;
   }

   public void setDistance(int distance) {
      this.distance = distance;
   }

   public int getX() {
      return x;
   }

   public void setX(int x) {
      this.x = x;
   }

   public int getY() {
      return y;
   }

   public void setY(int y) {
      this.y = y;
   }

}

class Fish extends GameObject {

   public Fish(int distance, int x, int y) {
      super(distance, x, y);
   }

   @Override
   public void move() {
      int n = (int) (Math.random() * 5);
      
      Game.map[x][y] = '-';
      
      if (n == 0) {
         x += distance;
      } else if (n == 1) {
         x -= distance;
      }

      if (x < 0) {
         x = 0;
      }
      if (x >= Game.Max_x) {
         x = Game.Max_x - 1;
      }

      n = (int) (Math.random() * 5);

      if (n == 0) {
         y += distance;
      } else if (n == 1) {
         y -= distance;
      }

      if (y < 0) {
         y = 0;
      }
      if (y >= Game.Max_y) {
         y = Game.Max_y - 1;
      }
      
      Game.map[x][y] = getShape();
   }

   @Override
   public char getShape() {
      return '@';
   }

}

class Bear extends GameObject {

   private Scanner sc;

   public Bear(int distance, int x, int y) {
      super(distance, x, y);
      sc = new Scanner(System.in);
   }

   @Override
   public void move() {
      System.out.print("a : 왼쪽   d : 오른쪽  w : 위  s : 아래   >> ");
      char c = sc.next().charAt(0);
      Game.map[x][y] = '-';
      if (c == 'w') {
         x--;
         if (x < 0) {
            x = 0;
         }
      } else if (c == 's') {
         x++;
         if (x >= Game.Max_x) {
            x = Game.Max_x - 1;
         }

      } else if (c == 'a') {
         y--;
         if (y < 0) {
            y = 0;
         }
      } else if (c == 'd') {
         y++;
         if (y >= Game.Max_y) {
            y = Game.Max_y - 1;
         }
      }
      
      Game.map[x][y] = getShape();
   }

   @Override
   public char getShape() {
      return 'B';
   }
}

class Game {
   private GameObject[] m = new GameObject[2]; // Beer Fish

   final static int Max_x = 10;
   final static int Max_y = 20;
   
   static char[][] map = new char[Max_x][Max_y];

   {
      System.out.println("========================================");
      System.out.println("===========    GAME START    ===========");
      System.out.println("========================================");
   }

   public Game() {

	  // 게임판 초기화 
      for (int i = 0; i < map.length; i++) {
         for (int j = 0; j < map[i].length; j++) {
            map[i][j] = '-';
         }
      }
      
      m[0] = new Bear(1,0,0);
      m[1] = new Fish(2,8,8);
      
   }

   private void draw() {

      System.out.println();

      for (int i = 0; i < map.length; i++) {
         for (int j = 0; j < map[i].length; j++) {
            System.out.print(" "+map[i][j]);
         }
         System.out.println();
      }
      
   }
   
   private void update() {
      
      for(int i = m.length -1 ; i >= 0 ; i--) {
         map[m[i].getX()][m[i].getY()] = m[i].getShape();
      }
   }
   
   
   public void run() {
      update();
      draw();
      
      while(true) {
         
         m[1].move();
         m[0].move();
         draw();
         
         if(m[0].collide(m[1])) {
            update();
            
            break;
         }
      }
      System.out.println("========================================");
      System.out.println("===========    GAME OVER     ===========");
      System.out.println("========================================");

      
   }
}

public class OpenChallenge {

   public static void main(String[] args) {
      
      Game g = new Game();
      g.run();

   }

}