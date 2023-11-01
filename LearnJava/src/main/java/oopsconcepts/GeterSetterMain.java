package oopsconcepts;

public class GeterSetterMain {

	public static void main(String[] args) {		
		GetterSetterConcepts abs = new GetterSetterConcepts();
		System.out.println(abs.getMinimumBalance());
		abs.setMinimumBalance(7000);
		System.out.println(abs.getMinimumBalance());
	}

}
