package service;

import java.util.List;

import model.Producto;

public interface BuscadorService {
	List<Producto> buscar(String tematica);
	void alta(Producto p);
	void baja(String nombreProducto);
	void modificar(Producto p);
}
