package exam03;

import exam01.Book;

public class Ex06 {
    public static void main(String[] args) throws  ClassNotFoundException{
        Class cls = Class.forName("exam1.Book");
        System.out.println(cls);
    }
}
