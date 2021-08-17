package utp.misiontic2022.c2.p39.reto4.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p39.reto4.model.dao.RequerimientoDao_1;
import utp.misiontic2022.c2.p39.reto4.model.dao.RequerimientoDao_2;
import utp.misiontic2022.c2.p39.reto4.model.dao.RequerimientoDao_3;
import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_3;

public class ControllerRequerimientos {
        // Su código
    
        public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        RequerimientoDao_1 r1 = new RequerimientoDao_1();
        return r1.requerimiento1();
        }
    
        public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
            RequerimientoDao_2 r2 = new RequerimientoDao_2();
            return r2.requerimiento2();
        }
    
        public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
            RequerimientoDao_3 r3 = new RequerimientoDao_3();
            return r3.requerimiento3();
        }


}
