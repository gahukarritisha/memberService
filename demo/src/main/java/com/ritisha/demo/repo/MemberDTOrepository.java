package com.ritisha.demo.repo;

import com.ritisha.demo.dto.MemberDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MemberDTOrepository extends JpaRepository<MemberDTO,Integer>
{

}
