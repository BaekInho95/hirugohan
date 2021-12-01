package hirugohan3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws Exception {

		ArrayList<Menu> list = new ArrayList<Menu>();

		list.add(new Menu("한식뷔페", "한식", "가까움", 8));
		list.add(new Menu("서브웨이", "양식", "나쁘지 않음", 7));
		list.add(new Menu("맥도날드", "양식", "멈", 5));
		list.add(new Menu("해동집", "한식", "가까움", 8));

		printMenu(list);
	}

	public static void printMenu(ArrayList<Menu> list) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 각종 기능을 만든 메서드들을 불러오기 위한 객체 호출
		MenuMgr service = MenuMgr.getInstance();

		// main 메서드에서 추가한 list 값이 printMenu 메서드의 매개변수가 되어 그 값을 addMenu 메서드에 매개변수로 넣어 그
		// 쪽의 arrayList에 저장한다.
		// 미리 생성한 list가 없다면 없어도 된다.
		for (Menu m : list) {
			System.out.println(m);
			service.addMenu(m);
		}

		boolean sw = true;

		while (sw) {
			System.out.println("1. 식당 찾기  || 2. 무작위 식당 뽑기 || 3. 식당 정보 관리 || 4. 종료");
			System.out.print("choice ->");

			int choice = Integer.parseInt(br.readLine());

			if (choice == 1) {
				// 식당 찾기

				System.out.println("1. 이름순으로 보기 || 2.종류별로 보기 || 3. 거리순으로 보기 || 4. 평점순으로 보기 || 5. 나가기");
				System.out.print("choice ->");
				int choice2 = Integer.parseInt(br.readLine());
					// 이름순으로 보기
				if (choice2 == 1) {
					System.out.println(service.menuByName());
					// 종류별로 보기
				} else if (choice2 == 2) {
					System.out.println(service.menuByGenre());
					// 거리순으로 보기
				} else if (choice2 == 3) {
					System.out.println(service.menuByDistance());
					// 평점순으로 보기
				} else if (choice2 == 4) {
					System.out.println(service.menuByScore());
					// 나가기
				} else if (choice2 == 5) {
					System.out.println("메인 매뉴로 돌아갑니다.");
				} else {
					System.out.println("잘 못 입력하셨습니다.");

				}

			}
			// 무작위 식당 뽑기
			else if (choice == 2) {
				service.randomMenu();

			}
			// 식당 정보 관리
			else if (choice == 3) {
				System.out.println("1. 식당 추가 || 2.식당 정보 수정 || 3. 식당 정보 삭제 || or. 나가기");
				System.out.print("choice ->");
				int choice3 = Integer.parseInt(br.readLine());
				// 식당 추가
				if (choice3 == 1) {
					System.out.println("식당 정보를 입력합니다.");

					System.out.print("식당 이름 입력 ");
					String name = br.readLine();
					System.out.print("음식 종류 입력 (한식, 일식, 중식, 양식, 패스트푸드, 기타 中 에 적어주세요.) ");
					String genre = br.readLine();
					System.out.print("식당까지의 거리 입력 (가까움, 나쁘지 않음, 멈 中 에 적어주세요.) ");
					String distance = br.readLine();
					System.out.print("식당의 평점 입력 (10점 만점으로 정수만 입력해주세요.) ");
					int score = Integer.parseInt(br.readLine());
					service.addMenu(new Menu(name, genre, distance, score));
					// 식당 정보 수정
				} else if (choice3 == 2) {
					System.out.println("식당 이름 입력 ");
					String name = br.readLine();
					service.modifiMenu(name);
					// 식당 정보 삭제
				} else if (choice3 == 3) {
					System.out.println("식당 이름 입력 ");
					String name = br.readLine();
					service.deleteMenu(name);
					// 나가기
				} else {
					System.out.println("메인 매뉴로 돌아갑니다.");
				}
			}
			// 종료
			else if (choice == 4) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);

			} else {
				System.out.println("잘 못 입력하셨습니다.");
			}

		}

	}
}
