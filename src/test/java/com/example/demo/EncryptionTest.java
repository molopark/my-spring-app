package com.example.demo;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EncryptionTest {

    public static void main(String[] args) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        // # 시스템 환경 변수 JASYPT_ENCRYPTOR_PASSWORD 값을 사용함
        String encPassword = System.getenv("JASYPT_ENCRYPTOR_PASSWORD");
        if (encPassword == null || encPassword.isEmpty()) {
            log.info("에러: 환경 변수 JASYPT_ENCRYPTOR_PASSWORD가 설정되지 않았습니다.");
            return;
        }
        
        encryptor.setPassword(encPassword); // 암호화에 사용할 키 (노출 주의)
        encryptor.setAlgorithm("PBEWithMD5AndDES");
        encryptor.setIvGenerator(new org.jasypt.iv.NoIvGenerator());
        String encryptUser = encryptor.encrypt("user"); // 실제 username 비번
        log.info("user ENC(" + encryptUser + ")");

        String encryptPass = encryptor.encrypt("password"); // 실제 DB 비번
        log.info("passs ENC(" + encryptPass + ")");
    }
}
