package Arraylist1;

import java.util.ArrayList;
import java.util.Arrays;

public class UseMobilewithtostringwithouttostring {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("nokia", 8900, "black", 3.4f, 2008);
		Mobile m2 = new Mobile("sumsung", 9000, "gold", 3.9f, 2010);
		Mobile m3 = new Mobile("oppo", 10000, "silver", 4.0f, 2011);
		Mobile m4 = new Mobile("redmi", 11500, "darkblack", 4.2f, 2015);
		Mobile m5 = new Mobile("Apple", 50000, "darkblue", 5.2f, 2018);
		ArrayList<Mobile> nums = new ArrayList<>();
		nums.add(m1);
		nums.add(m2);
		nums.add(m3);
		nums.add(m4);
		nums.add(m5);

		// normal forloop without ToStrinmg
//	for(int i=0;i<nums.size();i++) {
//		System.out.println(nums.get(i).getBrand()+","+nums.get(i).getColor()+","+nums.get(i).getPrice()+","+nums.get(i).getEdition()+","+nums.get(i).getRating());
//---------------------------------------------------------------------------------------------------------------------------------------------------------------

		// normal for with ToString
//	for(int i=0;i<nums.size();i++) {
//		System.out.println(nums.get(i));
//	}
//	}
//---------------------------------------------------------------------------------------------------------------------	

		// enchaned loop with ToString
//	for(Mobile b:nums) {
//	System.out.println(b);
//--------------------------------------------------------------------------------------------------------------------------------------
//	enchanced loop without ToString
//	for(Mobile b:nums) {
//		System.out.println(b.getBrand()+","+b.getColor()+","+b.getEdition()+","+b.getPrice()+","+b.getRating());
//}
//	}
//}
//----------------------------------------------------------------------------------------------------------------------------------	

		// forEach with ToString
		// nums.forEach(x->System.out.println(x));
//	}
//----------------------------------------------------------------------------------------------------------------	
//	forEach without ToString
		nums.forEach(x -> System.out.println(
				x.getBrand() + " " + x.getColor() + " " + x.getEdition() + " " + x.getPrice() + " " + x.getRating()));
	}
}
