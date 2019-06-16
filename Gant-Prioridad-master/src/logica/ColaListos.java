/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author estudiantes
 */
public class ColaListos {
    private Nodo cabecera;
    private Nodo primero;
    private Nodo ultimo;
    private ColaTerminados terminados;
    private ColaBloqueados bloqueados;
    static int cuantum=4;
    int tam=0;
    
    public ColaListos(ColaTerminados terminados) {
        bloqueados=new ColaBloqueados(this);
        cabecera=new Nodo (0,0,0,100000,0,0,0,0,0,0,0,cabecera);
        this.terminados=terminados;
        primero=cabecera;
        ultimo=cabecera;
        tam=0;
    }
    public boolean estaVacia (){
        return primero==cabecera;
    }
    public int size (){
        return tam;
    }

     public Nodo enqueue (double nombre,int tllegada,int trafaga,int tprioridad,int tllegadaAlterno,int acumraf){
        Nodo aux = new Nodo(nombre,tllegada,trafaga,tprioridad,0,0,0,0, (int) (Math.random() * 2+1),tllegadaAlterno,acumraf,cabecera);
       
        if (estaVacia()){
           primero=aux;
           cabecera.setSiguiente(primero);
        }
        else{
                ultimo.setSiguiente(aux);
        }
        tam++;
        ultimo=aux;
       return aux;
    } 
     public Nodo enqueue (int nombre,int tllegada){
        Nodo aux = new Nodo(nombre,tllegada,(int)(Math.random()*10+5),(int)(Math.random()*8+1),0,0,0,0,(int)(Math.random()*2+1),tllegada,0,cabecera);
        if (estaVacia()){
           primero=aux;
           cabecera.setSiguiente(primero);
        }
        else{
                ultimo.setSiguiente(aux);
        }
        tam++;
        ultimo=aux;
       return aux;
    } 
   public Nodo dequeue(){
       if (!estaVacia()){
            Nodo aux2=primero;
            Nodo aux=primero.getSiguiente();
            primero=aux;
            tam--;
            if (aux2.getTrafaga()>4){
              aux2.setTfinal(aux2.getTcomienzo()+4);
              
            }
            else{
              aux2.setTfinal(aux2.getTcomienzo()+aux2.getTrafaga());
            }
            //if (aux2.getEstado()==2){
               //bloqueados.enqueue(aux2.getNombre(),aux2.getTllegada(),aux2.getTrafaga(),aux2.getPrioridad(),aux2.getTllegadaAlterno(),aux2.getAcumrafaga());
            //}
            //else{
                if(aux2.getTrafaga()>cuantum){
                    aux2.setAcumrafaga(aux2.getAcumrafaga()+4);
                    terminados.enqueue(aux2.getNombre(),aux2.getTllegada(),aux2.getTrafaga(),aux2.getPrioridad(),aux2.getTllegadaAlterno(),aux2.getAcumrafaga());
                    bloqueados.enqueue(aux2.getNombre()+0.1,aux2.getTllegada(),aux2.getTrafaga()-cuantum,aux2.getPrioridad(),aux2.getTfinal(),aux2.getAcumrafaga());
                    //this.enqueue(aux2.getNombre()+0.1,aux2.getTllegada(),aux2.getTrafaga()-cuantum,aux2.getPrioridad(),aux2.getTfinal(),aux2.getAcumrafaga());
                }else{
                     terminados.enqueue(aux2.getNombre(),aux2.getTllegada(),aux2.getTrafaga(),aux2.getPrioridad(),aux2.getTllegadaAlterno(),aux2.getAcumrafaga()+aux2.getTrafaga());
                }
                aux.setTcomienzo(aux2.getTfinal());
            //}
            
            return aux2;
        }
        else{
            return null;
       }
   }
       
    
     
     
       
       /**
        if (!estaVacia()){
            Nodo aux2=primero;
            if(tam==1){
               aux2.setTcomienzo(0);
            }
            aux2.setTfinal(aux2.getTcomienzo()+aux2.getTrafaga());
            aux2.setTretorno(aux2.getTfinal()-aux2.getTllegada());
            aux2.setTespera(aux2.getTretorno()-aux2.getTrafaga());
            Nodo aux=primero.getSiguiente();
            primero=aux;
            primero.setTcomienzo(aux2.getTfinal());
            return aux2;
        }
        else{
            return null;
        }
        **/
    

    public ColaTerminados getTerminados() {
        return terminados;
    }

    public void setTerminados(ColaTerminados terminados) {
        this.terminados = terminados;
    }

    public ColaBloqueados getBloqueados() {
        return bloqueados;
    }

    public void setBloqueados(ColaBloqueados bloqueados) {
        this.bloqueados = bloqueados;
    }
   
   
    public String Mostrar() {
        if (estaVacia()){
            return "No hay procesos en cola";
        }
        else{
            String cadena = "Nombre \t T llegada \t T rafaga \t Prioridad \n";
            Nodo aux = primero;
            
            while (aux!=cabecera){
                cadena+= aux.getNombre() +"\t\t"+aux.getTllegada()+"\t\t"+aux.getTrafaga()+"\t\t"+aux.getPrioridad()+"\n";
                aux =aux.getSiguiente();
            }        
            return cadena;
        }
    }
   
}
