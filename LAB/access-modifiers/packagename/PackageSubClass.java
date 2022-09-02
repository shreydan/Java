package packagename;

public class PackageSubClass extends PackageFile {
    public PackageSubClass() {
        System.out.println("\n\nRUNNING FROM PACKAGE SUB-CLASS");
        System.out.println(defaultVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}