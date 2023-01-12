# 스프링 DB 1편 - 데이터 접근 핵심 원리

## 목차
1. JDBC 이해
2. 커넥션풀과 데이터소스 이해
3. 트랜잭션 이해
4. 스프링과 문제 해결 - 트랜잭션

## 1. JDBC 이해   
#### package hello.jdbc.repository.MemberRepositoryV0   
#### JDBC Driver 사용 과거 낡은방식의 DB 커넥션 방법 지금은 거의 사용하지 않는다.
#### 핵심 문법 : DriverManager, Connection, PreparedStatement, ResultSet 클래스

## 2. 커넥션풀과 데이터소스 이해
#### package hello.jdbc.repository.MemberRepositoryV1
#### DataSource - 설정과 사용의 분리가 장점
#### HikariDataSource - 히카리 CP 커넥션 풀 관리 디폴트 10개
#### 커넥션 풀 - 풀에서 가져다 재사용하기 때문에 커넥션 속도가 빠르다.
#### 핵심 문법 : DataSource, HikariDataSource 클래스

## 3. 트랜잭션 이해
#### package hello.jdbc.repository.MemberRepositoryV2
#### package hello.jdbc.service.MemberServiceV1, V2
#### 트랜잭션 - ACID 원자성(Atomicity), 일관성(Consistency), 격리성(Isolation), 지속성(Durability)
#### 자동 커밋, 수동 커밋 - set autocommit false;
#### 롤백 - rollback
#### DB락 - 트랜잭션 시 락이 걸림. 락을 획득해야 변경가능. 조회 시는 select for update 로 락 획득 가능
#### 핵심 문법 : SQL 트랜잭션, DB 락

## 4. 스프링과 문제 해결 - 트랜잭션
#### package hello.jdbc.repository.MemberRepositoryV3
#### package hello.jdbc.service.MemberServiceV3
#### PlatformTransactionManager - 트랜잭션 매니저 인터페이스로 커밋과 롤백이 구현
#### DataSourceUtils - 트랜잭션 동기화 사용하여 커넥션 저장
#### @Transactional - 스프링 AOP 이용 서비스와 트랜잭션 코드 분리
#### 핵심 문법 : PlatformTransactionManager, DataSourceUtils, @Transactional