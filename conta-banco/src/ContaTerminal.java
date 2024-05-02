import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;


    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();
        contaTerminal.receberEntradas();
        contaTerminal.imprimirEntradas();



    }

    private void receberEntradas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe o numero da conta:");
        this.numero = scanner.nextInt();

        System.out.println("Por favor, informe o numero da agência:");
        this.agencia = scanner.next();

        System.out.println("Por favor, informe nome do cliente:");
        this.nomeCliente = scanner.next();

        System.out.println("Por favor, informe o saldo da conta:");
        this.saldo = scanner.nextDouble();

    }

    private void imprimirEntradas(){
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco," +
                " sua agência é %s, conta %s e seu saldo %s" +
                " já está disponível para saque", this.nomeCliente, this.agencia, this.numero, this.saldo));
    }


}
