class arth{
    int a,b;
    void insert(int c, int d){
        a=c;
        b=d;
    }
    int add(){
        int add;
        add = a+b;
        return add;
    }
    public static void main(String[] args){
        arth A1 = new arth();
        A1.insert(4,5);
        int result = A1.add();
        System.out.println(result);
    }
}
