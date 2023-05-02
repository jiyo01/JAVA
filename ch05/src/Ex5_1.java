
public class Ex5_1 {

	public static void main(String[] args) {
		//intdex범위 : 0~9 
		int[] arr = new int[10];  //길이가 10인 int배열 arr을 생성
		System.out.println("arr.length="+arr.length);
		
		
		//배열의 모든 요소를 출력하려면,, for문을 사용하면 된다.
		for(int i=0; i < arr.length; i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
	} 
}
