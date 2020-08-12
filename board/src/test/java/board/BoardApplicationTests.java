package board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import board.board.dto.BoardDto;
import board.board.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class BoardApplicationTests {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testSqlSession() throws Exception {
		log.info("sqlSession : {}", sqlSession.toString());
	}
	
	@Test
	public void selectBoardDetail() throws Exception {
		int boardId = 1;
		BoardDto board = boardMapper.selectBoardDetail(boardId);
		log.info("board : {}", board);
	}
}
