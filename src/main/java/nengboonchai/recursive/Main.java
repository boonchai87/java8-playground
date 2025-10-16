package nengboonchai.recursive;

public class Main {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k){
        if(k>0){// stop condition
            return k+sum(k-1);
        }else{
            return 0;
        }
    }
}
