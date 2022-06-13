class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

class Test {
    void testException() throws CustomException {
        System.out.println("this should throw an error");
        throw new CustomException("HAHA ERROR SIKE!");
    }
    public static void main(String ar[]) {
        try {
            Test obj = new Test();
            obj.testException();
        }
        catch(CustomException ce) {
            System.out.println("look at this-> " + ce);
        }
        finally {
            System.out.println("custom exception working!");
        }
    }
}