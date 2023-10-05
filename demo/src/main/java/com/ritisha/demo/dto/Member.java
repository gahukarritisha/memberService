package com.ritisha.demo.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;




@NoArgsConstructor
@Component
@Data
public class Member {
	private Integer Id;
//	@NotNull
	private String firstName;
//	@NotNull
	private String middleName;
//	@NotNull
	private String lastName;
	
	private AccountType type;
//	@NotNull
	private String address;
	@Autowired
//	@NotNull
	private Location location;
//	@NotNull
	private Long contact;
	private Long alternateContact;
//	@NotNull
	private String email;
//	@NotNull
	private String userName;
//	@NotNull
	private String password;

	private Status status=Status.INACTIVE;
	@Autowired
	private Document document;


//	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "member")
//	private List<Entry> entries;




}
