import java.util.Scanner;

public class RodarAplicacao {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nome = scan.nextLine();
        cliente.setNome(nome);

        Conta cc = new Conta_Corrente(cliente);
        Conta poupanca = new Conta_Poupanca(cliente);

        cc.depositar(100);
        poupanca.depositar(200);
        cc.transferir(50,poupanca);
        poupanca.transferir(150,cc);

        System.out.println("*** Extrato Conta Corrente ***");
        cc.imprimirInfosComuns();
        System.out.println("\n*** Extrato Conta Poupança ***");
        poupanca.imprimirInfosComuns();
    }
}
