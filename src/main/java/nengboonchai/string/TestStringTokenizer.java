package nengboonchai.string;

import java.util.StringTokenizer;

public class TestStringTokenizer {
    public static void main(String[] args) {
        String str = "Java,Python,C++,C#,JavaScript";
        java.util.StringTokenizer st = new StringTokenizer(str,",");

        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
    }
}
