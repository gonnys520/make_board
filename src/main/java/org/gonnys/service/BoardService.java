package org.gonnys.service;

import java.util.List;

import org.gonnys.domain.Board;

public interface BoardService {

	public List<Board> getAll();
	
	public int register(Board board);
}
