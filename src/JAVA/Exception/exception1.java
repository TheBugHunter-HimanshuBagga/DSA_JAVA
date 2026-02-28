package JAVA.Exception;
// RunTime And IOException
// runtime exception isi due to your fault - null pointer , out of bound , divide by 0
/*
try{
// code
}
catch(exception){
// code
}
 */

// IOException checked by compiler at the compile-time and programmer is said to handle the exception
public class exception1 {
    public static void main(String[] args){
        //        try {
//            int result = 5/0;
//
//            System.out.println(a[8]);
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Tried to access the out of bound element");
//        } catch (ArithmeticException e) {
//            System.out.println(e.getStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
//        }

        int a[] = new int[5];

        System.out.println("Hello guys");
        try {
            int result = 5 / 0;

            System.out.println(a[8]);

//        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
//            System.out.println("Handling the exception");
//        } catch (RuntimeException e) {
//
//        }

        } catch (Exception e) {
            System.out.println("all exception handled");
        }



        System.out.println("Bye guys");


    }
}
