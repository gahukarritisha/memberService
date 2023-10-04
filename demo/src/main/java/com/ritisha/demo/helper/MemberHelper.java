package com.ritisha.demo.helper;

import com.ritisha.demo.dto.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MemberHelper
{
    public Member convert(MemberDTO member)
    {
        Member m = new Member();

        m.setEmail(member.getEmail());
        m.setType(getType(member.getType()));
        Document document = new Document();
        document.setType(member.getScanDocuments());
        document.setNumber(member.getDocno());
        document.setName(member.getOwnerName());
        m.setDocument(document);
        Location location=new Location();
        location.setPincode(Integer.parseInt(member.getPincode()));
        m.setLocation(location);
        m.setStatus(Status.ACTIVE);
        setNames(member,m);
        m.setAddress(member.getAddress());
        m.setContact(Long.parseLong(member.getContactPhone().toString()));
        m.setAlternateContact(Long.parseLong(member.getMobileNo().toString()));
        m.setEmail(member.getEmail());
        m.setUserName(member.getUsername());
        m.setPassword(member.getPassword());
        return m;
    }

    private void setNames(MemberDTO member, Member m) {

        List<String> names = Arrays.asList(member.getOwnerName().split(" "));
        if (names.size()>2){
            m.setFirstName(names.get(0));
            m.setMiddleName(names.get(1));
            m.setLastName(names.get(2));
        }
        else {
            m.setFirstName(member.getOwnerName());
        }
    }

    private AccountType getType(@NotNull String type) {

        if(type.equals("tenant")||type.equals("tenancy"))
            return AccountType.TENANT;
        if (type.equals("org"))
            return AccountType.ORGANIZATION;
        if(type.equals("vehicle")||type.equals("vehicles"))
            return AccountType.VEHICLE;
        if (type.equals("society"))
            return AccountType.HOUSING_SOCIETY;
        if (type.equals("property"))
            return AccountType.PROPERTY;


        return AccountType.HOTEL;
    }

}
