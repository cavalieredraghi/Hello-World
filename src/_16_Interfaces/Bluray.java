package _16_Interfaces;

public class Bluray implements IFunctions{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Bluray disc is playing.");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Movie stopped.");
	}

	@Override
	public void skip() {
		// TODO Auto-generated method stub
		System.out.println("Skipped to next Chapter.");
	}

	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("At the bluray menu.");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Movie is paused.");
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
