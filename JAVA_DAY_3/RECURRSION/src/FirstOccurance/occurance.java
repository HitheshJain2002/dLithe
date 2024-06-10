package FirstOccurance;

public class occurance {
    public static int occurance(int arr[],int key,int index){
        if(index==arr.length-1){
            return -1;
        }if(arr[index]==key){
            return index;
        }
        return  occurance(arr,key,index+1);
    }
    public static int last_occurance(int arr[],int key,int i){
        if (i < 0) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return last_occurance(arr, key, i - 1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,3};
        int key=3;
        int i=5;
        int index=0;
        int ans= last_occurance(arr,key,i);
        int ans1=occurance(arr,key,i);
        System.out.println("is last" +ans);
        System.out.println("IS first:"+ans1);

    }
}

