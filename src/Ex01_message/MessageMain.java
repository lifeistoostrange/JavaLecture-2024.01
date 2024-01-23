package Ex01_message;

import java.util.Scanner;


public class MessageMain {
	
	private static Scanner scan = new Scanner(System.in);
	private static MessageService messageService = new MessageServiceArrayImpl();
	

	public static void main(String[] args) {
		
		boolean run = true;
		while (run) {
			System.out.println("+===================================================================================+");
			System.out.println("| 1.아이디로 검색 | 2.전체 메시지 리스트 | 3.작성자로 검색 | 4. 메시지 입력 | 5.메시지 수정 | 6. 종료 |");
			System.out.println("+===================================================================================+");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
				messageService.findByMid(selectNo);
				continue;
			
			case 2 :
				messageService.messageList();
				continue;
				
			case 3 : 
				System.out.println("----------");
				System.out.println("작성자 검색");
				System.out.println("----------");
				
				System.out.println("찾고싶은 작성자를 검색하세요");
				String Mwriter = scan.nextLine();
				messageService.messageListByWriter(Mwriter);
				continue;
				
			case 4 :
				messageService.updateMessage(null);
				continue;
				
			case 5 : 
				messageService.deleteMessage(selectNo);
				continue;
				
			case 6 :
				run = false;
				break;
				
			default :
				System.out.println("숫자제대로입력좀하세요");
			}
		}
		System.out.println("끝");
	}

}
