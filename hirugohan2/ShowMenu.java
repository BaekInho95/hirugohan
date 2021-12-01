package hirugohan2;
/*
 * 식당 목록 출력 클래스
 * 1. 이름순 출력
 * 2. 종류별 출력
 * 3. 거리순 출력
 * 4. 평점순 출력
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShowMenu {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//이름순 출력
	void NameSort() throws Exception {
		
		Menu m = new Menu();
		System.out.println("식당 리스트를 출력합니다.");
		System.out.println(m.getName().length());
		/*
		for(int i = 0; i<ms.list.size(); i++) {
			System.out.println("이름 : " + ms.list.get(i).getName() + " || 종류 : " + ms.list.get(i).getGenre()
					+ " || 거리 : " + ms.list.get(i).getDistance() + " || 평점 : " + ms.list.get(i).getScore());
		}
		*/
		
	}
	
	//종류별 출력
	void GenreSort() {
		
	}
	
	//거리순 출력
	void DistanceSort() {
		
	}
	
	//평점순 출력
	void ScoreSort() {
		
	}

}
