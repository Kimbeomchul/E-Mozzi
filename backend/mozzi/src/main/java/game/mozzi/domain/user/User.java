package game.mozzi.domain.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

// table 생성됨 ORM OBject 기준으로 테이블 만들어짐
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity // DB에 테이블을 생성 해줌
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //번호 증가 전략이 데이터 베이스를 따라 갑니다.
    private Long id; // 서비스 하는 프로그램이 아니라서 int로도 충분함

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    private LocalDateTime createDate;

    //자동으로 들어가게 할꺼여서

    @PrePersist // 디비에 INSERT 되기 직전에 실행됨
    public void createDate(){
        this.createDate=LocalDateTime.now();
    }

}
