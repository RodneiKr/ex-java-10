package main.java.org.kr.exjava10.unmodifiable;

import java.util.*;
import java.util.stream.Collectors;

public class CopyOf {

    public static void main(String[] args) {
        final var copyOf = new CopyOf();
        try {
            copyOf.list();
            copyOf.map();
            copyOf.set();

            System.out.println("\n>>> Exemplo realizado com sucesso!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void list() {
        System.out.println("\n");
        System.out.println(">>> list()");

        final var listModifiable = new ArrayList<Integer>();
        listModifiable.add(1);
        listModifiable.add(2);
        listModifiable.add(3);

        final var listUnmodifiable = List.copyOf(listModifiable);
//        listUnmodifiable.add(4); // erro em tempo de execucao
        listUnmodifiable.forEach(System.out::println);

        System.out.println("Collector");
        final var listUnMod = listModifiable.stream()
                .filter(f -> f.intValue() < 3)
                .collect(Collectors.toUnmodifiableList());
        listUnMod.forEach(System.out::println);
    }

    private void map() {
        System.out.println("\n");
        System.out.println(">>> map()");

        final var mapModifiable = new HashMap<Integer, String>();
        mapModifiable.put(1, "A");
        mapModifiable.put(2, "BB");
        mapModifiable.put(3, "CCC");

        final var mapUnmodifiable = Map.copyOf(mapModifiable);
//        mapUnmodifiable.put(4, "DDDD"); // erro em tempo de execucao
        mapUnmodifiable.forEach((k,v) -> System.out.println(k + " " + v));

//        System.out.println("Collector");
//        final var mapUnMod = new HashMap<Integer,String>();
//        mapModifiable.forEach((k,v) -> {
//            Collectors.toUnmodifiableMap((k,v) -> );
//        });
    }

    private void set() {
        System.out.println("\n");
        System.out.println(">>> set()");

        final var setModifiable = new HashSet<Integer>();
        setModifiable.add(1);
        setModifiable.add(2);
        setModifiable.add(3);

        final var setUnmodifiable = Set.copyOf(setModifiable);
//        setUnmodifiable.add(4); // erro em tempo de execucao
        setUnmodifiable.forEach(System.out::println);

        System.out.println("Collector");
        final var setUnMod = setModifiable.stream()
                .filter(f -> f.intValue() > 1)
                .collect(Collectors.toUnmodifiableSet());
        setUnMod.forEach(System.out::println);
    }
}
