package Arraylist1;

import java.util.ArrayList;

public class Usemobnewarrayadd {

	public static void main(String[] args) {
		Mobile m1 = new Mobile("nokia", 8900, "black", 3.4f, 2008);
		Mobile m2 = new Mobile("sumsung", 9000, "gold", 3.9f, 2010);
		Mobile m3 = new Mobile("oppo", 10000, "silver", 4.0f, 2011);
		Mobile m4 = new Mobile("redmi", 115000, "blue", 4.2f, 2015);
		Mobile m5 = new Mobile("Apple", 60000, "darkblue", 5.2f, 2018);
		ArrayList<Mobile> nums1 = new ArrayList<>();
		ArrayList<Mobile>newnums1=new ArrayList<>();
		nums1.add(m1);
		nums1.add(m2);
		nums1.add(m3);
		nums1.add(m4);
		nums1.add(m5);
		
//normal forloop and store new Arraylist in foreach method 		
//for(int i=0;i<nums1.size();i++) {
//	if(nums1.get(i).getPrice()>40000) {
//		newnums1.add(nums1.get(i));
//	}
//}
//newnums1.forEach(x->System.out.println(x));
//	}

//------------------------------------------------------------------------------------------------------------------------
	//	for each method above 60000 price && color== blue
		nums1.forEach(x-> {
			if(x.getPrice()>60000 && x.getColor().equals("blue")) {
				newnums1.add(x);
			}
		});
newnums1.forEach(x->System.out.println(newnums1));
//-----------------------------------------------------------------------------------------------------------------------------------
}
}
