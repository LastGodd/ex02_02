package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.domain.BoardVO;

public interface BoardMapper {

	// 전체 / 단건 / 등록 / 삭제 / 수정
	// 검색한 결과가 무엇이며 그에 맞는 타입을 리턴 시키도록 한다.
	// @Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();

	public BoardVO read(Long bno);

	public int insertSelectKey(BoardVO board);

	public int delete(Long bno);

	public int update(BoardVO board);

}
