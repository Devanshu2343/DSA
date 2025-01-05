class ReverseArray {
    public void reverseArray(int arr[]) {
      
       int l = arr.length;
            for (int i = 0; i < l / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
          
           
       }
    }
   
