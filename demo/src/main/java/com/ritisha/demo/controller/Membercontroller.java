package com.ritisha.demo.controller;


import com.ritisha.demo.dto.Member;
import com.ritisha.demo.dto.MemberDTO;
import com.ritisha.demo.repo.MemberDTOrepository;
import com.ritisha.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
  public class Membercontroller
{
    @Autowired
    private MemberService memberService;

    @GetMapping("/getMembers")
    public ResponseEntity<List<Member>> getAll(){

        return memberService.getAll();
    }
    @Autowired
    private MemberDTOrepository memberDTOrepository;
    @GetMapping("/getOld")
    public ResponseEntity getOld(){

        return ResponseEntity.ok(memberDTOrepository.findAll());
    }

}
