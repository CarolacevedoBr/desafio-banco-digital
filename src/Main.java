public class Main {

    public static void main(String[] args) {
        Cliente carolina = new Cliente();
        carolina.setNome("Carol");

        Conta cc = new ContaCorrente(carolina);
        Conta poupanca = new ContaPoupanca(carolina);

        cc.adicionarLimite(200);
        cc.depositar(150);
        cc.transferir(200,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
