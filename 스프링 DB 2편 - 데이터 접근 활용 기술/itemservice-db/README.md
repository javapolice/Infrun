# 스프링 DB 2편 - 데이터 접근 활용 기술

## 목차
1. 데이터 접근 기술 - 시작
2. 데이터 접근 기술 - 스프링 JdbcTemplate
3. 데이터 접근 기술 - 테스트
4. 데이터 접근 기술 - MyBatis
5. 데이터 접근 기술 - JPA
6. 데이터 접근 기술 - 스프링 데이터 JPA
7. 데이터 접근 기술 - Querydsl


## 1. 데이터 접근 기술 - 시작  
####  메모리 DB 구현체 : MemoryItemRepository
#### 프로필 기능 이용해 local 과 test 빈 자동주입 분리
#### 핵심 문법 : 메모리 DB, 스프링 프로필 기능

## 2. 데이터 접근 기술 - 스프링 JdbcTemplate
#### JdbcTemplate : JdbcTemplateItemRepositoryV1 파라미터 순서 중요 ? 이용
#### NamedParameterJdbcTemplate : JdbcTemplateItemRepositoryV2 파라미터 이름 매핑
#### SimpleJdbcInsert : JdbcTemplateItemRepositoryV3 jdbc insert 편의 기능
#### SqlParameterSource : 파라미터 sql 변환 클래스
#### 핵심 문법 : JdbcTemplate, NamedParameterJdbcTemplate, SqlParameterSource, SimpleJdbcInsert

## 3. 데이터 접근 기술 - 테스트
####  @SpringBootTest : DB 이용 테스트
#### @Transactional : 커밋과 롤백 클래스,메서드 레벨 사용
#### 임베디드 모드 DB : h2 데이터베이스 JVM 메모리 테스트용 DB 기능
#### 핵심 문법 : @SpringBootTest, @Transactional, 임베디드 모드 DB

## 4. 데이터 접근 기술 - MyBatis
####  @Mapper : 인터페이스 생성 자동으로 구현체 생성(프록시기술)
#### mapper.xml : 인터페이스와 연동하여 sql 쿼리작성(동적쿼리작성의 편리함)
#### myBatis.properties : 마이바티스 관련 설정 작업
#### myBatis는 DataSource가 필요없다. @mapper로 자동 커넥션
#### 핵심 문법 : @Mapper, mapper.xml, myBatis.properties

## 5. 데이터 접근 기술 - JPA
#### @Entity : JPA가 관리하는 객체 데이터
#### EntityManager : JPA 사용 시 필수 생성 EntityManager.persist, EntityManager.find
#### jpql : (Java Persistence Query Language) 객체지향 쿼리 언어
#### 테이블이 아닌 엔티티 객체의 매핑 정보를 활용
#### 핵심 문법 : @Entity, EntityManager, jpql

## 6. 데이터 접근 기술 - 스프링 데이터 JPA
#### JpaRepository : 스프링 데이터 JPA를 이용하기 위한 인터페이스 상속
#### 기본적인 CRUD 구현 및 쿼리메서드 제공
#### @Query : 메서드에 붙여 JPQL 사용
#### 핵심 문법 : JpaRepository, @Query

## 7. 데이터 접근 기술 - Querydsl
#### JPAQueryFactory : EntityManager 를 이용해 동적쿼리를 작성하게 해준다.
#### BooleanBuilder : 동적 쿼리 작성시 사용
#### BooleanExpression : 동적 쿼리 작성시 사용
#### 핵심 문법 : JPAQueryFactory, BooleanBuilder, BooleanExpression