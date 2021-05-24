/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author rufis
 */
public interface I_Conexion {
    public Connection hazConexionNoBBDD(String servidorEntra, Integer puertoEntra, String usuarioEntra, String contrasenaEntra) throws SQLException;
    public Connection hazConexionBBDD(String servidorEntra, Integer puertoEntra, String baseDeDatosEntra, String usuarioEntra, String contrasenaEntra) throws SQLException;
    public ArrayList<String> listaBases(Connection con);
    public ArrayList<String> listaTablas(Connection con);
    public ArrayList<String> listaColumnas(Connection con, String tabla);
}
