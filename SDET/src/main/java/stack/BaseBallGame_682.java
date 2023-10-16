package stack;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class BaseBallGame_682 {
	/*
	 * 1) Did I understand the problem? Yes 2) Derive your test data Input: ops =
	 * ["5","2","C","D","+"] Output: 30 Input: ops = ["1","C"] Output: 0 Input: ops
	 * = ["2","D","+"] Output: 6 3) Do I know how to solve this? Yes 4) Ask for
	 * hints, if you do not understand !! 5) Do I know alternate solutions? No 6) If
	 * you know more than one, then do this. 7) Start with Psuedo code 1. Create
	 * Stack to store Integer values 2. Iterate the given String input in the loop
	 * 3. make conditional statements to perform below math operations 4. input is C
	 * then remove the previous record from Stack 5. input is D then double the
	 * previous values and add into Stack 6. input is + then add the 2 previous
	 * values and add into Stack 7. other inputs convert the values to int and add
	 * into the Stack 8. end given opreations add all the values and return
	 * 
	 * 8) Implement the code int sum=0; Stack<Integer> game = new Stack<Integer>();
	 * for(String str : ops){ char input = str.charAt(0); swith(input){ case 'C' :
	 * game.pop(); case 'D' : game.push(game.peek()*2); case '+' : int
	 * current=game.peek(); game.pop(); int previous=game.peek();
	 * game.push(current); game.push(current+previous); default:
	 * game.push(Integer.parseInt(str)); } } for(int each : game){ sum+=each; }
	 * return sum;
	 * 
	 * 9) Test against different test data set
	 * 
	 * 10) Debug them to solve it !
	 */
	@Test
	public void testData1() {
		Assert.assertEquals(30, findGameScore(new String[] { "5", "2", "C", "D", "+" }));
	}

	@Test
	public void testData2() {
		Assert.assertEquals(27, findGameScore(new String[] { "5", "-2", "4", "C", "D", "9", "+", "+" }));
	}

	@Test
	public void testData3() {
		Assert.assertEquals(0, findGameScore(new String[] { "1", "C" }));
	}

	public int findGameScore(String[] operations) {
		int sum = 0;
		Stack<Integer> game = new Stack<Integer>();
		for (String str : operations) {
			char input = str.charAt(0);
			switch (input) {
			case 'C':
				game.pop();
				break;
			case 'D':
				game.push(game.peek() * 2);
				break;
			case '+':
				int current = game.peek();
				game.pop();
				int previous = game.peek();
				game.push(current);
				game.push(current + previous);
				break;
			default:
				game.push(Integer.parseInt(str));
			}
		}
		for (int each : game) {
			sum += each;
		}
		return sum;

	}
}
