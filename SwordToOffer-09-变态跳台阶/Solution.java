public class Solution {
    public int JumpFloorII(int target) {
        //return target>1?(int)Math.pow(2, target-1):1;
        return 1<<--target;
    }
}