package mysql.sec05_message;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageMain {
	private static MessageDao messageDao = new MessageDao();
	private static Scanner scan = new Scanner(System.in);
	static List<Message> list = new ArrayList<>();

	public static void main(String[] args) {
		String writer = null, content = null;
		Message message = null;
		int mid = 0;
		boolean run = true;

		while (run) {
			System.out.println("+=============+=================+==========+==========+==========+========+");
			System.out.println("| 1. 전체목록 | 2.Writer별 목록 | 3.글쓰기 | 4.글수정 | 5.글삭제 | 6.종료 |");
			System.out.println("+=============+=================+==========+==========+==========+========+");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scan.nextLine());
			switch (selectNo) {
			case 1:
				getMessageListAll();
				break;
			case 2:
				System.out.println("---------------");
				System.out.println(" Writer별 목록");
				System.out.println("---------------");
				System.out.print("Writer 이름> ");
				writer = scan.nextLine();
				getMessageListByWriter(writer);
				break;
			case 3:
				System.out.println("---------------");
				System.out.println("  메세지 쓰기");
				System.out.println("---------------");
				System.out.print("Writer 이름> ");
				writer = scan.nextLine();
				System.out.print("메세지 내용> ");
				content = scan.nextLine();
				insertMessage(content, writer);
				break;
			case 4:
				System.out.println("---------------");
				System.out.println("  메세지 수정");
				System.out.println("---------------");
				System.out.print("메세지 ID> ");
				mid = Integer.parseInt(scan.nextLine());
				System.out.print("Writer 이름> ");
				writer = scan.nextLine();
				System.out.print("메세지 내용> ");
				content = scan.nextLine();
				updateMessage(mid, content, writer);
				break;
			case 5:
				System.out.println("---------------");
				System.out.println("  메세지 삭제");
				System.out.println("---------------");
				System.out.print("메세지 ID> ");
				mid = Integer.parseInt(scan.nextLine());
				deleteMessage(mid);
				break;
			case 6:
				run = false;
				break;
			default:
				System.out.println("Warning: 1 ~ 6 사이의 숫자만 입력하세요.");
			}
		}
		System.out.println("프로그램 종료");
		scan.close();
	}

	private static void getMessageListAll() {
		System.out.println("전체 메시지 목록:");
		messageDao.getMessageListAll().forEach(System.out::println);
		System.out.println();
	}

	private static void getMessageListByWriter(String writer) {
		System.out.println(writer + "님의 메시지 목록:");
		messageDao.getMessageListByWriter(writer).forEach(System.out::println);
		System.out.println();
	}

	private static void insertMessage(String content, String writer) {
		Message message = new Message(content, writer);
		messageDao.insertMessage(message);
		System.out.println("메시지가 성공적으로 추가되었습니다.");
	}

	private static void updateMessage(int mid, String content, String writer) {
		Message message = messageDao.getMessageByMid(mid);
		if (message != null) {
			message.setContent(content);
			message.setWriter(writer);
			messageDao.updateMessage(message);
			System.out.println("메시지가 성공적으로 수정되었습니다.");
		} else {
			System.out.println("해당 ID의 메시지를 찾을 수 없습니다.");
		}
	}

	private static void deleteMessage(int mid) {
		Message message = messageDao.getMessageByMid(mid);
		if (message != null) {
			messageDao.deleteMessage(mid);
			System.out.println("메시지가 성공적으로 삭제되었습니다.");
		} else {
			System.out.println("해당 ID의 메시지를 찾을 수 없습니다.");
		}
	}
}