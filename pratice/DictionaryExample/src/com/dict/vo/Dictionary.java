package com.dict.vo;

public class Dictionary {
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future","hope"};
	public static String kor2Eng(String world) {
		for(int i=0; i<kor.length; i++) {
			if(world.equals(kor[i])) {
				if(i%2==0) {
					System.out.print(world+"은");
				} else {
					System.out.print(world+"는");
				}
				return eng[i];
			}
		}
		return "false";
	}
	
}
