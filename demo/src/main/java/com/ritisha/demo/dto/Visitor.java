package com.ritisha.demo.dto;


import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Data
@NoArgsConstructor
@Component
public class Visitor {
	private Integer Id;
//	@NotNull
	private String firstName;
//	@NotNull
	private String middleName;
//	@NotNull
	private String lastName;
//	@NotNull
	private String gender;
	private String email;
	private Long contact;
	private String address;
	@Autowired
	private Location location;
	@Autowired
	private Document document;
	private String vehicleNumber;
//	@OneToMany(mappedBy = "visitor")
//	@JsonIgnoreProperties
//	@JsonIgnore
//	private List<Entry> entries;

}
