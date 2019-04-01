package com.teste.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	private static final Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	public PasswordUtils() {
	}
	public static String geraBcrypt(String senha) {
		if (senha == null) {
			return senha;
		} else {
			log.info("Gerando senha");
			BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
			return bCryptEncoder.encode(senha);
		}
	}
}
