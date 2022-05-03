package service;

import java.util.Date;
import java.util.List;

import dtos.ClienteDto;
import dtos.CuentaDto;
import dtos.MovimientoDto;
import dtos.TitularDto;

public interface BancaService {

   CuentaDto validarCuenta(int numeroCuenta);

   boolean ingresar(int numeroCuenta, int cantidad);

   boolean extraccion(int numeroCuenta, int cantidad);

   boolean transferencia(int numeroCuenta, int toNumeroCuenta, int cantidad);

   List<MovimientoDto> consultarMovimientos(Date start, Date end);
	
}
