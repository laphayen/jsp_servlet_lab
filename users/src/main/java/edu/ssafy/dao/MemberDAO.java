package edu.ssafy.dao;

import java.util.List;

import edu.ssafy.dto.MemberDto;

public interface MemberDAO {
	int insertMember(MemberDto m) throws Exception;
	int updateMember(MemberDto m) throws Exception;
	int deleteMember(MemberDto m) throws Exception;
	List<MemberDto> selectMember() throws Exception;
	List<MemberDto> selectMember(String id) throws Exception;
	
}
