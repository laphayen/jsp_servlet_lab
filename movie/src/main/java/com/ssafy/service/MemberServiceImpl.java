package com.ssafy.service;

import java.util.List;

import com.ssafy.dao.MemberDAO;
import com.ssafy.dao.MemberDaoImpl;
import com.ssafy.dto.MemberDto;

public class MemberServiceImpl implements MemberService {

	private MemberDAO dao = new MemberDaoImpl();
	
	@Override
	public int insertMember(MemberDto m) throws Exception {
		// TODO Auto-generated method stub
		return dao.insertMember(m);
	}

	@Override
	public int updateMember(MemberDto m) throws Exception {
		// TODO Auto-generated method stub
		return dao.updateMember(m);
	}

	@Override
	public int deleteMember(MemberDto m) throws Exception {
		// TODO Auto-generated method stub
		return dao.deleteMember(m);
	}

	@Override
	public List<MemberDto> selectMember() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectMember();
	}

	@Override
	public MemberDto selectMember(String memberId) throws Exception {
		// TODO Auto-generated method stub
		return dao.selectMember(memberId);
	}

	@Override
	public MemberDto login(String memberId, String memberPw) throws Exception {
		// TODO Auto-generated method stub
		return dao.login(memberId, memberPw);
	}

}
