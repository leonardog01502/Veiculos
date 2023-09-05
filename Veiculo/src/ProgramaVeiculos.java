public class ProgramaVeiculos {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2022, 85000.0, 4);
        Moto moto1 = new Moto("Honda", "CBR500R", 2021, 25000.0, 500);
        Caminhao caminhao1 = new Caminhao("Volvo", "FH16", 2020, 300000.0, 40.0);


        System.out.println("Informações do Carro:");
        carro1.imprimirInformacoes();
        carro1.imprimirInformacoesAdicionais();


        System.out.println("\nInformações da Moto:");
        moto1.imprimirInformacoes();
        moto1.imprimirInformacoesAdicionais();


        System.out.println("\nInformações do Caminhão:");
        caminhao1.imprimirInformacoes();
        caminhao1.imprimirInformacoesAdicionais();
    }
}