package utp.misiontic2022.c2.p39.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_3;
import utp.misiontic2022.c2.p39.reto4.util.JDBCUtilities;

public class RequerimientoDao_3 {

    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> lista = new ArrayList<>();
    
        String sql = "SELECT SUBSTR(l.Nombre,1,3) || SUBSTR(l.Primer_Apellido,1,3)|| SUBSTR(l.Segundo_Apellido,1,3) AS 'Abrev.' FROM Lider l";
        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Requerimiento_3 requerimiento = new Requerimiento_3();
            requerimiento.setAbreviado(rs.getString("Abrev."));
            
            lista.add(requerimiento);
        }
            
        return lista;
    }  
    
}

