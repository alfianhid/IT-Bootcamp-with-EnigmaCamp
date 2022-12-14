package com.bni.bookshop.service;

import com.bni.bookshop.constant.ResponseMessage;
import com.bni.bookshop.entity.Member;
import com.bni.bookshop.exception.DataNotFoundException;
import com.bni.bookshop.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberRepository memberRepository;

    @Override
    public Member addMember(Member member) {

        return memberRepository.save(member);
    }

    @Override
    public Member getMemberById(Integer id) {
        verifyId(id);
        return memberRepository.findById(id).get();
    }

    @Override
    public List<Member> getAllMember() {
        return memberRepository.findAll();
    }

    @Override
    public Member updateMember(Member member) {
        verifyId(member.getId());
        return memberRepository.save(member);
    }

    @Override
    public void deleteMemberById(Integer id) {
        verifyId(id);
        memberRepository.deleteById(id);
    }

    // Define some validation
    private void verifyId(Integer id){
        if(!memberRepository.findById(id).isPresent()){
            String message = String.format(ResponseMessage.NOT_FOUND_MESSAGE, "member", id);
            throw new DataNotFoundException(message);
        }
    }

}
