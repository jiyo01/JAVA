import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx2 {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr);
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new descending1());  // static void sort(Object[] a, Comparator c) 호출
		System.out.println("strArr=" + Arrays.toString(strArr));
	}
}

class descending1 implements Comparator{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;
		}
		return -1;
	}
}

