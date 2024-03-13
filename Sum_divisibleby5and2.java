class A {
    public static void main(String[] args) {
        int arr[]={100,52,43,99,42,40,91};
        int i,s=0;
        
        for (i=0;i<(arr.length);i++)
        {
            if (arr[i]%5==0 || arr[i]%2==0)
            {
                s=s+arr[i];
            }
        }
        System.out.print(s);
    }
}
