package com.rafaelsantos.uri2609.dto;

import com.rafaelsantos.uri2609.projections.CategorySumProjection;

public class CategorySumDTO {
	
	private String name;
	private Long sum;
	
	public CategorySumDTO() {}

	public CategorySumDTO(String name, Long sum) {
		super();
		this.name = name;
		this.sum = sum;
	}
	
	public CategorySumDTO(CategorySumProjection projection) {
		name = projection.getName();
		sum = projection.getSum();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSum() {
		return sum;
	}

	public void setSum(Long sum) {
		this.sum = sum;
	}
}