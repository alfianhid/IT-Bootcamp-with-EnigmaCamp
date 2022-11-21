package com.alfianhid.dao;
import com.alfianhid.model.Member;

import java.util.List;

public interface MemberDAO {
    public void insertMember(Member memberData);
    public Member getMemberByID(Integer memberID);
    public List<String> getMemberList();
    public void updateMember(Member memberData, Integer memberID);
    public void deleteMember(Member memberData, Integer memberID);
}
