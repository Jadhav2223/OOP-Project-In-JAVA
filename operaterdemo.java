public class operaterdemo {
    void add( int a, int b)
    {
        int sum = a + b;
        System.out.println("Addition : "+ sum);
    }

    int multiply(int a , int b){
        return a*b;
    }

    public static void main(String[] args) {
        byte a = 15 , b = 30 ;
        int result = a + b;
        System.out.println("result : "+ result);

        int x = 10 , y = 3;
        System.out.println("x + y = "+ (x+y));
        System.out.println("x - y = "+ (x-y));
        System.out.println("x * y = "+ (x*y));
        System.out.println("x / y = "+ (x/y));
        System.out.println("x % y = "+ (x%y));

        operaterdemo obj = new operaterdemo();
        obj.add(20,30);
        int product = obj.multiply(10,5);
        System.out.println("multiplation : "+product);
    }
}