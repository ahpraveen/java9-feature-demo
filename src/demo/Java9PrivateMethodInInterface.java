package demo;

/**
 * Java 8 allowed us to create default and static methods in Interface.
 * Now with Java9 user can create private methods and private static methods in Interface
 * Advantage of this feature:
 * Remove Redundancy
 * Improve code readability
 * 
 * @author Praveen Haridas
 *
 */
interface demo{	
	private void common(){
		System.out.println("common");
	}
	default void example1(){
		common();
		System.out.println("default method 1");
	}
	default void example2(){
		common();
		System.out.println("default method 2");
	}
}

public class Java9PrivateMethodInInterface implements demo {
	public static void main(String s[]){
		Java9PrivateMethodInInterface java9demo = new Java9PrivateMethodInInterface();
		java9demo.example1();
		java9demo.example2();
	}
}
