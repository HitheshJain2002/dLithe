package tileProblem;

public class tilingProblem {
    public static int  tilingproblem(int n){
        if(n==0||n==1){
            return 1;
        }
        int verticaltile=tilingproblem(n-1);
        int horizontaltile=tilingproblem(n-2);
        int total_possiblity=verticaltile+horizontaltile;
        return  total_possiblity;
    }
    public static void main(String[] args) {
      int total=  tilingproblem(5);
        System.out.println(total);
    }
}
