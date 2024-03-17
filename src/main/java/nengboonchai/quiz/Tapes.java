package nengboonchai.quiz;

import java.util.ArrayList;
import java.util.List;

public class Tapes {
    public static void main(String[] args) {
        int[] A = {1,1};
        //A={1,1};
        int min =0;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<A.length-1;i++){
            //int sum =0;
            //System.out.println(A[i]);
            int sum =0;
            for(int j=0;j<i+1;j++){
                sum+=A[j];
            }
            list.add(sum);
            //System.out.println(sum);

            int sum2 =0;
            for(int j=i+1;j<A.length;j++){
                 sum2+=A[j];
                 //System.out.print(A[j]+",");
            }
            //System.out.println(sum2);
            list2.add(sum2);
        }
        //System.out.println(list);
        //System.out.println(list2);
        // calucate shortest path
        min = Math.abs(list.get(0)-list2.get(0));
        //System.out.println(min);
        for(int i=0;i<list.size();i++){
            int temp = Math.abs(list.get(i)-list2.get(i));
            if( temp<min ){
                min = temp; 
            }
        }
        System.out.println(min);
        //return min;
    }
}
