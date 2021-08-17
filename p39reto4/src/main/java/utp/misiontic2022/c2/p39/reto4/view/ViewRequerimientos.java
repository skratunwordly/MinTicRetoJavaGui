package utp.misiontic2022.c2.p39.reto4.view;

import java.util.ArrayList;
import javax.swing.*;

import utp.misiontic2022.c2.p39.reto4.controller.ControllerRequerimientos;

import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_1;
import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_2;
import utp.misiontic2022.c2.p39.reto4.model.vo.Requerimiento_3;


public class ViewRequerimientos {

    public static final ControllerRequerimientos controlador = new ControllerRequerimientos();

    public static void requerimiento1(){
        try {
            ArrayList<Requerimiento_1> resultado1 = controlador.consultarRequerimiento1();
            String s = "";
            for(Requerimiento_1 req:resultado1){
                s += req.getFecha()+" "+req.getCodCompra()+" "+req.getNomProv()+" "+req.getPagado() +"\n";
            }

            JFrame f = new JFrame();

            JTextArea area = new JTextArea(s);
            area.setBounds(10, 30, 200, 200);

            f.add(area);
            f.setSize(400,500);
            f.setVisible(true);

        }   catch (Exception e) {
            System.err.println(e);
            }
    }

    public static void requerimiento2(){
        try {
            ArrayList<Requerimiento_2> resultado2 = controlador.consultarRequerimiento2();
            String sa ="";

            for(Requerimiento_2 req:resultado2){
                sa += req.getFechaInicio()+' '+req.getNomCy()+' '+req.getNomCons()+' '+req.getLidNomCom()+' '+req.getCodTipo()+' '+req.getEstra() +"\n";
            }

            JFrame f = new JFrame();

            JTextArea area = new JTextArea(sa);
            area.setBounds(10, 30, 200, 200);

            f.add(area);
            f.setSize(400,500);
            f.setVisible(true);

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<Requerimiento_3> resultado3 = controlador.consultarRequerimiento3();
            String se = "";
            for(Requerimiento_3 req:resultado3){
                se += req.getAbreviado()+"\n";
            }

            JFrame f = new JFrame();

            JTextArea area = new JTextArea(se);
            area.setBounds(10, 30, 200, 200);

            f.add(area);
            f.setSize(400,500);
            f.setVisible(true);

            }catch (Exception e) {
            System.err.println(e);
        }
    }
    
}

