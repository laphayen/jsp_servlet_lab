package com.ssafy.dto;

public class MemberDto {
	
	/*
	 * 1. 객체 필드
	 * 2. get, set, to
	 * 3. 생성자 , 빈 생성자
	 */
	
	// 1
	private String memberId;
	private String memberPw;
	private String memberName;
	
	// 2
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName + "]";
	}
	
	
	// 3
	public MemberDto() {
		
	}
	public MemberDto(String memberId, String memberPw, String memberName) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
	}
	
}
