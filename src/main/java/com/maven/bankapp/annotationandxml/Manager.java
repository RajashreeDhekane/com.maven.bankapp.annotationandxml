package com.maven.bankapp.annotationandxml;

import org.springframework.stereotype.Component;

@Component

public class Manager implements Employee {
	public String work() {
		return "Manager start work....";
		
	}
}
