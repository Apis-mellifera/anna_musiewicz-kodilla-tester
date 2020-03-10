package com.kodilla.collections.adv.immutable.special;

public class ImmutableSpecialCases {
    public static void main(String[] args) {
        Integer a = 112; //zmienna a zawiera adres wskazywanego obiektu
        Integer b = 112;
        System.out.println( a == b); // porównanie zawartości zmiennych a i b, adresy ich są różne
        System.out.println( a.equals(b)); // porównanie obiektów

        Integer c = 1160;
        Integer d = 1160;
        System.out.println( c == d);
        System.out.println(c.equals(d));
        System.out.println("------------------");
        String x = "This is string";
        String y = "This is string";
        System.out.println( x == y);
        System.out.println(x.equals(y));
        System.out.println("--------------");
        Integer e = 100;
        Integer f = 100;
        System.out.println(e.hashCode());
        System.out.println(f.hashCode());
        System.out.println( e == f);
        e = e + 10; // nie modyfikujemy biektu wskazywanego przez e, tylko tworzymy nowy obiekt
        System.out.println(e.hashCode());
        System.out.println(f.hashCode());
        System.out.println( e == f);
        e = 10567;
        f = 10567;
        System.out.println(e.hashCode());
        System.out.println(f.hashCode());
        System.out.println( e == f);

        String s = "text";
        s = s + "1";

        String s1 = "text";
        String s2 = new String("text");

    }
}
