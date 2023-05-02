package Constructor;

class Data1{
	int value;
}

class Data2{
	int value;
	
	Data2(int value){   //매개변수가 있는 생성자 
		this.value = value;
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		Data1 d = new Data1();
//		Data2 d2 = new Data2();  //에러@ 
		Data2 d2 = new Data2(10);
	}
}
