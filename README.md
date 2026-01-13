# VSCODE 사용

## extend
Extension Pack for Java Auto Config
Language Support for Java(TM) by Red Hat

## 환경 설정
- application.yml 에서 사용하는 db는 docker container 로 실행중인 db 사용 (database 별도)


## 테이블 생성
CREATE TABLE users (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
insert into users values (1, 'molo', 'molo@kkk.com', now());
