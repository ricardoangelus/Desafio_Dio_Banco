class Conta_Corrente extends Conta {

    public Conta_Corrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        super.imprimirInfosComuns();
    }
}
