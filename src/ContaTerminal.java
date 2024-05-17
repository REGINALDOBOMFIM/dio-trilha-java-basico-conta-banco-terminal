import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);


      System.out.print("Digite sua conta: ");
      int conta = scanner.nextInt();

      Scanner scanner2 = new Scanner(System.in);

      System.out.print("Digite sua agencia: ");
      String agencia = scanner2.nextLine();

      Scanner scanner3 = new Scanner(System.in);

      System.out.print("Digite seu nome: ");
      String nome = scanner3.nextLine();

      System.out.print("Qual é o seu saldo: ");
      Double saldo = scanner.nextDouble();

      System.out.print("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

      scanner.close();
    }
}
