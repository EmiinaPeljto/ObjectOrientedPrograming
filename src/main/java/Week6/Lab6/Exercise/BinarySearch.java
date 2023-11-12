package Week6.Lab6.Exercise;

public class BinarySearch {


    public static boolean search(int[] array3,int sv){
        int left=0,right=array3.length-1,mid=0;

        while (left<=right){
            mid=left+(right-left)/2;
        }
        if(array3[mid]==sv){
            return true;
        }
        if(array3[mid]<sv){
            left=mid+1;
        }else{
            right=mid-1;
        }
        return false;
    }
}
