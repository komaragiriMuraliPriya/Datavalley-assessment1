class A {
    public static void main(String[] args) {
        String t="type here to search";
        int i;
        String s=" ";
        
        for (i=0;i<(t.length());i++)
        {
            if (i%2!=0 && t.charAt(i) !=' ')
            {
                s=s+t.charAt(i);
            }
        }
        System.out.print(s);
    }
}
