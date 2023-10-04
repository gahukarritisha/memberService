package com.ritisha.demo.dto;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class State {

    Integer Id;
    String name;
    List<District> districts;
}
