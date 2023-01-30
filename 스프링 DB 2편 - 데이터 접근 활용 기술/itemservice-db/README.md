# 스프링 DB 2편 - 데이터 접근 활용 기술

## 목차
1. 데이터 접근 기술 - 시작
2. 데이터 접근 기술 - 스프링 JdbcTemplate
3. 데이터 접근 기술 - 테스트


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