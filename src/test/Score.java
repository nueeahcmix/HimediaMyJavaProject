package test;

class MinusException extends RuntimeException {
	MinusException() {}
	MinusException(String s) {
		super(s);
	}
}

class OverException extends RuntimeException {
	OverException() {}
	OverException(String s) {
		super(s);
	}
}

class Score1 {
	void check(int score) {
		if (score < 0) {
			MinusException me = new MinusException("음수값 입력!!!");
			throw me;
		}
		
		if (score > 100 ) {
			OverException oe = new OverException("100점 초과!!!");
			throw oe;
		}
	}
}



public class Score {
	public static void main(String[] args) {
		Score1 score = new Score1();
		try {
			score.check(-10);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
		try {
			score.check(200);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}
		
		score.check(-10);
		
		score.check(200);
		
	}

}
