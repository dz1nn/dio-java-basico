import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner 
        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da Conta!");
        numeroConta = Integer.parseInt(entrada.nextLine());

        System.out.println("Por favor, digite o número da Agência!");
        agencia = entrada.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");

        nomeCliente = entrada.nextLine();


        System.out.println("Por favor, digite o saldo da Conta!");
        saldo = Double.parseDouble(entrada.nextLine());
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo: R$ " + saldo +".Já está disponível para saque!");
    
        entrada.close();
    }
}
