package javaActivity4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity4_1 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc  = new Scanner(System.in);

		ArrayList arr = new ArrayList<Integer>();
		System.out.println("Enter Num");
		System.out.println("Enter any non interger to exit");
		while(sc.hasNextInt()) {
			arr.add(sc.nextInt());
		}
		System.out.println(arr);
		System.out.println("Random Num :"+r.nextInt(5));
		
		Object[] nums = arr.toArray(new Integer[0]);
		
        int index = r.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + nums[index]);

		System.out.println("Value in array with index : "+nums[4]);
	}

}
