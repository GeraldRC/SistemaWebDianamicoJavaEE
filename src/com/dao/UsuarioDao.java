package com.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.conexion.Conexion;
import com.interfaces.IUsuarioDao;
import com.model.Cliente;
import com.model.Usuario;

public class UsuarioDao implements IUsuarioDao {
	
	private static Statement st = null;
    private static Connection con = null;
    private static ResultSet rs = null;
    
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
		String res="";
		try {
			String sql = "SELECT rol FROM rol INNER JOIN usuario ON usuario.id = rol.id where usuario.id='"+rol+"'";
            con = Conexion.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
               res = rs.getString(1);
            }
            st.close();
            rs.close();
		}catch(SQLException e1){
            System.out.println(e1.getMessage());

        }catch(Exception e2){
            System.out.println(e2.getMessage());
        }
		
		return res;
	}

	@Override
	public Usuario comprobarUsuario(String login, String pass) {
		
		Usuario u = new Usuario();
        try{
        	String sql = "select * from usuario where login='"+login+"' and password='"+pass+"'";
            con = Conexion.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                u.setId(rs.getInt(1));
                u.setId_rol(rs.getInt(2));
                u.setNombre(rs.getString(3));
                u.setApellido(rs.getString(4));
                u.setContrasena(rs.getString(5));
                u.setLogin(rs.getString(6));
            }
            st.close();
            rs.close();
        }catch(SQLException e1){
            System.out.println(e1.getMessage());

        }catch(Exception e2){
            System.out.println(e2.getMessage());
        }
        return u;

	}

	@Override
	public Cliente ObtenerDatosCliente(int id_usu) {
		
		Cliente c = new Cliente();
        try{
        	String sql = "select * from cliente inner join usuario on usuario.id=cliente.usuario_id where usuario.id='"+id_usu+"'";
            con = Conexion.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            	c.setRut(rs.getString(1));
            	c.setRazonsocial(rs.getString(2));
            	c.setDireccion(rs.getString(3));
            	c.setComuna(rs.getString(4));
            	c.setTelefono(rs.getInt(5));
            	c.setActeconomica(rs.getString(6));
            	c.setTipoEmpresa(rs.getString(7));
            }
            st.close();
            rs.close();
        }catch(SQLException e1){
            System.out.println(e1.getMessage());

        }catch(Exception e2){
            System.out.println(e2.getMessage());
        }
        return c;

	}

}
