package com.ritisha.demo.service;

import com.ritisha.demo.dto.Member;
import com.ritisha.demo.dto.MemberDTO;
import com.ritisha.demo.helper.MemberHelper;
import com.ritisha.demo.repo.MemberDTOrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
@Service
public class MemberService
{
    @Autowired
    public MemberDTOrepository memberRepo;
    @Autowired
    public MemberHelper helper;

    public ResponseEntity<List<Member>> getAll(){
         List<MemberDTO> old =memberRepo.findAll();
         List<Member> newList =new LinkedList<>();

        for (MemberDTO obj:old) {
            newList.add(helper.convert(obj));

        }

        return ResponseEntity.ok(newList);

    }
}
