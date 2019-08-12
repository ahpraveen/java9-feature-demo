package demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Java7 1. Try with resources closes all the resources (file, database
 * connection etc) automatically. No need to close explicitly. This prevents
 * memory leak 2. With the help of try with resource we can reduce the
 * unncessary line of code and make the code more readable. 3. The issue with
 * these it won't allow to declare the resources out side of Try/Catch.
 * 
 * Java9: Enhancement here in Java9 is, it will let the user to declare the
 * resource outside of Try/Catch
 * 
 * @author Praveen Haridas
 *
 */
public class Java9TryWithResourceEnhancements {

	 public static void main(String[] args) throws FileNotFoundException { 
	       FileOutputStream fileOutputStream = new FileOutputStream("temp.txt");
	       try(fileOutputStream){ 
	            String mystring = "We are writing Hello world"; 
	            byte bytes[] = mystring.getBytes();       
	            fileOutputStream.write(bytes);      
	            System.out.println("The given String is written in the file successfully");           
	        }catch(Exception e) {  
	            System.out.println(e);  
	        }         
	    }  
	}
