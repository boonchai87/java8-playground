package nengboonchai.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArray {
    public static void shiftLeft(int[] arrays){
        arrays[arrays.length-1] = arrays[0];
        for(int i=0;i<arrays.length-1;i++){
            arrays[i]=arrays[i+1];
            //System.out.print(arrays[i]);
        }
        //System.out.println("");
    }
    public static void shiftLeft(List<Integer> arrays){
        int firstValue = arrays.get(0);
        for(int i=0;i<arrays.size()-1;i++){
            arrays.set(i,arrays.get(i+1));
        }
        arrays.set(arrays.size()-1,firstValue);
    }
    public static void shiftRight(List<Integer> lists){
        if( !lists.isEmpty() ){
        int lastValue = lists.get(lists.size()-1);
        List<Integer> newList =  new ArrayList<>();
        newList.add(lastValue);
        for(int i=0;i<lists.size()-1;i++){
            newList.add(lists.get(i));
        }
        //System.out.println(newList);
        for(int i=0;i<newList.size();i++){
            lists.set(i, newList.get(i));
        }
    }
    }
    public static void main(String[] args) {
        int[] A = { 1,2,3,4 };
        int K = 4;
        List<Integer> result = new ArrayList<>();
        // change to list
        for(int i=0;i<A.length;i++){
            result.add(A[i]);
        }
        for(int i=0;i<K;i++){
            shiftRight(result);
            //System.out.println(result);
        }
        for(int i=0;i<result.size();i++){
            A[i]=result.get(i);
        }
        //return A;

      //  List<Integer> list = new ArrayList<>();
        
        // List<Integer> appendList = new ArrayList<>();
        // for (int i = 0; i < list.size(); i++) {
        //     if (i <= K-1){
        //         appendList.add(list.get(i));
        //     }else{
        //         result.add(list.get(i));
        //     }
        // }
        // System.out.println(result);
        // System.out.println(appendList);
        // result.addAll(appendList);
        
        // for(int i=0;i<result.size();i++){
        //     A[i]=result.get(i);
        //     //System.out.println(results[i]);
        // }
        // for(int i=0;i<A.length;i++){
        //     System.out.print(A[i]);
        // }
        //return A;
        
    }
}
