package nengboonchai.quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
    public static void main(String[] args) {
        int number = 9;
        int fraction = 0;
        int result = 0;
        String numberBase2 = "";
        do{
            fraction = number % 2;
            result = number/2;
            //System.out.println(result);
           // System.out.println(fraction);
            number = result;
            numberBase2 +=fraction;
        }while( result != 0);
        System.out.println("numberBase2="+numberBase2);
        int fristIndex = 0;
        int lastIndex =0;
        List<Integer> zeroLength = new ArrayList<>();
        for( int i=0;i<numberBase2.length();i++){
            char previousChar = '-';
            if( i>0)
                previousChar = numberBase2.charAt(i-1);
            char currentChar = numberBase2.charAt(i);
            System.out.println("previous Char"+previousChar);
            if( previousChar=='1' && fristIndex==0 && currentChar=='0' ){
                fristIndex = i;
                System.out.println("fristIndex ="+i);
            }
            if( fristIndex!=0 && currentChar=='1' ){
                //System.out.println(i);
                lastIndex= i;
                System.out.println("lastIndex="+lastIndex);
                System.out.println("length="+(lastIndex-fristIndex));
                zeroLength.add(lastIndex-fristIndex);
                fristIndex = 0;
            }
        }
        int max =0;
        for(int i=0;i<zeroLength.size();i++){
            if( zeroLength.get(i)>max)
                max =  zeroLength.get(i);
        }
        System.out.println(max);
    }
}
