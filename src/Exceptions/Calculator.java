package Exceptions;

import java.sql.SQLException;

public class Calculator {
    public int divide(Integer a, Integer b) throws Exception{

        try{
            if(b == 0){
                IrritatingNoseException ir = new IrritatingNoseException("Nose is itchy");
                throw ir;
//                throw new ArithmeticException(); // Unchecked exceptions
            }
            if(b==null){
                //response->bad request
                throw new NullPointerException(); //Unchecked exceptions -> RuntimeException and Anything that extends RuntimeException
            }
            if(b>100){
                throw new ClassNotFoundException(); // Checked Exception, Exception class and anything that directly extends Exception
            }
            if(b>100000){
                throw new SQLException(); // Checked Exception, Exception class and anything that directly extends Exception
            }
            return a/b;


        }
        catch(ArithmeticException e){

        }
        catch (SQLException e){
           if(e.getErrorCode() == 401) {
               //retry logic
           }
           throw e;
        }catch(Exception e){
            System.out.println(e.getMessage());
            throw e;
        }
        return 0;
    }
}// order of catch blocks should child to parents
