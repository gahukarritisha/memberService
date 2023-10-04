package com.ritisha.demo.dto;

//created by Akash Tripathi
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;


@Data
@NoArgsConstructor
@Component
public class Entry {

	private Integer Id;
//	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//	@JsonIgnore
//	private Member member;
//	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	@JsonIgnore

	@Autowired
	private Visitor visitor;
	private List<String> remark;


}
