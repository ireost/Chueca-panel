package ar.com.chueca.panel.servicio.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.chueca.panel.entidades.Productos;
import ar.com.chueca.panel.repositorio.ProductosRepositorio;
import ar.com.chueca.panel.servicio.ProductosServicio;

@Service
public class ProductosServicioImpl implements ProductosServicio {
	
	@Autowired
	private ProductosRepositorio productosRepositorio;
	
	@Override
	public String guardar(Productos producto) {
		productosRepositorio.save(producto);
		return null;
	}
	
	@Override
	public Iterable<Productos> traerProductos() { 
		return productosRepositorio.findAll();
	}

	public ProductosRepositorio getProductosRepositorio() {
		return productosRepositorio;
	}

	public void setProductosRepositorio(ProductosRepositorio productosRepositorio) {
		this.productosRepositorio = productosRepositorio;
	}

	@Override
	public Optional<Productos> editarProductos(Long id) {
		Optional<Productos> prod = productosRepositorio.findById(id);
		return prod;
		
	}

	@Override
	public void eliminarProductos(Long id) {
		productosRepositorio.deleteById(id);
		
	}

	

}
