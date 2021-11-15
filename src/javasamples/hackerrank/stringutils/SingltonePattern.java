package javasamples.hackerrank.stringutils;

public class SingltonePattern {

    static  class MySingleton{
        private MySingleton(){};
        private static final  MySingleton INSTANCE= new MySingleton();

    }
}
