
public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println(sb);
		System.out.println(sb.toString()); // toString()은 오버라이딩되어 있다.
		
		System.out.println(sb == sb2);
		System.out.println(sb.equals(sb2));
		
		// StringBuffer의 내용을 String으로 변환한다.
		String s = sb.toString();    // String s = new String(sb);와 같다
		String s2 = sb2.toString();
		
		System.out.println(s == s2);
		System.out.println(s.equals(s2)); // String인스턴스에 equals()메서드를 사용한다.
		
		System.out.println();
		
		String str = new String("Hello");
		String str2 = "Hello";
		
		System.out.println(str == str2); //주소가 다르다.
		System.out.println(str.equals(str2));  // 내용이 같아서 true반환
	}
}
