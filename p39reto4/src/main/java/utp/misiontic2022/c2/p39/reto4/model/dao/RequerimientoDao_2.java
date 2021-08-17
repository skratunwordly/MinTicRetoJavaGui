package utp.misiontic2022.c2.p39.reto4.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.p39.reto4.util.JDBCUtilities;

public class RequerimientoDao_2 {

    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList<Requerimiento_2> lista = new ArrayList<>();
    
        String sql = "SELECT p.Fecha_Inicio AS 'Fec. Ini.', p.Ciudad AS 'Nombre Ciudad', p.Constructora AS 'Nom. Constructora', l.Nombre || ' ' || l.Segundo_Apellido AS 'Nombre Lider', t.Codigo_Tipo AS 'Codigo Tipo', t.Estrato FROM proyecto p INNER JOIN Lider l ON (p.ID_Lider = l.ID_Lider) INNER JOIN Tipo t ON (p.ID_Tipo = t.ID_Tipo) WHERE p.Fecha_Inicio >= '2020-01-01' AND p.Fecha_Inicio <= '2020-07-09'  AND p.Ciudad = 'Ibague'";
        Connection conn = JDBCUtilities.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Requerimiento_2 requerimiento = new Requerimiento_2();
            requerimiento.setFechaInicio(rs.getString("Fec. Ini."));
            requerimiento.setNomCy(rs.getString("Nombre Ciudad"));
            requerimiento.setNomCons(rs.getString("Nom. Constructora"));
            requerimiento.setLidNomCom(rs.getString("Nombre Lider"));
            requerimiento.setCodTipo(rs.getString("Codigo Tipo"));
            requerimiento.setEstra(rs.getString("Estrato"));
            
            lista.add(requerimiento);
        }
            
        return lista;
    }  
    
}

