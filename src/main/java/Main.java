
import Classesteste.ComparaInt;
import Classesteste.ComparaString;
import Classesteste.ComparatorMapa;
import Classesteste.Mapeador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Template de projeto de programa Java usando Maven.
 *
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //declarando e instanciando mapa:   
        HashMap<String, Integer> map = new HashMap<>();
        Mapeador m1 = new Mapeador();
        m1.mapa.put("cinco", 5);
        m1.mapa.put("seis", 6);
        //colocando entradas no mapa:(string,int)
        map.put("um", 1);
        map.put("dois", 2);
        map.put("tres", 3);
        map.put("quatro", 4);
        //formas de passar sobre o mapa:

        System.out.println("-x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x-");
        System.out.println("Printando direto:");
        System.out.println(map);
        System.out.println("-x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x-");
        System.out.println("Printando um por um sem ordenar(keySet)");
        for (String chave : map.keySet()) {
            System.out.println(chave + "  " + map.get(chave));
        }
        System.out.println("-x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x-");
        System.out.println("Acessando mapa de uma classe");
        System.out.println(m1.mapa);
        System.out.println("-x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x-");
        System.out.println("Comparadores");
        System.out.println("transformando mapa em lista de valores do mapa:");
        List<Integer> list = new ArrayList<>();
        list.addAll(map.values());
        list.sort(new ComparaInt());

        System.out.println("transformando mapa em lista de chaves:");
        List<String> list2 = new ArrayList<>();
        list2.addAll(map.keySet());
        list2.sort(new ComparaString());
        System.out.println(list2);
        for (String s : list2) {
            System.out.println(s + "," + map.get(s));
        }
        System.out.println("-x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x-");
        System.out.println("ordenando um mapa de acordo com os valores:");
        ComparatorMapa comp = new ComparatorMapa(map);
        TreeMap<String, Integer> map2 = new TreeMap<String, Integer>(comp);
        map2.putAll(map);

        for (Map.Entry<String, Integer> e : map2.entrySet()) {
            System.out.println(e);
        }
        System.out.println("-x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x-");
        System.out.println("Mapa reverso:   ");
        HashMap<Character, String> myHashMap = new HashMap<Character, String>();
        myHashMap.put('a', "test one");
        myHashMap.put('b', "test two");
        Map<String, Character> myNewHashMap = new HashMap<>();
        for (Map.Entry<Character, String> entry : myHashMap.entrySet()) {
            myNewHashMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println("-x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x-");
        System.out.println("Scanner que lê  só numeros");
        Scanner scanner = new Scanner(System.in);
        int numItens;
        System.out.print("Número de itens: ");
        if (scanner.hasNextInt()) {
            numItens = scanner.nextInt();
        } else {
            while (!scanner.hasNextInt()) {
                System.out.println("Digite um numero!");
                scanner.next();
            }
            numItens = scanner.nextInt();
        }

        System.out.println("-x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x-");
        System.out.println("Scanner que lê  só string");
        String nome1;
        System.out.println("A string:  ");
        if (scanner.hasNext()) {
            nome1 = scanner.next();
        } else {
            while (!scanner.hasNext()) {
                System.out.println("Digite uma posicao valida");

            }
            nome1 = scanner.next();
        }
        System.out.println("-x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x-");
        System.out.println(" abrindo arquivo para editar");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite o caminho:   ");
        String caminho = scanner1.next();
        File file = new File(caminho + ".out");

        // if file doesnt exists, then create it
        if (!file.exists()) {

            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        System.out.println("-x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x-");
        System.out.println("Buffered reader");
        BufferedReader br;
         br = new BufferedReader(new FileReader("oi"));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] a = linha.replaceAll("\\p{Punct}", "").split("\\s");
            for (String s : a) {}
            
        }
         br.close ();
          System.out.println("-x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x--x-");
          System.out.println("burffered writer");
          BufferedWriter bw = new BufferedWriter(new FileWriter(caminho+".out"));
       for (Map.Entry entry : map2.entrySet()) {
        bw.write(entry.getValue() + "," + entry.getKey());
        bw.newLine();
        }
        bw.close();
    
    }

   
}

