package nengboonchai.quiz;

public class TestForloop {
    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        // Implement your solution here
        int result = 0;

        for(int i=0;i<A.length;i++){
            int aValue = A[i];
           // System.out.println("A[i]"+aValue);
            boolean duplicate = false;
            for(int j=0;j<A.length;j++){
                if(aValue == A[j] && i!=j ){
                    duplicate = true;
                    System.out.println(aValue+","+A[j]);
                    break;
                }
                
            }
            if( !duplicate ){
                result = aValue;
                break;
            }
        }
        System.out.println(result);
        //return result;
    }
}
