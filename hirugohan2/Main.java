package hirugohan2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
 * 
 * 식당 정보는 ArrayList로
 * */
public class Main {
	ArrayList<Menu> list = new ArrayList<Menu>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		// 식당 목록 출력 메서드 객체 호출
		ShowMenu sm = new ShowMenu();

		// 랜덤 식당 뽑기 메서드 객체 호출
		RandomMenu rm = new RandomMenu();

		// 식당 정보 관리 메서드 객체 호출
		MenuSet ms = new MenuSet();

		boolean sw = true;
		
		while (sw) {
			System.out.println("1. 식당 찾기  || 2. 무작위 식당 뽑기 || 3. 식당 정보 관리 || 4. 종료");
			System.out.print("choice ->");

			int choice = Integer.parseInt(br.readLine());
			
			switch (choice) {
			case 1:// 식당 찾기

				System.out.println("1. 이름순으로 보기 || 2.종류별로 보기 || 3. 거리순으로 보기 || 4. 평점순으로 보기 || 5. 나가기");
				System.out.print("choice ->");
				int choice2 = Integer.parseInt(br.readLine());
				switch (choice2) {
				case 1:
					sm.NameSort();
					break;
				case 2:
					sm.GenreSort();
					break;
				case 3:
					sm.DistanceSort();
					break;
				case 4:
					sm.ScoreSort();
					break;
				case 5:
					System.out.println("메인 매뉴로 돌아갑니다.");
					choice = 1;
					break;
				default:
					System.out.println("잘 못 입력하셨습니다.");
					break;
				}
				break;
			case 2:// 무작위 식당 뽑기
				rm.RandomMethod();
				break;
			case 3:// 식당 정보 관리

				System.out.println("1. 식당 추가 || 2.식당 정보 수정 || 3. 식당 정보 삭제 || 4. 나가기");
				System.out.print("choice ->");
				int choice3 = Integer.parseInt(br.readLine());
				switch (choice3) {
				case 1:
					ms.addMenu();
					break;
				case 2:
					ms.modifMenu();
					break;
				case 3:
					ms.deleteMenu();
					break;
				case 4:
					System.out.println("메인 매뉴로 돌아갑니다.");
					choice = 1;
					break;
				default:
					System.out.println("잘 못 입력하셨습니다.");
					break;
				}
				break;
			case 4:// 종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("잘 못 입력하셨습니다.");
				break;
			}

		}
	}

}
