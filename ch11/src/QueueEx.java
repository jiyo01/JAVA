import java.util.*;

public class QueueEx {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		
		while(true) {
			System.out.print(">>");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine().trim();
			
			if("".equals(input))
				continue;
			
			if(input.equals("help")) {
				System.out.println("help - 도움말을 볼 수 있습니다.");
				System.out.println("q 또는 Q - 프로그램을 종료합니다.");
				System.out.println("history - 최근에 입력한 명령어를 보여줍니다.");
			} else if(input.equalsIgnoreCase("q")) {
				System.exit(0);
			} else if(input.equalsIgnoreCase("history")) {
				save(input);
				LinkedList tmp = (LinkedList)q;
				
				final int SIZE = tmp.size();
				for(int i = 0; i < SIZE; i++) {
					System.out.println((i+1)+"." + tmp.get(i));
				}
			} else {
				save(input);
				System.out.println(input);
			}
		}
	}
	
	public static void save(String input) {
		if(!"".equals(input))
			q.offer(input);
		
		if(q.size() > MAX_SIZE) {
			q.poll();
		}
	}
}
