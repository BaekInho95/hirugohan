package hirugohan3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class MenuMgr {

	private ArrayList<Menu> mList;

	private static MenuMgr mgr = new MenuMgr();

	private MenuMgr() {
		mList = new ArrayList<>();
	}

	public static MenuMgr getInstance() {
		return mgr;
	}

	// 식당 추가 기능
	public void addMenu(Menu nMenu) {
		boolean find = true;
		for (Menu m : mList) {
			if (m.getName().equals(nMenu.getName())) {
				System.out.println(nMenu.getName() + ": 이미 존재하는 식당입니다.");
				find = false;
				break;
			}
		}
		if (find == true) {
			mList.add(nMenu);
			System.out.println(nMenu.getName() + ": 성공적으로 추가되었습니다.");
		}
	}

	// 식당 수정 기능
	public ArrayList<Menu> modifiMenu(String name) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Menu> temp = new ArrayList<>();
		for (Menu m : mList)
			if (m.getName().contains(name)) {
				temp.add(m);
				System.out.println("정보를 수정합니다.");
				System.out.print("이름을 입력하세요.");
				String name2 = br.readLine();
				System.out.print("종류을 입력하세요.");
				String genre = br.readLine();
				System.out.print("거리을 입력하세요.");
				String distance = br.readLine();
				System.out.print("평점을 입력하세요.");
				int score = Integer.parseInt(br.readLine());
				temp.set(0, new Menu(name2, genre, distance, score));
				int num = mList.indexOf(m);
				mList.set(num, new Menu(name2, genre, distance, score));
				System.out.println("성공적으로 수정되었습니다.");

			}
		return temp;
	}

	// 식당 삭제 기능
	public ArrayList<Menu> deleteMenu(String name) throws Exception {
		ArrayList<Menu> temp = new ArrayList<>();
		for (Menu m : mList)
			if (m.getName().contains(name)) {
				temp.add(m);
				System.out.println("삭제될 식당 : " + temp.get(0));

				int num = mList.indexOf(m);
				mList.remove(num);
				System.out.println("성공적으로 삭제되었습니다.");
				break;

			}
		return temp;
	}

	// 식당 랜덤 뽑기 기능
	public void randomMenu() {
		Random rd = new Random();
		int num = rd.nextInt(mList.size());
		for (Menu m : mList) {
			if (mList.indexOf(m) == num) {
				System.out.println("******오늘 점심은?******");
				System.out.println(mList.get(num));
				;
				System.out.println("*********************");
			}
		}
	}
	
	//이름순으로 정렬하는 클래스
	class MenuNameComparator implements Comparator<Menu>{
		@Override
		public int compare(Menu o1, Menu o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

	// 식당 이름별 조회 기능
	public ArrayList<Menu> menuByName() {
		Collections.sort(mList, new MenuNameComparator());
		ArrayList<Menu> temp = new ArrayList<>();
		for (Menu m : mList)
			temp.add(m);
		return temp;
	}
	
	//거리별 정렬
	class MenuDistanceComparator implements Comparator<Menu>{
		@Override
		public int compare(Menu o1, Menu o2) {
			return o1.getDistance().compareTo(o2.getDistance());
		}
	}
	//거리별 조회
	public ArrayList<Menu> menuByDistance() {
		Collections.sort(mList, new MenuDistanceComparator());
		ArrayList<Menu> temp = new ArrayList<>();
		for (Menu m : mList)
			temp.add(m);
		return temp;
	}
	//종류별 정렬
	class MenuGenreComparator implements Comparator<Menu>{
		@Override
		public int compare(Menu o1, Menu o2) {
			return o1.getGenre().compareTo(o2.getGenre());
		}
	}
	//거리별 조회
	public ArrayList<Menu> menuByGenre() {
		Collections.sort(mList, new MenuGenreComparator());
		ArrayList<Menu> temp = new ArrayList<>();
		for (Menu m : mList)
			temp.add(m);
		return temp;
	}
	//점수별 정렬
	class MenuScoreComparator implements Comparator<Menu>{
		@Override
		public int compare(Menu o1, Menu o2) {
			if (o1.getScore() < o2.getScore()) {
				return 1;
			} else if (o1.getScore() > o2.getScore()) {
				return -1;
			} 
			return 0;
		}
	}
	//점수별 조회
	public ArrayList<Menu> menuByScore() {
		Collections.sort(mList, new MenuScoreComparator());
		ArrayList<Menu> temp = new ArrayList<>();
		for (Menu m : mList)
			temp.add(m);
		return temp;
	}

}