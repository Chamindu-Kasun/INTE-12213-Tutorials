/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exceptioncheck;

/*
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
*/

/**
 *
 * @author chamindu
 */
public class ExceptionCheck {
    
    /*
    public static int calculateDivision(int x, int y) throws ArithmeticException{
        return x/y;
    };
    */

    public static void main(String[] args) {
        
        /*
        System.out.println("Statement 1");
        System.out.println("Statement 2");
        System.out.println("Statement 3");
        */
        
        
        //System.out.println(5/0);
        
        
        /*
        try{
          System.out.println(5/0);
        }catch(ArithmeticException e){
          System.out.println(e);
        }
        */
        
        
        /*
        try{
          String directory = System.getProperty("user.dir");
          File file = new File(directory+"/TextFile.txt");
          FileReader reader = new FileReader(file);
          
          int character;
          while((character = reader.read()) != -1){
           System.out.println((char) character);
          }
          reader.close();
        }catch(FileNotFoundException e) {
          System.out.println("The specified file was not found.");
        } catch (IOException e) {
          System.out.println("An I/O error occurred while reading the file.");
        }
        */
        
        
        /*
        try{
          System.out.println(5/0);
        }catch(FileNotFoundException e){
          System.out.println(e);
        }
        */
        
        
        
        /*
        try{
          System.out.println(5/0);
        }catch(ArithmeticException e){
          System.out.println(10/0);
        }
        */
        
        
        /*
        try{
          System.out.println(5/1);
        }catch(ArithmeticException e){
          System.out.println(e);
        }
        
         //Checked exception
        File file = new File("/TextFile.txt");
        FileReader reader = new FileReader(file);
          
        //Unchecked exception
        System.out.println(5/0);
        */
        
        
        /*
        try{
          int value = calculateDivision(5,0);
          System.out.println(value);
        }catch(Exception e){
          System.out.println(e);
        }
        */

    }
}
