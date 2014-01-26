import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// you can also use imports, for example:
// import java.math.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 6
        for (Long i = 0L; i < A.length; i++){
            int[] subArray = Arrays.copyOfRange(A, 0, i.intValue());
            if(isSubsetOf(subArray, A))
                return i.intValue()-1;
        }
        return A.length;
    }

    private boolean isSubsetOf(int[] subArray, int[] array) {
        List<Integer> subList = new ArrayList<Integer>();
        for (Long index = Long.valueOf(0); index < subArray.length; index++){
            subList.add(subArray[index.intValue()]);
        }
        for(Integer element : array){
            if (!subList.contains(element)){
                return false;
            }
        }
        return true;
    }
}
