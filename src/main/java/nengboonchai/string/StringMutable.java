package nengboonchai.string;

public class StringMutable {
    public static void main(String[] args) {
        // string is immutable
        String str = "123";
       // System.out.println(str.hashCode());
        System.out.println("address "+System.identityHashCode(str));
        str = "456";// set new value
        System.out.println("address after assign value"+System.identityHashCode(str));

        // strinbuffer is mutable
        StringBuffer stringBuffer =new StringBuffer("123");
        System.out.println(System.identityHashCode(stringBuffer));
        stringBuffer.setLength(0);
        stringBuffer.append("testString");// set new value
        System.out.println(System.identityHashCode(stringBuffer));
    }
}
