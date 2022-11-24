class Solution {
    public double[] convertTemperature(double celsius) {
        double[] arr=new double[2];
        double kel=273.15+celsius;
        arr[0]=kel;
        double freh= (celsius * 1.80) + 32.00;
        arr[1]=freh;    
        return arr;
    }
}
