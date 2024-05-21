package nengboonchai;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String S) {
        String result ="";
        // Implement your solution here
        boolean haveConsuctive = false;
        StringBuffer str = new StringBuffer(S);
        Map<String,Integer> fq = new HashMap<>();
        String oldCh = null;
        int sum =0;
        int length =0;
            do {
                length=0;
                //String ok = "";
                System.out.println("reuslt = "+str);
                for (int i = 0; i < str.length(); i++) {
                    length++;
                    String currentCh = String.valueOf(str.charAt(i));
                    System.out.println(currentCh);
                    if (i == 0) {
                        oldCh = String.valueOf(str.charAt(0));
                        //oldCh = String.valueOf(String.valueOf(str.charAt(i - 1)));
                    }else{
                        oldCh = String.valueOf(String.valueOf(str.charAt(i - 1)));
                    }
                    if ( oldCh.equals(currentCh) ) {
                        sum++;
                        System.out.println(oldCh+sum);
                    } else {
                        sum = 1;
                    }
                    if( sum == 3 ){
                        oldCh = null;
                        System.out.println("delete index"+i);
                        str.deleteCharAt(i);
                        sum = 0;
                        break;
                    }
                }
            }while(length<str.length());
        return str.toString();
    }

    public static void main(String[] args) {
        Solution s  =new Solution();
        String test = "uuuuxaaaaxuuu";

        System.out.println(s.solution(test));

        StringBuffer stringBuffer = new StringBuffer(test);
       // System.out.println(stringBuffer.deleteCharAt(3));
        String str = "ddd";

//        String ad="xxxxdssdxx";
//        System.out.println(ad.replaceFirst("x",""));
    }
}
