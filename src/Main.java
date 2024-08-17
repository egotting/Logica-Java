
// Arquivo Main ou mais conhecido como Classe Main Metodo principal onde vai ser inciado todo o codigo
// Todo arquivo é chamado é Classe em programação orientada a objetos mais conhecido como POO
/*
    Programação existe codinomes como, Classe, Metodos, Construtores, Tipos Primitivos..
    Estruturas Condicionais e Estruturas de Repetição
 */

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //System e um metodo que puxa o out q puxa o metodo println
        // se vc quiser ver mais sobre cada metodo segura control e clica em cima do nome que vc vai ser redirecioando pro codigo fonte
        System.out.println("Hello world"); // este é um metodo que vai imprimir oq for colocado dentro do parenteses

        // OPERADORES ARITMETICOS

        // +, -, /, %, *
        // Adição, Subtração, Divisão, Resto, Multiplicação
        System.out.println("-----------OPERADORES ARITMETICOS-----------");
        System.out.println(1 + 1);
        System.out.println(2 - 1);
        System.out.println(4 / 2);
        System.out.println(3 % 2);
        System.out.println(2 * 2);

        // OPERADORES DE COMPARAÇÃO
        System.out.println("-----------OPERADORES DE COMPARAÇÃO-----------");
        // == igual
        // != diferente
        // > maior que
        // < menor que
        // < maior ou igual a
        // > menor ou igual a
        System.out.println("3 == 2? " + (3 == 2)); // => false
        System.out.println("3 != 2? " + (3 != 2)); // => true
        System.out.println("3 > 2? " + (3 > 2)); // => true
        System.out.println("3 < 2? " + (3 < 2)); // => false
        System.out.println("2 <= 2? " + (2 <= 2)); // => true
        System.out.println("2 >= 2? " + (2 >= 2)); // => true

        // OPERADORES BOLLEANOS
        // && e
        // || ou
        // == igual
        // ! não
        System.out.println("-----------OPERADORES BOLLEANOS-----------");
        System.out.println("3 > 2 && 2 > 3? " + ((3 > 2) && (2 > 3))); // => false
        System.out.println("3 > 2 || 2 > 3? " + ((3 > 2) || (2 > 3))); // => true
        System.out.println("!(3 == 2)? " + (!(3 == 2))); // => true

        // TIPOS PRIMITIVOS
        int n = 1;
        double nd = 1.0;
        float nf = 1.0f;
        long  nl = (long) 1.0; // mesma coisa do de cima soq aguenta mais numeros
        String s = "test"; // string é uma agrupamento de chars que se forma uma frase ou multiplas palavras
        // string em java acaba tendo um tratamento diferente a alura explica bem https://www.alura.com.br/apostila-java-orientacao-objetos/o-pacote-java-lang#:~:text=String%20%C3%A9%20uma%20classe%20em,new%20String(%22fj11%22)%3B
        char c = 'a'; // char n passa de um unico caractere
        boolean bo = true; // verdadeiro ou falso


        // ESTRUTURA DE CONDICIONAL
        System.out.println("-----------ESTRUTURA DE CONDICIONAL-----------");
        boolean tourf = true;
        if (tourf == false) { // se tourf for falso
            System.out.println("é falso"); // vai colocar no terminal "é falso"

        } else {
            System.out.println("é verdadeiro"); // caso contrario ele ira ser verdadeiro e vai imprimir "é verdadeiro"
        }

        int dia = 1; // numero do dia da semana
        switch (dia) {
            case 1: // caso dia seja 1 ira imprimir segunda
                System.out.println("Segunda");
                break; // Serve pra assim que cair no caso ele ira quebrar e n passara para o proximo teste com e sem o break para vc entender melhor
            case 2: // caso dia seja 2 ira imprimir terça
                System.out.println("Terça");
                break;
            case 3: // caso dia seja 3 ira imprimir Quarta
                System.out.println("Quarta");
            case 4: // caso dia seja 4 ira imprimir Quinta
                System.out.println("Quinta");
                break;
            case 5:// caso dia seja 5 ira imprimir Sexta
                System.out.println("Sexta");
                break;
            case 6:// caso dia seja 6 ira imprimir Sabado
                System.out.println("Sabado");
                break;
            case 7:// caso dia seja 7 ira imprimir Domingo
                System.out.println("Domingo");
                break;
            default: // caso n seja digitado nenhum numero ira cair aq
                System.out.println("Coloque um numero de 1 a 7 para ver os dias da semana");
                break;
        }

        // ESTRUTURA DE REPETIÇÃO

        System.out.println("-----------ESTRUTURA DE REPETIÇÃO-----------");

        int x = 0;
        int y = 10;
        while (x <= y) { // enquanto x for menor ou igual a y ele vai adicionar mais 1 para o x. resumidamente enquanto
            // o x n for o mesmo valor do y ele vai repetir essa mesma operação até se igualar
            int quantidade = x++;
            System.out.println("quantas vezes foi passada: " + quantidade);
        }


        int quantidade = 0;
        do
        { // Mesma coisa de antesa diferença é que esse while tem um do que é faça ent é faça isso aq enquanto for isso aq. resumindo:
            // enquanto quantidade for menor que 10 ele vai imprimir sou gay e no final vai ver quantas vezes eu falei que eu sou gay
            System.out.println("sou gay");
            quantidade++; // serve pra incrementar o valor na variavel quantidade ali em cima incrementar é adicionar +1
        } while (quantidade < 10);
        System.out.println("quantas vezes henrique falou que é gay: " + x);


        int adad = 4;

        for (int i = 0; i <= adad; i++) { // enquanto a variavel i ali dentro for menor que a variavel adad ele vai fazer oq esta dentro do escopo, resumidamente:
            // ele vai repetir o algoritmo que vai esta dentro do for até as vezes que vc quiser que ele repita
            System.out.println("sou gay");
        }

        // ARRAYS
        // oq e um array? vai procurar filho da puta vai le no google
        System.out.println("-----------ARRAYS-----------");
        int[] arr = new int[4]; // um array declaro que ira receber valores
        int[] arr2 = {1, 2, 3, 4}; // um array com valores dentro

        for (int i = 0; i <= arr2.length; i++) { // percorrendo um array
            System.out.println(i);
        }

        System.out.println("-----------TRY/CATCH-----------");

        // try catch é tente fazer isso aq e se n deu merda ent retorna o tratamento do erro que fica na parte do catch
        try {
            int soma = 2 + 2;
            System.out.println("resultado da soma: " + soma);
        } catch (Exception e) {
            System.out.println("n foi possivel fazer a soma " + e);
        }
    }
}