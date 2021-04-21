package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] strings ={"word", "wordtwo", "wordthree", "wordfour", "wordfive"};//new String[5] 
		//2. print the third element in the array
		System.out.println(strings[2]);
		//3. set the third element to a different value
		strings[2] = "three";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		//6. make an array of 50 integers
		int[] integers = new int[50];
		int count = 50;
		Random ran = new Random();
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < integers.length; i++) {
			integers[i] = ran.nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		for (int i = 0; i < integers.length; i++) {
			if(integers[i] < count) {
				count = integers[i];
			}
				}
		System.out.println(count);
			
		
			
		
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		int maxcount = 0;
		for (int j = 0; j < integers.length; j++) {
			
		
		if(integers[j] > maxcount) {
			maxcount = integers[j];
		}
		}
		System.out.println(maxcount);
	}
}
