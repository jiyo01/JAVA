import java.util.Arrays;

public class SplitTest {

	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		
		String[] arr = animals.split(",");
		
		System.out.println(arr[0]);
		
		for(int i = 0; i < arr.length; i++) {   //for문으로 배열의 요소를 하나씩 출력
			System.out.println("arr["+i+"]=" + arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));   // 배열의 내용을 문자열로 출력 
		System.out.println(arr);  // 배열을 넣어서 출력하면, 주소비슷한게 나온다.
		
		String str = String.join("-",arr); //배열 arr을 '-' 구분자로 결합한다.
		System.out.println(str); // String클래스에는 toString()이 객체의 내용을 출력하도록 오버라이딩 되어있다.
	}
}
