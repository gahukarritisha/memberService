package com.ritisha.demo.dto;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@Component
@NoArgsConstructor
public class Document {

    private Integer Id;
    private String number;
    private String name;
    private byte[] document;
    private String type;


}
