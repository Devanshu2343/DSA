class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0 ;
        int r= 0 ;
        int result =0 ;
        for(int x : weights){
            r += x;
            l= Math.max(l,x);
        }
        while(l<=r){
            int mid = l + (r-l)/2;
            if (possible(weights,mid,days)){
                result = mid ;
                r= mid-1;
            }
            else{
                l = mid+1;
            }
           
        }
        return result ;
    }
      public boolean possible(int[] weights , int capacity , int days){
        int d=0 ;
        int weightOnShip =0 ;
        for(int w : weights){
            weightOnShip += w;
            if(weightOnShip > capacity){
                weightOnShip =w ;
                d+= 1;

            }
            if(d>days){
                return false;
            }
        }
        return true;
    }
}
