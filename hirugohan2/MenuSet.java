package hirugohan2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
 *
 * 식당 관리 클래스
 * 1. 식당 정보추가
 * 2. 식당 정보 수정
 * 3. 식당 정보 삭제
 * */
public class MenuSet {	
	


	//식당 정보추가
		void addMenu() throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("식당 정보를 입력합니다.");

		System.out.print("식당 이름 입력 ");
		String name = br.readLine();
		System.out.print("음식 종류 입력 (한식, 일식, 중식, 양식, 패스트푸드, 기타 中 에 적어주세요.) ");
		String genre = br.readLine();
		System.out.print("식당까지의 거리 입력 (가까움, 적당함, 멈 中 에 적어주세요.) ");
		String distance = br.readLine();
		System.out.print("식당의 평점 입력 (10점 만점으로 정수만 입력해주세요.) ");
		int score = Integer.parseInt(br.readLine());

		System.out.println("식당 정보가 입력되었습니다.");
		
		
		
		
	}

	//식당 정보 수정
	void modifMenu() {
		
	}
	
	//식당 정보 삭제
	
	void deleteMenu() {
		
	}
}
