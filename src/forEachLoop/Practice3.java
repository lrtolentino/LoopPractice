package forEachLoop;

import java.util.Arrays;
import java.util.List;

public class Practice3 {
	public static void main(String[] args) {
		List <Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20); 
		listOfNumbers.stream().forEach((i) -> { System.out.println(i); });		
		}
}