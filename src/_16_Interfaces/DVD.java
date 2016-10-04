package _16_Interfaces;

public class DVD implements IFunctions{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("DVD is now playing.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("DVD has stopped.");
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skipped to next Chapter.");
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("DVD has returned to Menu.");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("DVD is paused.");
	}

	@Override
	public void volume(int volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTitle(String title) {
		// TODO Auto-generated method stub
		System.out.println("My name is:" + title);
		
	}


}
