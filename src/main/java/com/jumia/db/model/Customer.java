package com.jumia.db.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@EqualsAndHashCode
@Setter
@Getter
@Entity
@NoArgsConstructor
public class Customer {
	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 50)
	private String name;
	@Column(length = 50)
	private String phone;

	public Customer(Long id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
}
