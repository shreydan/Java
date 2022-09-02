package packagename;

public class PackageFile {
    // default variable:
    /* 
    this is a default var, 
    should be accessible by all classes of this package
    */
    String defaultVar = "packagename: PackageFile: defaultVar";

    /*
    this is a private var,
    should be accessible only by PackageFile class its part of
    */
    private String privateVar = "packagename: PackageFile: privateVar";

    /*
    this is a protected var,
    should be accessible by any sub-classes of this package
    and or classes of this package folder
    */
    protected String protectedVar = "packagename: PackageFile: protectedVar";

    /*
    this is a public var,
    should be accessible anywhere
    */
    public String publicVar = "packagename: PackageFile: publicVar";

    public PackageFile() {
        System.out.println("\n\nRUNNING FROM PackageFile");
        System.out.println(defaultVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
    }
}