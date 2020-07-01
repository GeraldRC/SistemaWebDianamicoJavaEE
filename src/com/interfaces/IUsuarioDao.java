package com.interfaces;
import java.util.ArrayList;

import com.model.Usuario;

public interface IUsuarioDao {
	
	public boolean  registrarUser(Usuario u);
	public boolean updateUser(Usuario u);
	public boolean eliminarUser(int id);
	public ArrayList<Usuario> obtenerUsuario();
	public String obtenerRol(int rol);
		

}
