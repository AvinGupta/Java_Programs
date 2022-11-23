class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> lst=new ArrayList<>();
        //initializing counters
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int te=arr.length*arr[0].length;
        int c=1;
        while(c<=te){
            //loop will works on each rows and columns
            for(int i=minc;i<=maxc && c<=te;i++){
                lst.add(arr[minr][i]);
                c++;
            }
            minr++;
            for(int i=minr;i<=maxr && c<=te;i++){
                lst.add(arr[i][maxc]);
                c++;
            }
            maxc--;
            for(int i=maxc;i>=minc && c<=te;i--){
                lst.add(arr[maxr][i]);
                c++;
            }
            maxr--;
            for(int i=maxr;i>=minr && c<=te;i--){
                lst.add(arr[i][minc]);
                c++;
            }
            minc++;
        }
        return lst;
    }
}
