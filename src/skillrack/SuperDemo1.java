class A {
    A(){
        System.out.println("A");
    }
    A(int p) {
        System.out.println("Super class constructor");
    }
    void hello(){
        System.out.println("hi from A");
    }
}

class B extends A {
    B(){
        System.out.println("B");
    }
    B(int q) {
        // super(q);  // Calls A's constructor with value 10
        System.out.println("Sub class constructor");
    }
    void hello(){
        System.out.println("hi from B");
    }
}

public class SuperDemo1 {
    public static void main(String ar[]) {

        A ok = new B();
        ok.hello();
    }
}

// java adds super() in every extended methods
// if A is parent, B is child - A = new B(). is posible but B = new A()
// if overrided method is presnt java call the one in right hand side else left side
