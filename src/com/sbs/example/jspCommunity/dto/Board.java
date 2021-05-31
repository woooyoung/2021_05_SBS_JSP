package com.sbs.example.jspCommunity.dto;

import java.time.LocalDateTime;

import java.util.Map;

import lombok.Data;

@Data
public class Board {
	private int id;
	private LocalDateTime regDate;
	private LocalDateTime updateDate;

	private String code;
	private String name;

	public Board(Map<String, Object> map) {
		this.id = (int) map.get("id");
		this.regDate = (LocalDateTime) map.get("regDate");
		this.updateDate = (LocalDateTime) map.get("updateDate");
		this.code = (String) map.get("code");
		this.name = (String) map.get("name");
	}

}
