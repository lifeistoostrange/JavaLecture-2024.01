package ch17_collection.part1_list.sec03_Message;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MessageServiceListImpl implements MessageService {
	List<Message> list = new ArrayList<>();
	
	public MessageServiceListImpl() {
		list.add(new Message(101, "안녕하세요", "김용현", LocalDateTime.now(), 0));
		list.add(new Message(102, "I sing", "마이클잭슨", LocalDateTime.now(), 0));
		list.add(new Message(103, "I play basketball", "마이클조던", LocalDateTime.now(), 0));
		list.add(new Message(104, "난 돈이 많아요", "도날드트럼프", LocalDateTime.now(), 0));
		list.add(new Message(105, "나도 돈이 많아요", "일론머스크", LocalDateTime.now(), 0));
	}

	@Override
	public Message findByMid(int mid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Message> getMessageListAll() {
		List<Message> fullList = new ArrayList<>();
		for (Message msg : list) {
			if (msg == null) {
				break;
			}
			if (msg.getIsDeleted() != )
			
		}
		
		return fullList;
	}

	@Override
	public List<Message> getMessageListByWriter(String write) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMessage(int mid) {
		// TODO Auto-generated method stub
		
	}

}
