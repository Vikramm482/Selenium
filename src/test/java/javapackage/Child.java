package javapackage;
public class Child extends Parent {
    void marry() {
        System.out.println("RED GIRL");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.marry();
    }
}
