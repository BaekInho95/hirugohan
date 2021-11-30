package hirugohan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ChoiceMenu {
	public ArrayList<Menu> menuArray = new ArrayList<>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void addMenu() throws Exception {
		System.out.println("******************************************");
		System.out.println("식당 추가하기");
		System.out.println("******************************************");
		System.out.print("식당 종류: ");
		String genre = br.readLine();
		System.out.print("식당 위치: ");
		String location = br.readLine();
		System.out.print("식당 이름: ");
		String name = br.readLine();
		System.out.print("식당 평점: ");
		int score = Integer.parseInt(br.readLine());

		Menu menuArray = new Menu(genre, location, name, score);

		System.out.println("식당 정보를 추가했습니다.");
		Thread.sleep(1000);
	}

	public void deleteMenu() throws Exception {

		for (int i = 0; i < menuArray.size(); i++) {
				System.out.println((i + 1) + "번. 종류:" + menuArray.get(i) + " 위치:" + menuArray[i].getLocation()
						+ " 이름:" + menuArray[i].getName() + " 평점 :" + menuArray[i].getScore());
			
		}

		System.out.print("지우고 싶은 식당의 번호를 입력해주세요.");
		int num = Integer.parseInt(br.readLine());

		menuArray[num - 1] = null;

		System.out.println("삭제 완료");
		Thread.sleep(1000);

	}

	public void modificationMenu() throws Exception {
		for (int i = 0; i < menuArray.length; i++) {
			if (menuArray[i] != null) {
				System.out.println((i + 1) + "번. 종류:" + menuArray[i].getGenre() + " 위치:" + menuArray[i].getLocation()
						+ " 이름:" + menuArray[i].getName() + " 평점 :" + menuArray[i].getScore());
			}
		}

		System.out.print("수정하고 싶은 식당의 번호를 입력해주세요.");
		int num = Integer.parseInt(br.readLine());

		Menu menu = null;
		int menuNum = 0;
		menuNum = (num - 1);
		menu = menuArray[menuNum];

		System.out.println(
				(menuNum + 1) + "번. 종류:" + menuArray[menuNum].getGenre() + " 위치:" + menuArray[menuNum].getLocation()
						+ " 이름:" + menuArray[menuNum].getName() + " 평점 :" + menuArray[menuNum].getScore());

		System.out.println("수정할 사항을 입력해주세요.");

		System.out.print("종류를 입력해주세요.");
		String genre = br.readLine();
		System.out.print("위치를 입력해주세요.");
		String location = br.readLine();
		System.out.print("이름를 입력해주세요.");
		String name = br.readLine();
		System.out.print("평점를 입력해주세요.");
		int score = Integer.parseInt(br.readLine());

		menuArray[menuNum] = new Menu(genre, location, name, score);

		System.out.println("수정 완료");

	}

	public void MenuList() throws Exception {
		System.out.println("1 or 2번을 누르면 식당을 나열합니다.");
		// System.out.println("1. 음식 종류별로 보기(공사중)");
		// System.out.println("2. 식당 평점별로 보기");

		int num = Integer.parseInt(br.readLine());

		switch (num) {
		case 1:
			System.out.println("식당 목록을 나열합니다.");
			for (int i = 0; i < menuArray.length; i++) {
				if (menuArray[i] != null) {
					System.out
							.println((i + 1) + "번. 종류:" + menuArray[i].getGenre() + " 위치:" + menuArray[i].getLocation()
									+ " 이름:" + menuArray[i].getName() + " 평점 :" + menuArray[i].getScore());
				}
			}
			break;
		/*
		 * System.out.println("음식 종류별로 나열합니다.");
		 * 
		 * for (int i = 0; i < menuArray.length; i++) { if (menuArray[i] != null) {
		 * System.out .println((i + 1) + "번. 종류:" + menuArray[i].getGenre() + " 위치:" +
		 * menuArray[i].getLocation() + " 이름:" + menuArray[i].getName() + " 평점 :" +
		 * menuArray[i].getScore()); } }
		 */
		case 2:
			/*
			 * System.out.println("평점순으로 나열합니다.");
			 * 
			 * Menu menu = null; try { for (int i = 0; i < menuArray.length; i++) { if
			 * (menuArray[i].getScore() > menuArray[i + 1].getScore()) { menu = menuArray[i
			 * + 1]; menuArray[i+1] = menuArray[i]; menuArray[i + 1] = menu; } } } catch
			 * (NullPointerException e) { System.out.println("NPE 발생");
			 * 
			 * } finally { System.out.println("진행"); }
			 */
			System.out.println("식당 목록을 나열합니다.");
			for (int i = 0; i < menuArray.length; i++) {
				if (menuArray[i] != null) {
					System.out
							.println((i + 1) + "번. 종류:" + menuArray[i].getGenre() + " 위치:" + menuArray[i].getLocation()
									+ " 이름:" + menuArray[i].getName() + " 평점 :" + menuArray[i].getScore());
				}
			}
			break;
		}
	}

	public void randomMenu() throws Exception {
		System.out.println("식당 랜덤 뽑기!");

		Collections.shuffle(Arrays.asList(menuArray));
		System.out.println(menuArray[0].getGenre());
	}

}
