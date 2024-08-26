//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Parent {
    public Parent(){
        System.out.print("A");
    }
    public void fn(){
        System.out.print("B");
    }
    public void fnA(){
        System.out.print("C");
    }
}
class Child extends Parent{
    public Child(){
        System.out.print("D");
    }
    public void fn(){
        System.out.print("E");
    }
    public void fnB(){
        System.out.print("F");
    }
}
    public class Main {
        public static void main(String[] args) {
            Child c = new Child();
            c.fn();
            c.fnA();
        }
    }