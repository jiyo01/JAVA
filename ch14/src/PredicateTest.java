import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i % 2 == 0;
		
		Predicate<Integer> notP = p.negate();  // i >= 100
		Predicate<Integer> all = notP.and(q).or(r);  // i >= 100 && i < 200 || i % 2 == 0
		Predicate<Integer> all2 = notP.and(q.or(r)); // i >= 100 && (i < 200 || i % 2 == 0)
		
		System.out.println(all.test(2));
		System.out.println(all2.test(2));
		
		
		String str1 = "Hello";
		String str2 = "Hello";
		Predicate<String> pp = Predicate.isEqual(str1);
		boolean result = pp.test(str2);
		
//		boolean result = Predicate.isEqual(str1).test(str2);
		
		System.out.println(result);

	}
}
