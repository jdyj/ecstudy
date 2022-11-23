package io.seoultech.ecstudy.member;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MemberController {

  private final MemberRepository memberRepository;

  @GetMapping("/members") //localhost:8080/members
  public String getTest() {
    System.out.println("/members 경로로 들어옴");
    return "1.html"; // 1.html
  }

  @GetMapping("/test") // localhost:8080/test
  public String getTest2() {
    System.out.println("/test 경로로 들어옴");
    return "2";
  }

  @PostMapping("/members") // POST localhost:8080/members
  @ResponseBody
  public Member postTest(@RequestBody MemberRequest request) {

    Member member = new Member(request.getUserId(), request.getPassword());
    Member savedMember = memberRepository.save(member);

    memberRepository.findById(1L);
    System.out.println(request.getUserId() + " " + request.getPassword());
    return savedMember;
  }


}
