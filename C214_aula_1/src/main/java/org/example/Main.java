package org.example;
import org.apache.commons.text.translate.LookupTranslator;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);

        // Autenticação simples
        System.out.print("Usuário: ");
        String usuario = scStr.nextLine();

        System.out.print("Senha: ");
        String senha = scStr.nextLine();

        // Verificação numérica
        Random rand = new Random();
        int verif = rand.nextInt(9000) + 1000; // número entre 1000 e 9999
        System.out.println("Digite o número de verificação: " + verif);
        int entradaVerif = scInt.nextInt();

        if (!usuario.equals("admin") || !senha.equals("1234") || entradaVerif != verif) {
            System.out.println("Acesso negado.");
            return;
        }

        // Tradução
        Map<CharSequence, CharSequence> texto = new HashMap<>();
        texto.put("hello", "olá");
        texto.put("world", "mundo");
        texto.put("the", "a");
        texto.put("quick", "rápida");
        texto.put("brown", "marrom");
        texto.put("fox", "raposa");
        texto.put("jumps", "pula");
        texto.put("over", "por cima");
        texto.put("lazy", "preguiçoso");
        texto.put("dog", "cachorro");

        texto.put("cat", "gato");

        System.out.print("Digite uma frase em inglês: ");
        String frase_orig = scStr.nextLine();
        LookupTranslator translator = new LookupTranslator(texto);
        String frase_trad = translator.translate(frase_orig);

        System.out.println("Tradução: " + frase_trad);
    }
}