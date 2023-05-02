package mytest;

import java.util.function.Predicate;

public class PredicateTest2 {

	public static void main(String[] args) {
		Predicate<String> isEmptyStr = new Predicate<String>() {
			public boolean test(String s) {
				return s.length() == 0;
			}
		};
		
		String s = "";
		
		if(isEmptyStr.test(s))
			System.out.println("This is an empty String.");
	}
}
