package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.conexion.Conexion;
import com.interfaces.IAccidenteDao;
import com.model.ReporteAccidente;

public class ReporteAccidenteDao implements IAccidenteDao{
	
	private static Statement st = null;
    private static Connection con = null;
    private static ResultSet rs = null;
    
	@Override
	public boolean registrarAccidente(ReporteAccidente r) {
		boolean res = false;
		
		Calendar fecha = new GregorianCalendar();
		
		int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
		
        String ano1= String.valueOf(año);
        String mes1= String.valueOf(mes+1);
        String dia1= String.valueOf(dia);
        
		try{
			con = Conexion.getConexion();
			st = con.createStatement();
			String sql = "INSERT INTO REPORTE_ACCIDENTE VALUES('"+r.getId()+"','"+dia1+ "/"+mes1+"/"+ano1+"','"+r.getClienteRut()+"')";
			st.execute(sql);
			String sql2 ="INSERT INTO TRABAJADOR VALUES('"+r.getRutTrabajador()+"','"+r.getNombreTrabajador()+"','"+r.getDireccion()+"','"+r.getComuna()+"','"+r.getTelefono()+"','"+r.getSexo()+"')";
			st.execute(sql2);
			String sql3 ="INSERT INTO TRABAJADOR_ACC VALUES('"+r.getRutTrabajador()+"','"+r.getId()+"')";
			st.execute(sql3);
			res = true;
			st.close();
			con.close();
		}catch(SQLException e1){
            System.out.println(e1.getMessage());
        }catch(Exception e2){
            System.out.println(e2.getMessage());
        }
		return res;
	}

	@Override
	public boolean comprobarDeuda(String rutCliente) {
		boolean res = false;
		String val = "";
		try {
			String sql = "select estado_pago from estado_pago INNER join pagos on pagos.estado_pago_id=estado_pago.id where pagos.cliente_rut='"+rutCliente+"'";
            con = Conexion.getConexion();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
               val= rs.getString(1);
               if(val.equalsIgnoreCase("deuda")) {
            	   res=true;
               }
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
}
