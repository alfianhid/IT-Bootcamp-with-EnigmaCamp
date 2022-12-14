package com.bni.bookshop.service;

import com.bni.bookshop.entity.Member;

import java.util.List;

public interface MemberService {
    // Define methods to be used on MemberServiceImpl
    public Member addMember(Member member);
    public Member getMemberById(Integer id);
    public List<Member> getAllMember();
    public Member updateMember(Member member);
    public void deleteMemberById(Integer id);
}
