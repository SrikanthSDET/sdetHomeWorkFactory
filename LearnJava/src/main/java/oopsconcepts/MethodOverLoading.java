package oopsconcepts;

public class MethodOverLoading {
	
	private void add(int a) {
		System.out.println("Addition from non-argument method: "+a);
	}
	
	private void add(int a,int b) {
		System.out.println("Addition from Two int Param method: "+(a+b));
	}
	
	private void add(int a,float b) {
		System.out.println("Addition from One int and float Param Method: "+(a+b));
	}
	private void add(double d) {
		System.out.println("Addition from double Param method: "+d);
	}

	public static void main(String[] args) {
		MethodOverLoading mol = new MethodOverLoading();
		mol.add(10);
		mol.add(10, 10);
		mol.add(15, 15.000f);
		mol.add(40.46587);

	}

}
