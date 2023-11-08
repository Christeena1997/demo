package Arraylist1;

import java.util.ArrayList;

public class UseMobnormalwithcondition {

	public static void main(String[] args) {
		Mobile m1=new Mobile("nokia",88900,"black",3.4f,2008);
		Mobile m2=new Mobile("sumsung",99000,"gold",5.9f,2010);
		Mobile m3=new Mobile("oppo",10000,"silver",8.0f,2011);
		Mobile m4=new Mobile("redmi",89500,"darkblack",7.2f,2015);
		Mobile m5=new Mobile("Apple",50000,"darkblue",10.0f,2018);
		ArrayList<Mobile> mob=new ArrayList<>();
		mob.add(m1);
		mob.add(m2);
		mob.add(m3);
		mob.add(m4);
		mob.add(m5);
//		condition 40000 above price print
//		mob.forEach(x-> {
//			if(x.getPrice()>40000) {
//				System.out.println(x);
//			}
//		});
//-------------------------------------------------------------------------------------------------
//		 condition above 7rating && above 2500 print
//		mob.forEach(x-> {
//			if(x.getRating()>=7 && x.getPrice()>25000) {
//				System.out.println(x);
//			}
//		});
//	}
//------------------------------------------------------------------------------------------------------------------
//	condition below 8 && above 25000 price
		mob.forEach(x-> {
			if(x.getBrand().equals("Apple") && x.getRating()<8) {
				System.out.println(x);
			}
		});
	}
}
