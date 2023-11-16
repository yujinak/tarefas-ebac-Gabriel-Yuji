import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ResultadoNotas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bem vindo ao Sistema de Resultado de Notas.");
        System.out.println("\nAqui, nós calculamos sua média e informamos se está aprovado. \n- Você precisa de 7 ou mais para estar aprovado; \n- Entre 5 e 6.9, fica de recuperação; \n- E reprova com 4.9 ou menos. Portanto:\n");


        float media = 0;

            for(int i = 0; i < 4; i++) {
                System.out.println("Digite sua Nota " + (i + 1) + ": (obs: usar vírgula para decimais)");
                float nota = s.nextFloat();
                if(nota >= 0 && nota <= 10) media += nota;
                else {
                    System.out.println("Número inválido. Sua nota deve estar entre 0 e 10. Digite novamente:");
                    i--;
                }
            }

        media/=4;
        System.out.println("Sua média é: " + media + "\n");

        if (media >= 7) {
            System.out.println("Parabéns, você está aprovado! 👨🏽‍🎓");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Você está de recuperação. \n Mas é só estudar mais um pouco que você consegue! Vamos lá! 📘");
        } else {
            System.out.println("Infelizmente, você está reprovado. 😞");
        }


    }
}