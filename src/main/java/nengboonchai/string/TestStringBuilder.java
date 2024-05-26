package nengboonchai.string;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb =new StringBuilder("ok");
        CharSequence charSequence = sb.subSequence(0,2);
        System.out.println(charSequence.toString());
    }
}
