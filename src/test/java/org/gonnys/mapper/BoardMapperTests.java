package org.gonnys.mapper;

import org.gonnys.domain.Board;
import org.gonnys.domain.PageParam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

public class BoardMapperTests {


	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testInsert() {
		Board board = new Board();
		board.setTitle("Java");
		board.setContent("Java2");
		board.setWriter("chu");
		
		log.info(mapper.insert(board));
	}
	
	
	@Test
	public void testAll() {
		
		PageParam param = new PageParam();
		param.setPage(3);
		
		log.info(mapper.getList(param));
		
		mapper.getList(param).forEach(board -> log.info(board));
		
	}
	
//	@Test
//	public void testAll() {
//		
//		log.info(mapper.getList());
//		
//		mapper.getList().forEach(board -> log.info(board));
//		
//		return null;
//		
//	}
	
}
