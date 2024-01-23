package Ex01_message;

import java.util.Scanner;
import java.time.LocalDateTime;


public class MessageServiceArrayImpl implements MessageService  {
	
	LocalDateTime now = LocalDateTime.now();
	
	private static Message[] messageArray = new Message[100]; // 원래 main에 있던 것인데 가져옴
	private static Scanner scan = new Scanner(System.in);
	private static int index = 4;
	
	public MessageServiceArrayImpl() {
		messageArray[0] = new Message(1000, "안녕하세요", "박성민", "15:03");
		messageArray[1] = new Message(1001, "안녕", "송햇님", "15:04");
		messageArray[2] = new Message(1002, "안녕하시오", "김용현", "15:05");
		messageArray[3] = new Message(1003, "HI", "정아름", "15:00");
		messageArray[4] = new Message(1004, "안녕하십시오", "이강성", "15:06");
	}
	// 몇번째 메시지 메시지내용 작성자 작성시간
	
	@Override
	public Message findByMid(int mid) {
		System.out.println("----------");
		System.out.println("아이디 찾기");
		System.out.println("----------");
		
		return null;
	}

	@Override
	public void messageList() {
		System.out.println("----------");
		System.out.println("메세지 리스트");
		System.out.println("----------");
		
		for (int i = 0; i <= messageArray.length; i++) {
			if (messageArray[i] == null) {
				break;
			}
			Message msg = messageArray[i];
			System.out.printf("%d %s %s %s\n", msg.getMid(), msg.getContent(), msg.getWriter(), msg.getGenTime());
			
		}
		System.out.println("메시지를 전부 출력했습니다");
	}

	@Override
	public void messageListByWriter(String Mwriter) {
		
		
		for (int i = 0; i < messageArray.length; i++) {
			if (Mwriter == messageArray[i].getWriter()) {
			Message msg = messageArray[i];
			System.out.printf("%d %s %s %s\n", msg.getMid(), msg.getContent(), msg.getWriter(), msg.getGenTime());
			}
		}
	}

	@Override
	public void insertMessage(Message message) {
		System.out.println("----------");
		System.out.println("입력");
		System.out.println("----------");
		
	}

	@Override
	public void updateMessage(Message message) {
		System.out.println("----------");
		System.out.println("수정");
		System.out.println("----------");
		
	}

	@Override
	public void deleteMessage(int mid) {
		System.out.println("----------");
		System.out.println("메세지 제거");
		System.out.println("----------");
		
	}

}
