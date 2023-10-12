package Week2.Lab2;

public class Ex9 {

    public static void main(String[] args) {
        drawNumbersPiramid(10);
        System.out.println();
        drawNumberPiramidSecondOutput(10);
    }

    public static void drawNumbersPiramid(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void drawNumberPiramidSecondOutput(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

}
