
package logica;

/**
 * @author Isabel Pérez
 */
public class Nodo {
    private double nombre;
    private int tllegada;
    private int trafaga;
    private int tcomienzo;
    private int tfinal;
    private int tretorno;
    private int tespera;
    private int prioridad;
    private int estado;
    private int tllegadaAlterno;
    private int acumrafaga;
    private Nodo siguiente; 
    
    public Nodo (double nombre,int tllegada,int trafaga,int prioridad, int tcomienzo,int tfinal,int tretorno,int tespera,int estado,int tllegadaAlterno, int acumrafaga, Nodo siguiente){
      this.nombre=nombre;
      this.tllegada=tllegada;
      this.trafaga=trafaga;
      this.prioridad=prioridad;
      this.tcomienzo=tcomienzo;
      this.tfinal=tfinal;
      this.tretorno=tretorno;
      this.tespera=tespera;
      this.estado=estado;
      this.siguiente=siguiente;
      this.acumrafaga=acumrafaga;
      this.tllegadaAlterno=tllegadaAlterno;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public double getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    
    public int getTllegada() {
       return tllegada;
    }

    public void setTllegada(int tllegada) {
        this.tllegada = tllegada;
    }

    public int getTrafaga() {
        return trafaga;
    }

    public void setTrafaga(int trafaga) {
        this.trafaga = trafaga;
    }

    public int getTcomienzo() {
        return tcomienzo;
    }

    public void setTcomienzo(int tcomienzo) {
        this.tcomienzo = tcomienzo;
    }

    public int getTfinal() {
        return tfinal;
    }

    public void setTfinal(int tfinal) {
        this.tfinal = tfinal;
    }

    public int getTretorno() {
        return tretorno;
    }

    public void setTretorno(int tretorno) {
        this.tretorno = tretorno;
    }

    public int getTespera() {
        return tespera;
    }

    public void setTespera(int tespera) {
        this.tespera = tespera;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getTllegadaAlterno() {
        return tllegadaAlterno;
    }

    public void setTllegadaAlterno(int tllegadaAlterno) {
        this.tllegadaAlterno = tllegadaAlterno;
    }

    public int getAcumrafaga() {
        return acumrafaga;
    }

    public void setAcumrafaga(int acumrafaga) {
        this.acumrafaga = acumrafaga;
    }
    
}
