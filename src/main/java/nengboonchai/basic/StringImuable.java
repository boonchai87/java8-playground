package nengboonchai.basic;

public class StringImuable {
    public static void main(String[] args) {
        String s="Sachin"; 
        System.out.println(getObjectAddress(s)); 
        s=s.concat(" Tendulkar");
        System.out.println(getObjectAddress(s)); 

        //System.out.println(s);  
    }
    public static String  getObjectAddress(Object o) {
        return o.getClass().getName() + "@" + 
               Integer.toHexString(System.identityHashCode(o));
    }
}
