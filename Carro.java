package models;

public class Carro {
    private String placa;
    private String modelo;
    private String marca;
    private Condutor condutor;
    private Motor motor;

    public Carro(String placa, String modelo, String marca, Condutor condutor, Motor motor){
        this.placa = placa;
        this.modelo = marca;
        this.marca = modelo;
        this.condutor = condutor;
        this.motor = motor;

    }

    public Carro(String placa, String modelo, String marca, Motor motor, Condutor condutor){
        this.placa = placa;
        this.modelo = marca;
        this.marca = modelo;
        this.motor = motor;
        this.condutor = condutor;

    }
    
    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Condutor getCondutor() {
        return condutor;
    }
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        if (motor != null) {
            System.out.println(motor);
        } else {
            System.out.println("Nenhum motor atribuído.");
        }
        if (condutor != null) {
            System.out.println(condutor);
        } else {
            System.out.println("Nenhum condutor atribuído.");
        }
    }


    public void trocarCondutor(Condutor novocondutor){
        this.condutor = novocondutor;

    
    }

    public void trocaMotor(Motor novoMotor){
        this.motor = novoMotor;
    }
}

   


