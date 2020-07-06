package com.interfaces;

import com.model.ReporteAccidente;

public interface IAccidenteDao {
	
	public boolean registrarAccidente (ReporteAccidente r);
	public boolean comprobarDeuda (String rutCliente);

}
