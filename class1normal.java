package Arraylist1;

import java.util.ArrayList;

public class class1normal {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(24);
		nums.add(6);//add
		nums.add(35);
		nums.add(80);
		nums.add(99);
		System.out.println("get=" + nums.get(0));
		System.out.println("remove=" + nums.remove(2));
		System.out.println("set=" + nums.set(0, 38));
		System.out.println("size=" + nums.size());
		System.out.println(nums);
	}
}
