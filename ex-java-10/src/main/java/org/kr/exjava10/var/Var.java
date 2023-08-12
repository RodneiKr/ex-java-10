package main.java.org.kr.exjava10.var;

import java.io.File;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

public class Var {

    public static void main(String[] args) {

        var integer = 0;
        var string = "eu";
        var bigDecimal = BigDecimal.TEN;
        var map = new HashMap<Integer, String>();

        for (var i = 0; i < 10; System.out.println(i++));

        // intersectionType
        final var qualEhOTipo = (true ? "String" : 123);
    }
}
