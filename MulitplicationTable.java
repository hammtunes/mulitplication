package multiplicationTable;

import java.util.Scanner;

public class MulitplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("please enter number");
int x = scan.nextInt();//this stores the input value from the user
for(int i =1; i<13; i++) {
	 int result=x*i;
    System.out.println(x + "x" +i+ "=" +result);
	 }
	}
	}