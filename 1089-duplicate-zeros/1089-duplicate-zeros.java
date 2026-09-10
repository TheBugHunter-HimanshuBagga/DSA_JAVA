class Solution {
    public void duplicateZeros(int[] arr) {//arr = [1,0,2,3,0,4,5,0]
        int[] result = new int[arr.length]; //     [_,_,_,_,_,_,_,_]
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(count < result.length){
                if(arr[i] != 0){ // arr[i] = 1 != 0 hence just push it inside the result
                    result[count] = arr[i];
                    count++;
                }
                else{ // == 0
                    result[count] = arr[i];
                    count++;
                    if(count < result.length){
                        result[count] = 0;
                        count++;
                    }
                    
                }
            }
            
        }

        int ultra  = 0;
        for(int j = 0 ; j < result.length ; j++){
            arr[ultra] = result[j];
            ultra++;
        }

    }
}