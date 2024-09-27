package com.ssafy.service;

import java.util.List;

import com.ssafy.dto.MemberDto;

public interface MemberService {
	int insertMember(MemberDto m) throws Exception;
	int updateMember(MemberDto m) throws Exception;
	int deleteMember(MemberDto m) throws Exception;
	List<MemberDto> selectMember() throws Exception;
	MemberDto selectMember(String memberId) throws Exception;
	MemberDto login(String memberId, String memberPw) throws Exception;
}
