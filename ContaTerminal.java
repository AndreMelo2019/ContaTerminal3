import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        int Numero  = 1021;
        String Agencia  = "067-8";
        String NomeCliente   = "Mario Andrade";
        double Saldo = 237.48;

        System.out.println("Nome do Cliente: " + NomeCliente);
        System.out.println("Número da Conta: " + Numero);
        System.out.println("Agência: " + Agencia);
        System.out.println("Saldo: R$" + Saldo);
    }
}
