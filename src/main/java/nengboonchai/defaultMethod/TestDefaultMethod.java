package nengboonchai.defaultMethod;

interface vehicle {
    // default method must have an implementation
    default void message() {
       System.out.println("I am a vehicle!");
    }
 }
 
public class TestDefaultMethod implements vehicle{
    public static void main(String args[]) {
        TestDefaultMethod tester = new TestDefaultMethod();
        // implementing class can access the default method as its own method
        tester.message(); 
     }
}
