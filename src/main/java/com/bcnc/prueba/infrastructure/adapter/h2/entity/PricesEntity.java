package com.bcnc.prueba.infrastructure.adapter.h2.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(PricesId.class)
@Table(name = "prices")
public class PricesEntity {
	@Id
	private int brandId;
	@Id
	private LocalDate starDate;
	@Id
	private LocalDate endDate;
	@Column
	private int priceList;
	@Column
	private int productId;
	@Column
	private int priority;
	@Column
	private float price;
	@Column
	private String curr;
}
