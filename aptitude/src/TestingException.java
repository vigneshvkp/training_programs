
public class TestingException {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        System.out.println("Exception Samples");
        System.out.println("------------------------------------------------------");
        TestingException testingException = new TestingException();
        try {
//            testingException.divideByZero();
            testingException.unKnowException();
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception " + ae);
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException -- " + e);
        }
        catch (Exception e) {
            System.out.println("Exception -- " + e);
        }
    }

    public void divideByZero() {
        int a = 5;
        int b = a / 0;
    }

    public void unKnowException() throws Exception{
        int a=2;
        if(a==2){
            throw new Exception("New Unknown Exception");
        }

    }


}
