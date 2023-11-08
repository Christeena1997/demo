package Arraylist1;

import java.util.ArrayList;
import java.util.Arrays;

public class class4enchaneceforeach {

	public static void main(String[] args) {
		ArrayList<String> values=new ArrayList<>(Arrays.asList("raju","sanjay","madhu","sennu"));
//		for(String b:values) {
//			System.out.println(b);
//		}
//------------------------------------------------------------------------------------------------------------
//		String max=values.get(0);
//	for(String b:values) {
//			if(b.startsWith("s")) {			
//				System.out.println(b);
//--------------------------------------------------------------------------------------------------------------
//		find even String
//			if(b.length()%2==0) {
//				System.out.println(b);
//-----------------------------------------------------------------------------------------------------------
//		find max
//			if(b.length()>max.length()) {
//				max=b;
//			}
//		}
//				System.out.println(max);
//--------------------------------------------------------------------------------------------------------------------			
//			find min and check palidrome
//			if(b.length()<max.length()) {
//				max=b;
//		}
//		}
//		System.out.println(max);
//
//String b="";
//
//for(int i=max.length()-1;i>=0;i--) {
//b=b+max.charAt(i);
//}
//if(b.equalsIgnoreCase(max)) {
//System.out.println("palindrome");
//	}
//else {
//	System.out.println("not palidrome");
//--------------------------------------------------------------------------------------------------------------------------------	
//forEach
//		values.forEach(b->System.out.println(b));	
//----------------------------------------------------------------------------------------------------------
values.forEach(b-> {
	if(b.length()%2!=0) {
		System.out.println(b.toUpperCase());
	}
});		
	}
}

