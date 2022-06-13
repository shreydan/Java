import packagename.Hello;
import packagename.subpackage.Hi;

public class test {
    public static void main(String ar[]) {
        Hello obj = new Hello();
        Hi h = new Hi();
        obj.someMethod();
        h.someMethod2();
    }
}
