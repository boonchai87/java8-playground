package nengboonchai.util;

import java.util.StringTokenizer;

public class TestStringTokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("dasd,sdfadsf",",");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
