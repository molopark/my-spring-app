package com.example.demo.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.MySpringAppApplication;
import com.example.demo.model.User;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest(classes = MySpringAppApplication.class)
@Slf4j
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void checkEnv() {
        String key = System.getenv("JASYPT_ENCRYPTOR_PASSWORD");
        log.info(">>> 현재 테스트 프로세스의 비밀키: " + key);
        assert key != null : "테스트 환경 변수가 주입되지 않았습니다!";
    }

    @Test
    void findAll() {
        List<User> users = userMapper.findAll();
        log.info("=============================================");
        log.info("users={}", users);
        log.info("=============================================");
    }
}
