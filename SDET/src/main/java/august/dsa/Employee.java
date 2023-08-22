package august.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {	
	
	String empName;
	String empAge;
	
	public void createArray(String name,String age) {
		empName=name;
		empAge=age;
	}
	
	@Override
	public String toString() {
		return empName+" , "+empAge;
	}
	public static void main(String args[]){
		
		  Employee[] obj = new Employee[3];
		  
		  obj[0] = new Employee(); 
		  obj[1] = new Employee();
		  obj[2] = new Employee();
		  
		  obj[0].createArray("Ravi", "30");
		  obj[1].createArray("Kumar", "30");
		  obj[2].createArray("Ganesh", "30");
		 
		  System.out.println(Arrays.toString(obj));
		  
		 
		
	}
}
