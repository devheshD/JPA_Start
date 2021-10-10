# JPA_Programming
자바 ORM 표준 JPA 프로그래밍

1. SQL 중심적인 개발의 문제점
2. 패러다임의 불일치 (객체와 디비의 불일치)
    - 관계형 디비는 데이터를 잘 정규화해서 보관하는게 목표
    - 객체는 속성과 기능을 잘 캡슐화해서 사용하는게 목표
      객체를 SQL로 결국엔 변환해서 코드를 짜야된다.

# JPA
- Java Persistence API (자바 진영의 ORM 기술 표준)
- ORM?
    - Object-relational mapping(객체 관계 매핑)
    - 객체는 객체대로 설계하고 관계형 디비는 관계형 디비대로 설계
- 인터페이스의 모음


## JPA 동작 - 저장
<img width="913" alt="스크린샷 2021-10-10 오후 2 17 08" src="https://user-images.githubusercontent.com/72979429/136683283-1f6e0d9d-ece3-4f0b-8f31-3860bcc5c8ab.png">
- JPA가 멤버 객체를 분석해 적절한 SQL 쿼리를 생성 후 JDBC API를 생성해서 Insert

## JPA를 왜 사용해야 하는가?
- 유지보수 : 기존코드의 필드 변경시 모든 SQL을 수정해야한다.
- 패러다임의 불일치 해결
- 동일한 트랙잭션에서 조회한 엔티티는 같음을 보장
