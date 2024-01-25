package ch17_collection.part1_list.sec03_Message;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MessageServiceListImpl implements MessageService {
	List<Message> list = new ArrayList<>();
	int index = 101;
	
	public MessageServiceListImpl() {
		list.add(new Message(index++, "안녕하세요", "김용현", LocalDateTime.now(), 0));
		list.add(new Message(index++, "I sing", "마이클잭슨", LocalDateTime.now(), 0));
		list.add(new Message(index++, "I play basketball", "마이클조던", LocalDateTime.now(), 0));
		list.add(new Message(index++, "난 돈이 많아요", "도날드트럼프", LocalDateTime.now(), 0));
		list.add(new Message(index++, "나도 돈이 많아요", "일론머스크", LocalDateTime.now(), 0));
	}

	@Override
	public Message findByMid(int mid) {
		for (Message msg : list) {
			if (msg.getMid() == mid) {
				return msg;
			}
		}
		return null;
	}

	@Override
	public List<Message> getMessageListAll() {
		List<Message> fullList = new ArrayList<>();
		for (Message msg : list) {
			if (msg.getIsDeleted() != MessageService.DELETED) {
				fullList.add(msg);
			}
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
		message.setMid(index++);
		message.setModTime(LocalDateTime.now());
		list.add(message);
	}

	@Override
	public void updateMessage(Message message) {
		int index = 0;
		for (Message msg : list) {
			if (msg.getMid() == message.getMid()) {
				index = list.indexOf(msg);
				break;
			}
		}
		message.setModTime(LocalDateTime.now());
		list.set(index, message);
	}

	@Override
	public void deleteMessage(int mid) {
		Message message = null;
		for (Message msg : list) {
			if (msg.getMid() == mid) {
				message = msg;
				break;
			}
		}
		list.remove(message);
	}

}
