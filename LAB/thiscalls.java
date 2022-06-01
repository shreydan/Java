class CallThis {

    int somevar;

    public CallThis() {
        System.out.println("default :)");
    }

    public CallThis(int somevar) {
        this();
        System.out.println("Parametrized :)");
        this.somevar = somevar;
    }

    public void showVar() {
        System.out.println(somevar);

    }

    public static void main(String ar[]) {
        CallThis obj1 = new CallThis(5);
        obj1.showVar();
    }

}