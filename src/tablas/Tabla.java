/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

/**
 *
 * @author rufis
 */
public class Tabla {
    private String nombre;
    private String tipo;
    private Integer longitud;
    private String valor;
    private boolean pk;
    private boolean notnull;
    private boolean ai;

    public Tabla() {
    }

    public Tabla(String nombre, String tipo, Integer longitud, String valor, boolean pk, boolean notnull, boolean ai) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.longitud = longitud;
        this.valor = valor;
        this.pk = pk;
        this.notnull = notnull;
        this.ai = ai;
    }
    
    public Tabla(String nombre, String tipo, String valor, boolean pk, boolean notnull, boolean ai) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
        this.pk = pk;
        this.notnull = notnull;
        this.ai = ai;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean isPk() {
        return pk;
    }

    public void setPk(boolean pk) {
        this.pk = pk;
    }

    public boolean isNotnull() {
        return notnull;
    }

    public void setNotnull(boolean notnull) {
        this.notnull = notnull;
    }
    
    public boolean isAi() {
        return ai;
    }

    public void setAi(boolean ai) {
        this.ai = ai;
    }

    @Override
    public String toString() {
        String tabla= "`" + nombre + "` " + tipo;
        
        if (longitud != null) {
           tabla= tabla + "(" + longitud + ")";
        }
        
        if (notnull == true) {
            tabla= tabla + " not null";
        }
        
        if (ai == true) {
            tabla= tabla + " auto_increment ";
        }
        
        if (valor != null) {
            tabla= tabla + " default " + valor;
        }
        
        if (pk == true) {
           tabla= tabla + ", primary key (`" + nombre + "`)";
        }
        
        return tabla;
    }
}
