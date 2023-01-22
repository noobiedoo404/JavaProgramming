package OOP.Assignments;

public class Asgnmnt_5 {
    public static void main(String[] args) {
        int arr[]={1,3,3,2,3,1,4,6,3,1,1},max=0,count=0,sum1=0,sum2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0){
                count++;
                sum1+=arr[i];
                System.out.println("SUM1= "+sum1);
                System.out.println("COUNT= "+count);
                if(max<=count && sum1>sum2){
                    max=count;
                    sum2=sum1;
                }

            }
            else{count=0;
            sum1=0;}
        }
        System.out.println(sum2);
    }
}
