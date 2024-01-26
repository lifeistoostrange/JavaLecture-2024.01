package homework01.Ex01_board;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	List<Board> boardList = new ArrayList<Board>();
	
	public BoardDao() {

        this.boardList.add(new Board("제목1", "내용1"));
        this.boardList.add(new Board("제목2", "내용2"));
        this.boardList.add(new Board("제목3", "내용3"));

        }

    public List<Board> getBoardList() {
        return this.boardList;
    }
}
