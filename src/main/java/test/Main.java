package test;

public class Main {

//    public static void main(String[] args) {
//        Test1 test1 = new Test1();
//        Test2 test2 = new Test2();
//
//        System.out.println(test1.toString());
//        System.out.println(test2.toString());
//
//        System.out.println(test1.equals(test2));
//
//        System.out.println(test1.hashCode());
//        System.out.println(test2.hashCode());
//
//    }

    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }


}
