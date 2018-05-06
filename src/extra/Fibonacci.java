package extra;

public class Fibonacci {
	public static void main(String[]args) {
		int num = 0;
		int num2 = 1;
		System.out.println(num);
		System.out.println(num2);
		for(int i = 0; i <13; i ++) {
			int calcnum = num +num2;
		num = num2;
		num2 = calcnum;
		System.out.println(calcnum);
		}
		
	}

}
