package Inheritance;

public class A {
        void m1() {
            System.out.println("M1 method");
        }

        void m2() {
            System.out.println("M2 method");
        }
    }

    class B extends A {
        void m3() {
            System.out.println("M3 method");
        }

        void m4() {
            System.out.println("M4 method");
        }
    }

    class C extends B {
        void m5() {
            System.out.println("M5 method");
        }

        void m6() {
            System.out.println("M6 method");
        }
    }

    class Demo {
        public static void main(String[] args) {
            A a = new A();
            a.m1();
            a.m2();

            System.out.println("//");
        }
    }
