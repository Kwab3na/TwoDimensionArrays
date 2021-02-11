package org.horizoncolumbus.hs;

public class Main {

    public static void main(String[] args) {
		int[][] arr = new int[3][3];

		arr[0][0] = 2;
		arr[0][1] = 7;
		arr[0][2] = 9;

		arr[1][0] = 3;
		arr[1][1] = 6;
		arr[1][2] = 1;

		arr[2][0] = 7;
		arr[2][1] = 4;
		arr[2][2] = 2;

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println("\n");
		}
	}
}
