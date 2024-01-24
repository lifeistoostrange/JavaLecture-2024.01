package Ex01_message;

import java.util.Scanner;


public class MessageMain {
	
	private static Scanner scan = new Scanner(System.in);
	private static MessageService messageService = new MessageServiceArrayImpl();
	

	public static void main(String[] args) {
		String writer = null, content = null;
		Message message = null;
		int mid = 0;
		boolean run = true;
		while (run) {
			System.out.println("+===================================================================================+");
			System.out.println("| 1.전체 메세지 목록 | 2.작성자로 검색 | 3.메시지 작성 | 4. 메시지 입력 | 5.메시지 수정 | 6. 종료 |");
			System.out.println("+===================================================================================+");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
//				messageService.findByMid(selectNo);
				messageService.messageList();
				break;
			
			case 2 :
				System.out.println("---------------");
				System.out.println(" Writer별 목록");
				System.out.println("---------------");
				System.out.print("Writer 이름> ");
				writer = scan.nextLine();
				messageService.messageListByWriter(writer); 
				break;
				
			case 3 : 
				System.out.println("---------------");
				System.out.println("  메세지 쓰기");
				System.out.println("---------------");
				System.out.print("Writer 이름> ");
				writer = scan.nextLine();
				System.out.print("메세지 내용> ");
				content = scan.nextLine();
				message = new Message(content, writer);
				messageService.insertMessage(message);
				break;
				
			case 4 :
				System.out.println("---------------");
				System.out.println("  메세지 수정");
				System.out.println("---------------");
				System.out.print("메세지 ID> ");
				mid = Integer.parseInt(scan.nextLine());
				message = messageService.findByMid(mid);                 
				System.out.print("Writer 이름(" + message.getWriter() + ")> ");
				writer = scan.nextLine();
				System.out.print("메세지 내용(" + message.getContent() + ")> ");
				content = scan.nextLine();
				message.setWriter(writer);
				message.setContent(content);
				messageService.updateMessage(message);
				break;
				
			case 5 : 
				System.out.println("---------------");
				System.out.println("  메세지 삭제");
				System.out.println("---------------");
				System.out.print("메세지 ID> ");
				mid = Integer.parseInt(scan.nextLine());
				messageService.deleteMessage(mid);
				break;
				
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
