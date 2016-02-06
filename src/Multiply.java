class Multiply {

    private static final int[] f  = {2,3,1,2,2};
    private static final int n=f.length-1;

    public static void main(String[] args){
        Multiply object = new Multiply();
        System.out.println(object.sumArray(f, n));
    }

    private int sumArray(int f[], int n){
        if(n==0)
        {
            return f[n];
        }
        else return f[n]*sumArray(f,n-1);
    }
}
