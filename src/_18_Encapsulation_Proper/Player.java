package _18_Encapsulation_Proper;

public class Player {

	private String name;
	private String status;
	private int highScore;
	private int hp;

	// constructor
	public Player(String name, String status, int hp) {
		this.name = name;
		this.status = status;
		this.hp = hp;
	}

	// getters

	public String getName() {
		return name;
	}

	public String getStatus() {
		return status;
	}

	public int getHP() {
		return hp;
	}

	public void setNewPlayerName(String newname) {
		this.name = newname;
	}

	public void setNewPlayerStatus(String newStatus) {
		this.status = newStatus;
	}
}
