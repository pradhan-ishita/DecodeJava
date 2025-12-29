package TwoDimentionalArray;

public class forEach {
    public static void main(String[] args) {
        int[] a={4,7,2,3};
        for(int ele:a){
            System.out.print(ele+" ");
        }
       System.out.println();
        int[][]b={{1,2,3},{4,5,6}};
        //output of 2D array
//        for(int i=0;i<2;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(b[i][j]+" ");
//            }

        for(int[] ele: b){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
