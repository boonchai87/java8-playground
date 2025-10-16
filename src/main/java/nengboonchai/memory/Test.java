package nengboonchai.memory;

public class Test {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/java-memory-management/
        // Heap area
            // created whene jvm started
            // 1 jvm have 1 heap
            // ->  keep class instances and arrays
        // Method area
            // when the JVM starts
            // -> Method area is used to store ***class-level information**** such as class structures, Method bytecode, Static variables, Constant pool, Interfaces.
        // JVM stack
            // ->create when thread created
            // ->store method execution data, including local variables, method arguments, and return addresses
        // Native method stack
            // This memory is allocated for each thread when it is created and can have either a fixed or dynamic size.
        // Program counter (PC) register
            // The non native method has a PC which stores the address of the available JVM instruction whereas in a native method, the value of program counter is undefined. PC register is capable of storing the return address or a native pointer on some specific platform.
        // Gabage collector
            // remove unused object
            // You can request garbage collection using System.gc(), but the JVM ultimately decides when it should run.
    }
}
