class Solution {
    public String largestNumber(int[] nums) {
        String arr[]=new String[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]="" + nums[i];
        }
        Arrays.sort(arr,(a,b)->(a+b).compareTo(b+a));
        StringBuilder st=new StringBuilder("");
        for(int i=arr.length-1;i>=0;i--){
            st.append(arr[i]);
        }
        if(st.charAt(0)=='0'){
            return "0";
        }
        return st.toString();
    }
}
