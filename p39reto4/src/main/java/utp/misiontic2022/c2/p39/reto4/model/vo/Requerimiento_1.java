package utp.misiontic2022.c2.p39.reto4.model.vo;

public class Requerimiento_1 {

    private String fecha;
    private String idCompra;
    private String nombreProveedor;
    private String pagado;
    
    public String getFecha(){
        return this.fecha;
    }
    
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    
    
    public String getCodCompra(){
        return this.idCompra;
    }
    
    public void setCodCompra(String idCompra){
        this.idCompra = idCompra;
    }
    
    
    
    public String getNomProv(){
        return this.nombreProveedor;
    }
    
    public void setNomProv(String nombreProveedor){
        this.nombreProveedor = nombreProveedor;
    }
    
    
    
    public String getPagado(){
        return this.pagado;
    }
    
    public void setPagado(String pagado){
        this.pagado = pagado;
    }

}
