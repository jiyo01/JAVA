package mytest;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateTest3 {

	public static void main(String[] args) {
		Predicate<Integer> i = num -> num > 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요(종료는 0) : ");
			int num = sc.nextInt();
			
			if(num==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(i.test(num)) {
				System.out.println(num + "은 양수입니다.");
			} else {
				System.out.println(num + "은 음수입니다.");
			}
		}
	}
}