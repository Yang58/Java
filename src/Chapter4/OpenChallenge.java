package Chapter4;

import java.util.Scanner;

class Player {
	Scanner sc = new Scanner(System.in);
	public static String word ;
	String name;
	String answer;
	int re_count = 3;

	public Player() {
		System.out.print("참가자의 이름을 입력해주세요 > ");
		name = sc.next();
		sc.nextLine();
	}

	public void getWordFromUser() {
		System.out.print(this.name + " >> ");
		answer = sc.next();
		sc.nextLine();
	}
	
	public boolean re_count() {
		re_count --;
		if(re_count == 0) {
			return false;
		}else {
			return true;
		}
	}
	
	public void startWord(String word) {
		Player.word = word;
	}

	public void setWord() {
		word = this.answer;
	}

	public boolean checkedSuccess() {
		int lastIndex = word.length() - 1;
		char lastChar = word.charAt(lastIndex);
		char firstChar = answer.charAt(0);

		if (lastChar == firstChar) {
			return true;
		} else {
			System.out.println(name + "이 졌습니다.");
			return false;
		}
	}

}

public class OpenChallenge {
	static Scanner sc = new Scanner(System.in);

	public static void run() {
		System.out.println("끝말잇기 게임을 시작합니다 ...");
		System.out.print("게임에 참가하는 인원은 몇명입니까 ? ");
		int playerNum = sc.nextInt();
		
		Player[] p = new Player[playerNum];

		for (int i = 0; i < p.length; i++) {
			p[i] = new Player();
		}
		int start_player = (int)(Math.random()*playerNum);
		
		System.out.print(p[start_player].name + "님 시작 단어를 정해주세요 >> ");
		String word = sc.next();
		p[start_player].startWord(word);
		System.out.println("시작하는 단어는 " + Player.word + " 입니다. ");
		sc.nextLine();
				
		Loop: while (true) {
			for (int i = 0; i < playerNum; i++) {
				p[i].getWordFromUser();
				if (p[i].checkedSuccess()) {
					p[i].setWord();
				}  else {
					
					labal: while(true) {
						System.out.println("다시 하시겠습니까 ? (네 / 아니요)");
						String re = sc.next();
						if (re.equals("네")) {
							if(!p[i].re_count()) {
								System.out.println( p[i].name + "님 기회를 전부 소진하였습니다. ");
								break Loop;
							}
							System.out.println(p[i].name + "님 재도전 기회가 [" + p[i].re_count +"]번 남으셨습니다. ");
							System.out.println("마지막 단어는 " + Player.word + " 입니다. ");
							continue Loop;
						} else if (re.equals("아니요")) {
							System.out.println("게임을 종료합니다. ");
							break Loop;
						}else {
							System.out.println("Y 또는 N 을 입력해주세요");
							continue labal;
						}
						
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run();
	}

}
