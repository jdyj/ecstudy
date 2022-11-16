package io.seoultech.ecstudy.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberRequest {

  private String userId;

  private String password;

}
