package homework01.Ex01_board;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<Board> boardList;
	
	public BoardDao() {
        boardList = new ArrayList<>();

        // 초기값으로 Board 객체를 생성하고 추가
        Board board1 = new Board("제목1", "내용1");
        Board board2 = new Board("제목2", "내용2");
        Board board3 = new Board("제목3", "내용3");

        boardList.add(board1);
        boardList.add(board2);
        boardList.add(board3);
    }

    public List<Board> getBoardList() {
        return boardList;
    }
}
