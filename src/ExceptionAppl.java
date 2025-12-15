import exceptions.InvalidMarks;

import java.util.Scanner;

public class ExceptionAppl {
    public static void arrOutOfBound(){
        try{
            int arr[] = new int[100];
            System.out.println(arr[9]);
        }catch( ArrayIndexOutOfBoundsException arre){
            throw arre;
        }
    }
    public static void nullPointerExe() {
        try{
            String str = null;
            System.out.println(str.length());
        }catch( NullPointerException ne){
            throw ne;
        }
    }
    public static void divide(Scanner sc){
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        int c = a/b;
    }
    public static void checkMarks(int marks) throws InvalidMarks {
        if(marks<35){
            throw new InvalidMarks("Marks should be greater than 35");
        }
        System.out.println("Valid marks");
    }

        public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            checkMarks(24);
            divide(sc);
//            System.out.println(c);
            arrOutOfBound();
            nullPointerExe();
        }catch( ArrayIndexOutOfBoundsException arre){
            System.out.println("Invalid array index");
            System.out.println(arre);
        }catch( NullPointerException ne){
            System.out.println(ne);
        }catch( ArithmeticException e){
            System.out.println("Airthmatic error occured : ");
            System.out.println(e);
        }catch( InvalidMarks ille){
            System.out.println(ille);
        }
        finally {
            System.out.println("Final code exit by closing connections.");
        }

    }

}
