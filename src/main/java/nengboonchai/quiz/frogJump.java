package nengboonchai.quiz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class frogJump {
    public static void main(String[] args) {
        int X=1, Y=1, D = 3;
        // X=1; 
        // Y=5; 
        // D=2;

        // Implement your solution here
        int result = 0;
        int jump =0;
        int numJump =0;
        // do{
        //    jump=X+(D*numJump);
        //    numJump++;
        // }while( jump<=Y );
        while( jump<Y ){
            numJump++;
            jump=X+(D*numJump);
        }
        System.out.println(numJump);
        //return numJump-1;
    }
}