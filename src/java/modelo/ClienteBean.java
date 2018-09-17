package modelo;

import java.util.HashMap;
import java.util.Map;

public class ClienteBean {
    
    private int id;
    private String nombres;
    private String apellidos;
    private double sueldo;
    
    public ClienteBean (int id, String nombres, String apellidos, double sueldo) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sueldo = sueldo;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombres() {
        return nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    private static Map clientes;
    
    static {
        clientes = new HashMap();
        clientes.put(1, new ClienteBean(1, "John Fabian", "Timoteo Torres", 2600));
        clientes.put(2, new ClienteBean(2, "Javier", "Soto Torres", 1600));
        clientes.put(3, new ClienteBean(3, "Marcos Antonio", "Echevarria Huacacolque", 3600));
        
    }
    
    public static ClienteBean obtenerCliente (int id) {
        return (ClienteBean)clientes.get(id);
    }
    
}
