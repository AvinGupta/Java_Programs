class Solution {
    public int[][] generateMatrix(int nums) {
        //initialization of 2d-array
        int[][] arr=new int[nums][nums];
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
                arr[minr][i]=c;
                c++;
            }
            minr++;
            for(int i=minr;i<=maxr && c<=te;i++){
                arr[i][maxc]=c;
                c++;
            }
            maxc--;
            for(int i=maxc;i>=minc && c<=te;i--){
                arr[maxr][i]=c;
                c++;
            }
            maxr--;
            for(int i=maxr;i>=minr && c<=te;i--){
                arr[i][minc]=c;
                c++;
            }
            minc++;
        }
        return arr;
    }
}
