# 스프링 DB 1편 - 데이터 접근 핵심 원리

## 목차
1. JDBC 이해
2. 커넥션풀과 데이터소스 이해

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