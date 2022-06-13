package packagename;

public class Hello {
    public void someMethod() {
        System.out.println("hello from package!");
    }
}



// compiled as:
// javac ./packagename/**/*.java
// to compile subpackage as well