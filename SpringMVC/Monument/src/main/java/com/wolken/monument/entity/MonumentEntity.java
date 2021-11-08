package com.wolken.monument.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class MonumentEntity {
	@Id
	private int id;
	private String name;
	private String area;
	private int year;
	private String style;

}
