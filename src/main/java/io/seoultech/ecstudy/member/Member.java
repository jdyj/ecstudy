package io.seoultech.ecstudy.member;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String userId;

  private String password;

  public Member(String userId, String password) {
    this.userId = userId;
    this.password = password;
  }

  public Member() {
  }
}
