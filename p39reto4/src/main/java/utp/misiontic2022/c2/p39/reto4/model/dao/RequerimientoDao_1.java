package utp.misiontic2022.c2.p39.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.p39.reto4.util.JDBCUtilities;

public class RequerimientoDao_1 {

    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {

            ArrayList<Requerimiento_1> lista = new ArrayList<>();
        
        String sql = "SELECT Fecha, ID_Compra, Proveedor, Pagado FROM COMPRA ORDER BY ID_Compra DESC LIMIT 15";
        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Requerimiento_1 requerimiento = new Requerimiento_1();
            requerimiento.setFecha(rs.getString("Fecha"));
            requerimiento.setCodCompra(rs.getString("ID_Compra"));
            requerimiento.setNomProv(rs.getString("Proveedor"));
            requerimiento.setPagado(rs.getString("Pagado"));
            
            lista.add(requerimiento);
        }
            
        return lista;
        
    }  
    
}
