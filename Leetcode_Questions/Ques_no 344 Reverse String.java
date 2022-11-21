class Solution {
    public void reverseString(char[] s) {
        int spt=0;
        int ept=s.length-1;
        while(spt<ept){
            char temp=s[spt];
            s[spt]=s[ept];
            s[ept]=temp;
            spt++;
            ept--;
        }
    }
}
