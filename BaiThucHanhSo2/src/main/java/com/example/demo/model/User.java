package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
	public CharSequence getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPassword(String encode) {
		// TODO Auto-generated method stub
		
	}
}