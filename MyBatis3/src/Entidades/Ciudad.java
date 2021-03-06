
package Entidades;

import java.util.List;

/**
 *
 * @author Oliverco
 */
public class Ciudad {
    private Integer Id;
    private String Codigo;
    private String Nombre;
    private Pais oPais;
    private List<Cliente> lCliente;
    

    public Ciudad() {
    }

    public Ciudad(Integer Id) {
        this.Id = Id;
    }

    public Ciudad(Integer Id, String Codigo, String Nombre, Pais oPais, List<Cliente> lCliente) {
        this.Id = Id;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.oPais = oPais;
        this.lCliente = lCliente;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Pais getoPais() {
        return oPais;
    }

    public void setoPais(Pais oPais) {
        this.oPais = oPais;
    }

    public List<Cliente> getlCliente() {
        return lCliente;
    }

    public void setlCliente(List<Cliente> lCliente) {
        this.lCliente = lCliente;
    }

    
    @Override
    public String toString(){
        return this.Nombre;
    }
    
}
