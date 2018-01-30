package com.wj.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppPropertyBean {

    @Value("${jwt.expirationtime}")
    private String expirationTime;

	public String getExpirationTime() {
		return expirationTime;
	}

}