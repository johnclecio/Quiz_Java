package quiz.com.br;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Quizjson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        JSONParser jsonParser = new JSONParser();

        // Caminho para o arquivo JSON
        String caminhoArquivo = "/Users/johnlima/Documents/John_Dev/JAVA/JAVA/Quiz_Java/QuizJson/Quiz/src/main/resources/questoes.json"; // Ajuste o caminho conforme necessário

        // Tentativa de leitura do arquivo JSON
        try (FileReader reader = new FileReader(caminhoArquivo)) {
            // Parsing do conteúdo do arquivo JSON como um JSONObject
            Object obj = jsonParser.parse(reader);

            // Converte para um JSONObject
            JSONObject jsonObject = (JSONObject) obj;

            // Acessando o array "teste"
            JSONArray testeArray = (JSONArray) jsonObject.get("teste");

            // Verificando se o array "teste" tem pelo menos um item
            if (testeArray != null && testeArray.size() > 0) {
                // Iterando sobre todas as perguntas do array "teste"
                for (Object perguntaObj : testeArray) {
                    JSONObject pergunta = (JSONObject) perguntaObj;

                    // Exibindo a pergunta
                    System.out.println("Pergunta: " + pergunta.get("pergunta"));

                    // Exibindo os itens de resposta
                    JSONArray itens = (JSONArray) pergunta.get("itens");
                    if (itens != null) {
                        System.out.println("Opções:");
                        for (Object item : itens) {
                            System.out.println(item);
                        }
                    }

                    // Solicitar a resposta
                    System.out.println("Sua resposta: ");
                    String resposta = scanner.nextLine();

                    // Definindo as respostas corretas para cada pergunta
                    String respostaCorreta = "";
                    if (pergunta.get("pergunta").equals("Qual é a capital da França?")) {
                        respostaCorreta = "c";  // Paris é a capital da França
                    } else if (pergunta.get("pergunta").equals("Qual é a capital do Brazil?")) {
                        respostaCorreta = "d";  // Brasília é a capital do Brasil
                    }else if (pergunta.get("pergunta").equals("Qual é a capital do Estados Unidos?")) {
                        respostaCorreta = "c";  // Qual é a capital do Estados Unidos
                    }

                    // Verificando se a resposta está correta
                    if (resposta.equalsIgnoreCase(respostaCorreta)) {
                        System.out.println("Resposta correta!");
                        score++;
                    } else {
                        System.out.println("Resposta incorreta.");
                    }
                }

            } else {
                System.out.println("O array 'teste' está vazio ou não existe.");
            }

        } catch (FileNotFoundException e) {
            System.err.println("Arquivo JSON não encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        } catch (ParseException e) {
            System.err.println("Erro ao parsear o arquivo JSON: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }

        // Exibindo a pontuação final
        System.out.println("Pontuação final: " + score);
    }
}
