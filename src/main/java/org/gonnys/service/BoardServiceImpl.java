package org.gonnys.service;

import java.util.List;

import org.gonnys.domain.Board;
import org.gonnys.domain.PageParam;
import org.gonnys.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

	@Override
	public int getTotal() {
		return mapper.count();
	}

	private BoardMapper mapper;

	@Override
	public int register(Board board) {
		return mapper.insert(board);
	}

	@Override
	public List<Board> getList(PageParam param) {
		return mapper.getList(param);
	}

	@Override
	public Board get(PageParam param) {
		return mapper.get(param);
	}

	@Override
	public int remove(PageParam param) {
		return mapper.delete(param);
	}

	@Override
	public int modify(Board board) {
		return mapper.update(board);
	}

}