import java.util.Scanner;

public class Aula2idade {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu NOME COMPLETO:");
        String nome = leitor.nextLine();
        
        System.out.println("Digite sua Idade:");
        double idade = leitor.nextDouble();
        
        System.out.println("Meu nome completo = " + nome);
        if (idade < 13) {
            System.out.println("Crianca com idade = " + idade + " anos");
            
        } else if (idade < 18) {
            System.out.println("Adolescente com idade = " + idade + " anos");
            
        } else {
            System.out.println("Adulto com idade = " + idade + " anos");
            
        }

        leitor.close();
    }
}
