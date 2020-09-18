package ar.com.chueca.panel.servicio;


import java.util.Optional;

import ar.com.chueca.panel.entidades.Productos;

public interface ProductosServicio {

	String guardar(Productos producto);

	Iterable<Productos> traerProductos();

	public Optional<Productos> editarProductos(Long id);

	void eliminarProductos(Long id);

	

	
	

}
