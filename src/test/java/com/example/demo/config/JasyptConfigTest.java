package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;  
import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class JasyptConfigTest {
    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Test
    void decryptionTest() {
        log.info("Jasypt username from config: {}", username);
        log.info("Jasypt password from config: {}", password);
    }
}
