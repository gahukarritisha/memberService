package com.ritisha.demo.helper;

import com.ritisha.demo.dto.*;
import org.springframework.stereotype.Component;

@Component
public class MemberHelper
{
    public Member convert(MemberDTO member)
    {
        Member m = new Member();
        m.setEmail(member.getEmail());
        Document document = new Document();
        document.setType(member.getScanDocuments());
        document.setNumber(member.getDocno());
        document.setName(member.getOwnerName());
        m.setDocument(document);
        Location location=new Location();
        location.setPincode(Integer.parseInt(member.getPincode()));
        m.setLocation(location);
        m.setStatus(Status.ACTIVE);
        m.setFirstName(member.getOwnerName().split(" ")[0]);
        m.setMiddleName(member.getOwnerName().split(" ")[1]);
        m.setLastName(member.getOwnerName().split(" ")[2]);
        m.setAddress(member.getAddress());
        m.setContact(Long.parseLong(member.getContactPhone().toString()));
        m.setAlternateContact(Long.parseLong(member.getMobileNo().toString()));
        m.setEmail(member.getEmail());
        m.setUserName(member.getUsername());
        m.setPassword(member.getPassword());
        return m;
    }

}
