class Conta_Poupanca extends Conta {

    public Conta_Poupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirInfosComuns();
    }

}
