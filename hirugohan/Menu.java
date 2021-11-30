package hirugohan;

/*
 *
 * 필드 : 종류, 위치, 이름, 별점
 * */
public class Menu {
	private String genre;
	private String location;
	private String name;
	private int score;

	public Menu(String genre, String location, String name, int score) {
		this.genre = genre;
		this.location = location;
		this.name = name;
		this.score = score;
	}
	
	

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}



}
