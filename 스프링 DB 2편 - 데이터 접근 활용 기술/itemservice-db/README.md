# 스프링 DB 2편 - 데이터 접근 활용 기술

## 목차
1. 데이터 접근 기술 - 시작
2. 데이터 접근 기술 - 스프링 JdbcTemplate
3. 데이터 접근 기술 - 테스트
4. 데이터 접근 기술 - MyBatis


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