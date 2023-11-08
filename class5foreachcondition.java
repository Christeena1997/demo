package Arraylist1;

import java.util.ArrayList;
import java.util.Arrays;


public class class5foreachcondition {

	public static void main(String[] args) {
	ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(24,36,82,55));
//nums.forEach(x->System.out.println(x));
//----------------------------------------------------------------------------------------------------------------
	nums.forEach(x-> {
		if(x%2==0) {
			System.out.println(x+" even");
		}
		else {
			System.out.println(x+"odd");
		}
	});
	}

}
