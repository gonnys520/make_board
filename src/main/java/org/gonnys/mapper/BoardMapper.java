package org.gonnys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.gonnys.domain.Board;
import org.gonnys.domain.PageParam;

public interface BoardMapper {
	
	@Update("update tbl_board set title = #{title}, content = #{content} where bno = #{bno}")
	public int update(Board board);

	@Select("select * from tbl_board order by bno desc limit #{skip}, #{display}")
	public List<Board> getList(PageParam param);
	
	//int는 count를 의미
	@Insert("insert into tbl_board(title, content, writer) values (#{title}, #{content}, #{writer})")
	public int insert(Board board);
	
	@Select("select count(*) from tbl_board")
	public int count();
	
	@Select("select * from tbl_board where bno = #{bno}")
	public Board get(PageParam param);
	
	@Delete("delete from tbl_board where bno= #{bno}")
	public int delete(PageParam param);
}
