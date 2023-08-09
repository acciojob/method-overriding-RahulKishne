package com.driver;

public class Main {
    public static void main(){
        B objB=new B();
        String a=objB.meth();
        System.out.println(a);
    }

    public static class A {
        public String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
}
