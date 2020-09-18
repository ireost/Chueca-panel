package ar.com.chueca.panel.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.com.chueca.panel.entidades.Productos;

@Repository
public interface ProductosRepositorio extends CrudRepository<Productos, Long> {

}
