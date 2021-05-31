package com.sbs.example.jspCommunity.dto;

import java.time.LocalDateTime;
import java.util.Map;

public class Member {
	private int id;
	private LocalDateTime regDate;
	private LocalDateTime updateDate;
	private String loginId;
	private String loginPw;
	private String name;
	private String nickname;
	private String email;
	private int authLevel;

	private String extra__writer;
	private String extra__boardName;
	private String extra__boardCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPw() {
		return loginPw;
	}

	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAuthLevel() {
		return authLevel;
	}

	public void setAuthLevel(int authLevel) {
		this.authLevel = authLevel;
	}

	public String getExtra__writer() {
		return extra__writer;
	}

	public void setExtra__writer(String extra__writer) {
		this.extra__writer = extra__writer;
	}

	public String getExtra__boardName() {
		return extra__boardName;
	}

	public void setExtra__boardName(String extra__boardName) {
		this.extra__boardName = extra__boardName;
	}

	public String getExtra__boardCode() {
		return extra__boardCode;
	}

	public void setExtra__boardCode(String extra__boardCode) {
		this.extra__boardCode = extra__boardCode;
	}

	public Member(Map<String, Object> map) {
		this.id = (int) map.get("id");
		this.regDate = (LocalDateTime) map.get("regDate");
		this.updateDate = (LocalDateTime) map.get("updateDate");
		this.loginId = (String) map.get("loginId");
		this.loginPw = (String) map.get("loginPw");
		this.name = (String) map.get("name");
		this.nickname = (String) map.get("nickname");
		this.email = (String) map.get("email");
		this.authLevel = (int) map.get("authLevel");
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", regDate=" + regDate + ", updateDate=" + updateDate + ", loginId=" + loginId
				+ ", loginPw=" + loginPw + ", name=" + name + ", nickname=" + nickname + ", email=" + email
				+ ", authLevel=" + authLevel + ", extra__writer=" + extra__writer + ", extra__boardName="
				+ extra__boardName + ", extra__boardCode=" + extra__boardCode + "]";
	}

}
