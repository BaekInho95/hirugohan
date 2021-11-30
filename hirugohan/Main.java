package hirugohan;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/*
 * 점심 정하기 시뮬레이션
 * 
 * 따로 정하지 않으면 기본은 한식뷔페로 한다
 * 1. 갈 곳 정함 -> 가게 찾아봄 2. 갈 곳 못 정함 -> 한식뷔페
 * if 떡볶이 or 생선 반찬이 나오면 다른곳에 간다
 * 갈 곳을 정할 때 식당 리스트를 출력함 (카테고리별, 평점별)
 *  -> 식당 추가하기(요소 -> 종류, 이름, 위치, 별점)
 * 리스트에서 음식점에 별점을 매길 수 있다.
 * 랜덤으로 정하기 기능
 * */

public class Main {

	public static void main(String[] args) throws Exception {

		System.out.println("******************************************");
		System.out.println("****************점심 뭐 먹지?*****************");
		System.out.println("******************************************");
		System.out.println("************Made By BaekInHo**************");
		System.out.println("******************************************");
		System.out.println("******************************************");


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ChoiceMenu cm = new ChoiceMenu();

		boolean switch1 = true;
		try {
			while (switch1) {
				System.out.println("******************************************");
				System.out.println("1. 점심 먹을곳 고르기");
				System.out.println("2. 못 정하겠어요!");
				System.out.println("3. 식당 목록 관리하기");
				System.out.println("4. 랜덤 식당 뽑기");
				System.out.println("5. 종료");
				System.out.println("******************************************");
				
				int num = Integer.parseInt(br.readLine());

				switch (num) {
				case 1:
					System.out.println(num + "번 선택!");
					System.out.println("******************************************");
					cm.MenuList();
					System.out.println("******************************************");
					break;
				case 2:
					System.out.println(num + "번 선택!");
					System.out.println("******************************************");
					System.out.println("한식뷔페 가즈아");
					if (hansick() == 1) {
						continue;
					}
					break;
				case 3:
					System.out.println(num + "번 선택!");
					System.out.println("******************************************");
					System.out.println("1. 식당 추가하기");
					System.out.println("2. 식당 정보 수정하기");
					System.out.println("3. 식당 삭제하기");
					System.out.println("4. 다시 선택하기");
					System.out.println("******************************************");
					int num3 = Integer.parseInt(br.readLine());
					switch(num3) {
					case 1:
						cm.addMenu();
						break;
					case 2:
						cm.modificationMenu();
						break;
					case 3:
						cm.deleteMenu();
						break;
					case 4:
						continue;
					}
					break;
				case 4:
					cm.randomMenu();
					break;
				case 5:
					System.out.println(num + "번 선택!");
					System.out.println("******************************************");
					System.out.println("BYE BYE");
					System.out.println("******************************************");
					switch1 = false;
					break;
					
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static int hansick() throws Exception{

		int num = (int) (Math.random() * 100 + 1);
		int num2 = 0;
		if (num % 2 == 0) {
			System.out.println("그러나 아쉽게도 반찬이...");
			System.out.println("다른 식당을 찾아보자");
			Thread.sleep(1000);
			num2 = 1;
			return num2;
		} else {
			System.out.println("맛있게 먹자!");
			System.out.println("-End-");
			System.out.println("******************************************");
			System.exit(0);
			return num2;
		}

	}

}
