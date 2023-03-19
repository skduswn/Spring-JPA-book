# Spring-JPA-book

# Book shop
Spring framework, JPA를 사용한 개인 프로젝트
# 프로젝트 수행 날짜 : 2023년 3월 10일 ~ 2023년 3월 17일
## 주제 : **Spring framework, JPA**를 활용한 책 판매 웹 어플리케이션
### 개인 프로젝트

----------
# 1. 프로젝트 소개

## Q. **web 소개**
### + 회원은 회원가입을 할 수 있다.
### + 회원목록에서 가입한 회원들을 조회할 수 있다.
### + 상품등록에서 상품을 등록할 수 있다.
### + 상품목록에서 등록한 상품들을 조회할 수 있다.
### + 등록된 상품의 내용을 수정할 수 있다.
### + 상품주문에서 회원을 선택하여 책을 주문을 할 수 있다.
### + 주문내역에서 전체주문을 조회할 수 있다.
### + 주문내역에서 회원 별 주문을 조회 할 수 있다.
### + 각 주문들을 취소할 수 있다.


## Q. **개발 기간은 얼마나 되었나요?**
### + 기획 포함 일주일간 제작하였습니다.

----------
## **사용한 에디터**

+ Intellij

## **사용한 기술 스택**

### Spring framework
+ 자바 플랫폼을 위한 오픈소스 애플리케이션 프레임워크로서 엔터프라이즈급 애플리케이션을 개발하기 위한 모든 기능을 종합적으로 제공하는 경량화된 솔루션입니다.

### Java
+ Java언어를 사용하여 개발하였습니다.

### Html
+ thymeleaf 의존성을 추가하였습니다. thymeleaf는 컨트롤러가 전달하는 데이터를 이용해 동적으로 화면을 만들어주는 역할을 하는 뷰 템플릿 엔진입니다.

### Mysql, Mysql workbench
+ DMBS는 Mysql을 사용하였고, 이를 Mysql workbench로 관리하였습니다.

### 주요 의존성
+ 타임리프 의존성을 추가하여 html로 개발하였습니다.
+ Spring Data JPA 의존성 추가하여 개발하였습니다. JPA는 스프링에서 ORM을 쉽게 사용할 수 있게 Spring data로 추상화 시켜둔 것입니다. Spring Data JPA가 제공하는 인터페이스, 애노테이션 등을 사용해서 JPA, Hibernate를 사용하였습니다.

----------
## DB구성
<img width="1030" alt="dbimage" src="https://user-images.githubusercontent.com/85162715/226177365-718a2492-44f4-44e8-b502-6ab250173b40.png">

----------
## 작동
<img width="1030" alt="dbimage" src="https://user-images.githubusercontent.com/85162715/226179055-67e8dbaf-012b-4db0-8f83-85cacffbeacf.png">
<img width="1030" alt="dbimage" src="https://user-images.githubusercontent.com/85162715/226179056-de6131c4-2683-4d64-a756-99c3ab012ec2.png">
<img width="1030" alt="dbimage" src="https://user-images.githubusercontent.com/85162715/226179058-605732db-4ddc-47d0-a15c-5984671c9a82.png">
<img width="1030" alt="dbimage" src="https://user-images.githubusercontent.com/85162715/226179061-2914959c-30bc-4ea2-aead-1c11756f4c39.png">
<img width="1030" alt="dbimage" src="https://user-images.githubusercontent.com/85162715/226179063-2133a8b4-28c5-4901-a589-6668b930ec0b.png">





