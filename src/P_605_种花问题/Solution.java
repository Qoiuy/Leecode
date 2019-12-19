package P_605_种花问题;

public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (flowerbed.length < 3){
            if ( n == 0){
                return true;
            }
            if ( n == 1 ){
                for ( int i : flowerbed){
                    if (i == 1){
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

        int count = flowerbed[0] == 0 && flowerbed [1] == 0 ? 1 : 0;
        if (count == 1){
            flowerbed[0] = 1;
        }

        for (int i = 0 ;i < flowerbed.length - 2; i++){
            if (flowerbed[i] == 0 && flowerbed[i+1] ==0 && flowerbed[i+2] == 0){

                flowerbed[i+1] = 1;
                count ++;
            }
        }
        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0){
            count++;
        }
        return count >= n;
    }

}
