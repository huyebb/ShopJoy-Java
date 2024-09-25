package com.edu.shop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
	private int productId;
	private String name;
	private int quantity;
	private double untiPrice;
	private String size;
	private String image;
	

}
