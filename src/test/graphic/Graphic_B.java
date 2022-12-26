package test.graphic;

public class Graphic_B implements Graphic {

	public void brightness_B(int value) {
		System.out.println("밝기를 " + value + "로 설정");
	}
	
	public void contrast_B(double value) {
		System.out.println("콘트라스를 " + value + "로 설정");

	}
	
	public void display_B() {
		System.out.println("화면을 출력");

	}

	@Override
	public void brightness(int value) {
		this.brightness(value);
	}

	@Override
	public void contrast(double value) {
		this.contrast(value);
	}

	@Override
	public void display() {
		this.display();
	}
	
}
