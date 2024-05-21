package nengboonchai.basic;

public class StringMutable {
    public static void main(String[] args) {
        String str = "123";
       // System.out.println(str.hashCode());
        System.out.println("address "+System.identityHashCode(str));
        str = "456";
        System.out.println("address after assign value"+System.identityHashCode(str));

        StringBuffer stringBuffer =new StringBuffer("123");
        System.out.println(System.identityHashCode(stringBuffer));
        stringBuffer.setLength(0);
        stringBuffer.append("testString");
        System.out.println(System.identityHashCode(stringBuffer));
    }
}
