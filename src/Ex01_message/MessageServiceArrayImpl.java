package Ex01_message;

import java.time.LocalDateTime;

public class MessageServiceArrayImpl implements MessageService {


	private Message[] messageArray = new Message[100];
	private static int index = 0;

	public MessageServiceArrayImpl() {
		messageArray[index++] = new Message(101, "안녕하세요", "박성민", LocalDateTime.now());
		messageArray[index++] = new Message(102, "안녕", "송햇님", LocalDateTime.now());
		messageArray[index++] = new Message(103, "안녕하시오", "김용현", LocalDateTime.now());
		messageArray[index++] = new Message(104, "HI", "정아름", LocalDateTime.now());
		messageArray[index++] = new Message(105, "안녕하십시오", "이강성", LocalDateTime.now());
	}
	// 몇번째 메시지 메시지내용 작성자 작성시간

	@Override
	public Message findByMid(int mid) {
		for (Message msg: messageArray) {
			if (msg == null)
				break;
			if (mid == msg.getMid())
				return msg;
		}
		return null;
	}

	@Override
	public void messageList() {
		for (Message msg : messageArray) {
			if (msg == null) {
				break;
			}
			if (msg.getIsDeleted() != MessageService.DELETED) {
				System.out.println(msg);
			}

		}
		System.out.println("메시지를 전부 출력했습니다");
	}

	@Override
	public void messageListByWriter(String Mwriter) {

		for (Message msg : messageArray) {
			if (msg == null) {
				break;
			}
			if (msg.getWriter().equals(Mwriter) && msg.getIsDeleted() != MessageService.DELETED) {
				System.out.println(msg);
			}
		}
//		for (int i = 0; i < messageArray.length; i++) {
//			if (Mwriter == messageArray[i].getWriter()) {
//			Message msg = messageArray[i];
//			System.out.printf("%d %s %s %s\n", msg.getMid(), msg.getContent(), msg.getWriter(), msg.getGenTime());
//			}
//		}
	}

	@Override
	public void insertMessage(Message message) {
		int mid = 101 + index;
		message.setMid(mid);
		message.setGenTime(LocalDateTime.now());
		messageArray[index++] = message;
		

	}

	@Override
	public void updateMessage(Message message) {
		for (int i = 0; i < messageArray.length; i++) {
			if (messageArray[i] == null) {
				break;
			}
			if (messageArray[i].getMid() == message.getMid()) {
				messageArray[i] = message;
				return;
			}
		}
	}

	@Override
	public void deleteMessage(int mid) {
		Message msg = findByMid(mid);
		if (msg != null)
			msg.setIsDeleted(mid);
	}

}
