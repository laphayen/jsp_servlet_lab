package com.ssafy.dao;

import java.util.List;

import com.ssafy.dto.MemberDto;

public interface MemberDAO {
	
	/*
	 * 유저 삽입, 수정, 삭제, 조회, 전체, 조회, 로그인
	 */
	
	int insertMember(MemberDto m) throws Exception;
	int updateMember(MemberDto m) throws Exception;
	int deleteMember(MemberDto m) throws Exception;
	List<MemberDto> selectMember() throws Exception;
	MemberDto selectMember(String memberId) throws Exception;
	MemberDto login(String memberId, String memberPw) throws Exception;
}
