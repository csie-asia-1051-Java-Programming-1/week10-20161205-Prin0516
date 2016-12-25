package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = 0;
		int data[] = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("½Ð¿é¤J¦¨ÁZ");
			data[i] = scn.nextInt();
			if (data[i] < 60) {
				a++;
			}
		}
		if (a == 0) {
			System.out.println("P");
		} else if (a == 1) {
			if (data[0] + data[1] + data[2] >= 220) {
				System.out.println("P");
			} else if (data[0] + data[1] + data[2] < 220) {
				System.out.println("M");
			}
		} else if (a == 2) {
			for (int i = 0; i < 3; i++) {
				if (data[i] >= 80) {
					System.out.println("M");
				}else{
					System.out.println("F");
					break;
				}
			}
		} else if(a==3){
			System.out.println("F");
		}

	}

}
