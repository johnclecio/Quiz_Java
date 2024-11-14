import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Pergunta 1
        System.out.println("1. Qual é o maior país do mundo em extensão territorial?");
        System.out.println("""
                a) Canadá
                b) China
                c) Estados Unidos
                d) Rússia
                """);
        System.out.print("Digite sua resposta (a, b, c ou d): ");
        String resposta1 = scanner.nextLine();

        if (resposta1.equalsIgnoreCase("d")) {
            System.out.println("Você acertou!");
            score++;
        } else {
            System.out.println("Erro. A resposta correta é 'd) Rússia'.");
        }

        // Pergunta 2
        System.out.println("\n2. Quem pintou a obra famosa chamada Mona Lisa?");
        System.out.println("""
                a) Michelangelo
                b) Leonardo da Vinci
                c) Pablo Picasso
                d) Vincent van Gogh
                """);
        System.out.print("Digite sua resposta (a, b, c ou d): ");
        String resposta2 = scanner.nextLine();

        if (resposta2.equalsIgnoreCase("b")) {
            System.out.println("Você acertou!");
            score++;
        } else {
            System.out.println("Erro. A resposta correta é 'b) Leonardo da Vinci'.");
        }

        // Pergunta 3
        System.out.println("\n3. Qual é o planeta mais próximo do Sol?");
        System.out.println("""
                a) Marte
                b) Terra
                c) Vênus
                d) Mercúrio
                """);
        System.out.print("Digite sua resposta (a, b, c ou d): " );
        String resposta3 = scanner.nextLine();

        if (resposta3.equalsIgnoreCase("d")) {
            System.out.println("Você acertou!");
            score++;
        } else {
            System.out.println("Erro. A resposta correta é 'd) Mercúrio'.");
        }

        // Pergunta 4
        System.out.println("\n4. Em que ano o homem pisou na Lua pela primeira vez?");
        System.out.println("""
                a) 1965
                b) 1969
                c) 1972
                d) 1980
                """);
        System.out.print("Digite sua resposta (a, b, c ou d): ");
        String resposta4 = scanner.nextLine();

        if (resposta4.equalsIgnoreCase("b")) {
            System.out.println("Você acertou!");
            score++;
        } else {
            System.out.println("Erro. A resposta correta é 'b) 1969'.");
        }

        // Pergunta 5
        System.out.println("\n5. Qual é o idioma mais falado no mundo?");
        System.out.println("""
                a) Espanhol
                b) Inglês
                c) Mandarim
                d) Hindi
                """);
        System.out.print("Digite sua resposta (a, b, c ou d): ");
        String resposta5 = scanner.nextLine();

        if (resposta5.equalsIgnoreCase("c")) {
            System.out.println("Você acertou!");
            score++;
        } else {
            System.out.println("Erro. A resposta correta é 'c) Mandarim'.");
        }

        // Resultado final
        System.out.println("\nSeu total de acertos foi: " + score + " de 5.");

        
    }
}
