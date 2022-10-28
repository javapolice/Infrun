# springMVC1

### VERSION 정보
* bootspring v 2.7.5
* java 11 / gradle / war
* intellij project
* created 22-11-26 회사 사무실
* artifact : hello.servlet
* implements : springweb, lombok
---
### 내용
* RequestHeaderServlet
  * URL : /request-header
  * Request 관련 메소드 정리 ( 주로 헤더 정보 조회법들)
* RequestParamServlet
  * URL : /request-param
  * Request 파라미터 조회 관련 메소드 정리
* RequestBodyStringServlet
  * URL : /request-body-string
  * Request API 메시지 바디 - 단순 텍스트 요청
* RequestBodyJsonServlet
  * URL : /request-body-json
  * Request API 메시지 바디 - JSON 요청
* ResponseHeaderServlet
  * URL : /response-header
  * Response 관련 메소드 정리 (헤더, 쿠키 등)
* ResponseHtmlServlet
  * URL : /response-html
  * Response 단순 텍스트, HTML
* ResponseJsonServlet
  * URL : /response-json
  * Response API JSON
---
* web.servlet
  * 자바로 회원가입 등록 및 조회 전부 처리
* web.servletmvc
  * jsp로 포워드 회원가입 등록 및 조회 전부 처리
  * mvc 도입