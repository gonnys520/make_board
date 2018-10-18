package org.gonnys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.gonnys.domain.Board;

public interface BoardMapper {

	@Select("select * from tbl_board order by bno desc")
	public List<Board> getListAll();
	
	//int는 count를 의미
	@Insert("insert into tbl_board(title, content, writer) values (#{title}, #{content}, #{writer})")
	public int insert(Board board);
}
