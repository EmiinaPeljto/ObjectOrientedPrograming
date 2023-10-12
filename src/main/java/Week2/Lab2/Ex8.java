package Week2.Lab2;

public class Ex8 {
    public static void main(String[] args) {
        drawStarsPiramid(10);
        System.out.println();
        invertedHalfPiramidShape(10);
    }
    public static void drawStarsPiramid(int rows){

        for(int i=0;i<=rows;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void invertedHalfPiramidShape(int rows){

        for(int i=rows;i>=0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
