package com.ritisha.demo.dto;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
@Component
public class Guest {

	private Integer Id;
	private String name;
	@Autowired
	private Entry entry;


}
