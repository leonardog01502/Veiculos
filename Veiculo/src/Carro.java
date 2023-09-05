class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int ano, double preco, int quantidadeDePortas) {
        super(marca, modelo, ano, preco);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public void imprimirInformacoesAdicionais() {
        System.out.println("Quantidade de Portas: " + quantidadeDePortas);
    }
}