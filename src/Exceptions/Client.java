package Exceptions;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) throws SQLException, Exception{
        Calculator calculator = new Calculator();
        try{
            calculator.divide(5,0);
        } catch (SQLException e){
            System.out.println("kwd");
            throw e;
        }catch (Exception e){
            System.out.println("Exception");
        }


    }
}
//Break till 10:14PM
