package com.sbs.example.jspCommunity.dto;

import java.time.LocalDateTime;
import java.util.Map;

public class Board {
	private int id;
	private LocalDateTime regDate;
	private LocalDateTime updateDate;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String code;
	private String name;

	public Board(Map<String, Object> map) {
		this.id = (int) map.get("id");
		this.regDate = (LocalDateTime) map.get("regDate");
		this.updateDate = (LocalDateTime) map.get("updateDate");
		this.code = (String) map.get("code");
		this.name = (String) map.get("name");
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", regDate=" + regDate + ", updateDate=" + updateDate + ", code=" + code + ", name="
				+ name + "]";
	}

}
