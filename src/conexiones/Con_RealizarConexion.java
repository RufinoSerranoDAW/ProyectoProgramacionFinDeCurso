/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

import interfaces.I_Conexion;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import ventanaprincipal.Main;

/**
 *
 * @author rufis
 */
public class Con_RealizarConexion implements I_Conexion {
    
    @Override
    public Connection hazConexionNoBBDD(String servidorEntra, Integer puertoEntra, String usuarioEntra, String contrasenaEntra) throws SQLException{
        String direccionDB= "jdbc:mysql://" + servidorEntra + ":" + puertoEntra + "/?useSSL=false";
        Connection con= null;

        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        con= DriverManager.getConnection(direccionDB, usuarioEntra, contrasenaEntra);     
        
        return con;
    }

    @Override
    public Connection hazConexionBBDD(String servidorEntra, Integer puertoEntra, String baseDeDatosEntra, String usuarioEntra, String contrasenaEntra) throws SQLException {
        String direccionDB= "jdbc:mysql://" + servidorEntra + ":" + puertoEntra + "/" + baseDeDatosEntra + "?useSSL=false";
        Connection con= null;

        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        con= DriverManager.getConnection(direccionDB, usuarioEntra, contrasenaEntra);     
        
        return con;
    }

    @Override
    public ArrayList<String> listaBases(Connection con) {
        ArrayList<String> listaBaseDeDatos= new ArrayList();
        String db= null;

        try {
            DatabaseMetaData meta = con.getMetaData();
            ResultSet resultSet = meta.getCatalogs();

            while (resultSet.next()) {
                db = resultSet.getString("TABLE_CAT");
                listaBaseDeDatos.add(db);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return listaBaseDeDatos;
    }

    @Override
    public ArrayList<String> listaTablas(Connection con) {
        ArrayList<String> listaTablas= new ArrayList();
        String tb= null;

        try {
            DatabaseMetaData meta = con.getMetaData();
            ResultSet resultSet = meta.getTables(null, null, "%", null);
            while (resultSet.next()) {
                tb= resultSet.getString(3);
                listaTablas.add(tb);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return listaTablas;
    }
    
    @Override
    public ArrayList<String> listaColumnas(Connection con, String tabla) {
        ArrayList<String> listaColumnas= new ArrayList();

        try {
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery("select * from " + tabla);
            ResultSetMetaData md= rs.getMetaData();
            
            int ncolumnas= md.getColumnCount();
            
            for (int i=1; i <= ncolumnas; i++) {
                listaColumnas.add(md.getColumnName(i));
                System.out.println(md.getColumnName(i));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return listaColumnas;
    }
    
}
