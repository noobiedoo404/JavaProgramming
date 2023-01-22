package OOP.Assignments;

public class Asgnmnt_4 {
    public static void main(String[] args) {
        int temp1=0,temp2=0, arr[]={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14},sum1=0,sum2=0;
        int[] index_array = new int[15];
        for(int i=2;i<=arr.length;i++){
            for(int j=2;j<=i;j++){
                if(i%j==0 && i!=j ){
                    break;
                }
                temp1=j;
                
            }
            if(temp1==i){
                index_array[temp2]=i;
                // System.out.println(a[temp2]);
                temp2++;
            }
        }

        
        for(int i=0;i<index_array.length;i++){
            sum1+=arr[index_array[i]];
        }
        for(int i=0;i<arr.length;i++){
            sum2+=arr[i];
        }
        sum2=sum2-sum1;
        System.out.println("The sum of the elements of non-prime indexes in the array is "+sum2);
    }
}
