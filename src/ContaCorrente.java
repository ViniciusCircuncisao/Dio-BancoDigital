public class ContaCorrente extends  Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("Imprimindo extrato Conta Corrente");
        super.imprimirExtrato();
    }
}
