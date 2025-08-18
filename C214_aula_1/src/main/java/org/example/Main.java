package org.example;
import org.apache.commons.text.translate.LookupTranslator;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        // entrar com nome de usuário, senha e depois com verificação numérica
        Scanner scStr = new Scanner(System.in);
        String frase_orig, frase_trad;
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

        // the quick brown fox jumps over the lazy dog

        System.out.print("Type in an english phrase: ");
        frase_orig = scStr.nextLine();
        LookupTranslator translator = new LookupTranslator(texto);

        frase_trad = translator.translate(frase_orig);

        System.out.println(frase_trad);
    }
}