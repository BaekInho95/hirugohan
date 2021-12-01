package hirugohan2;
//식당 클래스
public class Menu {
	private String name;//이름
	private String genre;//종류
	private String distance;//거리
	private int score;//평점
	
	public Menu() {
	}
	
	public Menu(String name, String genre, String distance, int score) {
		this.name = name;
		this.genre = genre;
		this.distance = distance;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	

}
