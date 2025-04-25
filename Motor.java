package models;

public class Motor {
    private String tipo;
    private Integer potencia;

    public Motor(String tipo, Integer potencia){
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo () {
        return tipo;
    }
    public void getTipo(String tipo){
        this.tipo = tipo;
    }
    public void setPotencia(Integer potencia){
        this.potencia = potencia;
    }
    public String toString(){
        return "Motor [tipo : " + tipo + ", Potência: " + potencia + "cv]";
    }
}


