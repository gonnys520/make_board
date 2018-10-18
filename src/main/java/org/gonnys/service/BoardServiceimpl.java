package org.gonnys.service;

import java.util.List;

import org.gonnys.domain.Board;
import org.gonnys.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoardServiceimpl implements BoardService {

	private BoardMapper mapper;
	
	@Override
	public List<Board> getAll() {
		return mapper.getListAll();
	}

	@Override
	public int register(Board board) {
		return mapper.insert(board);
	}
	
	

}
