package utp.misiontic2022.c2.p39.reto4.model.vo;

public class Requerimiento_2 {

     private String fecha_Inicio;
     private String nombreCiudad;
     private String nombreConstructora;
     private String liderNombre;
     private String Codigo_Tipo;
     private String estrato;
     
     public String getFechaInicio(){
          return this.fecha_Inicio;
     }
     
     public void setFechaInicio(String fecha_Inicio){
          this.fecha_Inicio = fecha_Inicio;
     }
     
     
     
     public String getNomCy(){
          return this.nombreCiudad;
     }
     
     public void setNomCy(String nombreCiudad){
          this.nombreCiudad = nombreCiudad;
     }
     
     
     
     public String getNomCons(){
          return this.nombreConstructora;
     }
     
     public void setNomCons(String nombreConstructora){
          this.nombreConstructora = nombreConstructora;
     }
     
     
     
     public String getLidNomCom(){
          return this.liderNombre;
     }
     
     public void setLidNomCom(String liderNombre){
          this.liderNombre = liderNombre;
     }


     public String getCodTipo(){
          return this.Codigo_Tipo;
     }
     
     public void setCodTipo(String Codigo_Tipo){
          this.Codigo_Tipo = Codigo_Tipo;
     }
     
     
     
     public String getEstra(){
          return this.estrato;
     }
     
     public void setEstra(String estrato){
          this.estrato = estrato;
     }
}
