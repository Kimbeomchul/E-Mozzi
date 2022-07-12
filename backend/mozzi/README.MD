이게모찌


![image](https://user-images.githubusercontent.com/61217289/177768782-17b7fbef-c9bc-44d6-87da-c5953976b372.png)


2022/07/07 인메모리 h2 데이터베이스 RDS생성전에 임시 사용용임..

TO-DO 현재 스프링 시큐리티 때문에 in memory DB 접근 불가해서..
https://github.com/HomoEfficio/dev-tips/blob/master/Spring%20Security%EC%99%80%20h2-console%20%ED%95%A8%EA%BB%98%20%EC%93%B0%EA%B8%B0.md
해당 글 참고해야함.. 

spring jwt 추가
https://emgc.tistory.com/148

2022-07-11
swagger 주소 : http://localhost:8080/swagger-ui.html#/
swagger 추가 , 오전 회의 반영으로 일단은 security 삭제
![image](https://user-images.githubusercontent.com/61217289/178290989-208b3a62-2950-4ed1-ab06-dd22c0fbe57c.png)

스웨거에서 api 테스트하면 될듯? (로컬 환경에서 실행후)

h2 DB 접속 URL
http://localhost:8080/h2-console
ID : sa
PW : 1234

![image](https://user-images.githubusercontent.com/61217289/178385810-faeb88c2-1f7e-49d1-88ef-72e09a3add6a.png)


### 의존성

- Sring Boot DevTools
- Lombok
- Spring Data JPA
- MariaDB Driver
- Spring Security
- Spring Web
- oauth2-client

```xml
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	implementation 'org.springframework.boot:spring-boot-starter-jdbc'
	compileOnly 'org.projectlombok:lombok'
	developmentOnly 'org.springframework.boot:spring-boot-devtools'

	// swagger 추가
	//https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui
	implementation group: 'io.springfox', name: 'springfox-swagger-ui', version: '2.9.2'
	implementation group: 'io.springfox', name: 'springfox-swagger2', version: '2.9.2'

	//validation 추가
	implementation 'org.springframework.boot:spring-boot-starter-validation'

	//	TODO AWS RDS 생성후 추후 제거 필요
	implementation 'com.h2database:h2:1.4.200'

	annotationProcessor 'org.projectlombok:lombok'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
	testImplementation 'org.springframework.security:spring-security-test'```


