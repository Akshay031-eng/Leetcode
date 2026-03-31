class Solution {
    public int[] dailyTemperatures(int[] temperatures) {  
        // Traverse day by day 
         int result [] =  new int [temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int day =0 ; day<temperatures.length;day++){
            // remove those day which violate the monotonic state 
            while( !stack.isEmpty() && temperatures[day] > temperatures[stack.peek()]){
                int preday = stack.peek();
                int currday = day;
                int diff = currday- preday;
                result[preday] = diff;
                stack.pop();

            }
            stack.push(day);
        }
        return result;
    }
}