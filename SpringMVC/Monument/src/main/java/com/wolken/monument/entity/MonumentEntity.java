package com.wolken.monument.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

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
@NamedQueries ({
	@NamedQuery(name="getAll", query="from MonumentEntity")
})

public class MonumentEntity {
	@Id
	@GenericGenerator( name ="sam", strategy="increment")
	@GeneratedValue(generator="sam", strategy=GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String area;
	@Column
	private int year;
	@Column
	private String style;

}
