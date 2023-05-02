package treeSet;

import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet(); //Set set = new TreeSet();으로 하면 안된다.
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};
		
		for(int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
		}
		System.out.println(set);  //TreeSet은 add()로 저장할 때 정렬이 된다. 
		
		System.out.println("50보다 작은 값 : " + set.headSet(50));
		System.out.println("50보다 큰 값 : " + set.tailSet(new Integer(50)));
		System.out.println("40과 80사이의 값 : " + set.subSet(40, 80)); // 45, 50, 65
	}
}
