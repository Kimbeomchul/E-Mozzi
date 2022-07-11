package game.mozzi.controller;


import game.mozzi.domain.user.User;
import game.mozzi.dto.auth.SignupDto;
import game.mozzi.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/member/v1")
@Api(tags = {"회원가입 API"})
@RequiredArgsConstructor
public class JoinController {

    private final UserService userService;

    @ApiOperation(value = "회원가입",notes = "회원가입 api",response = User.class)
    @PostMapping(value = "/join")
    public ResponseEntity<?> signUp(@Valid SignupDto signupDto) {
        User user = signupDto.toEntity();
        User userEntity = userService.join(user);
        return new ResponseEntity<>(userEntity, HttpStatus.OK); // 회원가입 성공했을 경우 http status code 200 전달
    }

}

