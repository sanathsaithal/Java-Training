package com.wolken.monument.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MonumentDto {
	private String name;
	private String area;
	private int year;
	private String style;
}
