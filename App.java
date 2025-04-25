import models.*;

public class App {
    public static void main(String[] args) throws Exception {

        Motor motorGasolina = new Motor("Gasolina", 120);
        Motor motorEletrico = new Motor("Elétrico", 200);

        Condutor julia = new Condutor("Julia", "00001");
        Condutor maria = new Condutor("Maria", "00002");

        Carro carro1 = new Carro("Toyota", "Corolla", "ABC-1234", motorGasolina, julia);
        Carro carro2 = new Carro("Tesla", "Model S", "XYZ-5678", motorEletrico);

        carro1.exibirInformacoes();
        carro2.exibirInformacoes();


        carro1.setCondutor(maria);
        carro1.exibirInformacoes();
    }
}
