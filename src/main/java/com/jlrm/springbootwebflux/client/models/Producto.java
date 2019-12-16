package com.jlrm.springbootwebflux.client.models;

import java.util.Date;

import lombok.Data;

@Data
public class Producto {

	private String id;
	private String name;
	private Double price;
	private Date createAt;
	private Categoria categoria;
	private String foto;
}
