import packagename.*;

public class Test {
    public static void main(String ar[]) {
        PackageFile obj = new PackageFile();
        System.out.println("\n\nRUNNING FROM Test WHICH IMPORTS packagename");
        // System.out.println(obj.protectedVar); DOESNT WORK OFC
        // System.out.println(obj.defaultVar); DOESNT WORK OFC
        System.out.println(obj.publicVar);

        PackageSubClass objsub = new PackageSubClass();
    }
}