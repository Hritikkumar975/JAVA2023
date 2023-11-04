//Program name :  9. Program to print the largest element in an array


class Arr{
    public static void main(String[] args) {
        
        int arr[] ={5,3,10,-9,11};

        int l =arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]>l){
                l=arr[i];
            }
        }

        System.out.println("Largest element in an array : " + l);

    }
}