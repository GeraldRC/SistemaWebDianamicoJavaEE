package com.dao;

import java.util.ArrayList;

import com.interfaces.IUsuarioDao;
import com.model.Usuario;

public class UsuarioDao implements IUsuarioDao {

	@Override
	public boolean registrarUser(Usuario u) {
		return false;
	}

	@Override
	public boolean updateUser(Usuario u) {
		return false;
	}

	@Override
	public boolean eliminarUser(int id) {
		return false;
	}

	@Override
	public ArrayList<Usuario> obtenerUsuario() {
		return null;
	}

	@Override
	public String obtenerRol(int rol) {
		return null;
	}

}
