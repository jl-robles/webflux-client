package com.jlrm.springbootwebflux.client.service;

import org.springframework.http.codec.multipart.FilePart;

import com.jlrm.springbootwebflux.client.models.Producto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IProductoService {

	public Flux<Producto> findAll();
	
	public Mono<Producto> findById(String id);
	
	public Mono<Producto> save(Producto producto);
	
	public Mono<Producto> editar(Producto producto, String id);
	
	public Mono<Void> delete(String id);
	
	public Mono<Producto> upload(FilePart file, String id);
}
