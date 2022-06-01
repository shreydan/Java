class CountStatic {
    static int count = 0;
    int objID;

    CountStatic() {
        count++;
        objID = count;
    }

    public void showID() {
        System.out.println("ID: " + objID);
    }

    public static void main(String ar[]) {
        CountStatic a = new CountStatic();
        CountStatic b = new CountStatic();
        CountStatic c = new CountStatic();
        System.out.println("No. of objects: " + count);
        a.showID();
        b.showID();
        c.showID();
    }
}