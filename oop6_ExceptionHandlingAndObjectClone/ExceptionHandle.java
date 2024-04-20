package oop6_ExceptionHandlingAndObjectClone;

/*
We use try-catch-finally to handle exceptions

    try{
        // TRY THIS CODE
    }
    catch( Exception e ){
        //IF AN EXCEPTION OCUURS RUN THIS
    }
    finally{
        // RUN THIS NO MATTER WHAT (optional)
    }

    We can have many catch blocks for diff types of exception

    It must follow an order from narrow->broader type

    try{}
    catch(ArithmaticEx){}
    catch(Ex){}

 */

/*
    You can throw exception by your own using
    throw ExceptionObject;
 */

/*
    You can tell java before executing the method that it can throw exceptions
    void meth() throws ExceptionType{}

    By doing this you will force programmers to handle this Exception.

 */

/*
    We can create our own exception just create a class MyExp
    and extend it with Exception class and create its methods.
 */

class DivideByOneException extends Exception{
    DivideByOneException(){
        super("Divide by 1");
    }
}


public class ExceptionHandle {

    public static void main(String[] args) {
        int a = 9;
        int b = 1;

        try{
            int c = divide(a,b);
        }catch(ArithmeticException e){
            System.out.println(e);;
        }
        catch (DivideByOneException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block");
        }

    }


    static int divide(int a, int b) throws ArithmeticException, DivideByOneException{
        if(b == 0) throw new ArithmeticException("Divide by zero");
        if(b == 1) throw new DivideByOneException();
        return a/b;
    }

}



