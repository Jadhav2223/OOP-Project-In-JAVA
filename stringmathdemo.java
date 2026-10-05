public class stringmathdemo {
    public static void main(String[] args) {
        String str1 = "Jadhav";
        String str2 = "Jayesh";

        String str3 = str1.concat(" "+str2);

        System.out.println("concatteation " + str3);
        System.out.println("length of string "+ str1.length());
        System.out.println("character of string "+ str1.charAt(1));
        System.out.println("substring of string "+ str1.substring(0,3));
        System.out.println("equals str1 and str2 "+ str1.equals(str2));
        System.out.println("uppercase str1 : "+ str1.toUpperCase());
        System.out.println("lowwercase string :"+ str1.toLowerCase());

        double a = 16.0;
        double b = 3.7;

        System.out.println("square root of a"+ Math.sqrt(a));
        System.out.println("a raised to b: "+ Math.pow(a,b));
        System.out.println("max of a and b :"+ Math.max(a,b));
        System.out.println("min  of a and b :"+ Math.min(a,b));
        System.out.println("random number (0-1) :"+ Math.random());
        System.out.println("random number (10-20)"+ (10 + Math.random() * (20 - 10)));
        System.out.println("random number (1-100)"+(1 + Math.random() * (100 - 1)));
        System.out.println("ceil of b: "+ Math.ceil(b));
         System.out.println("floor  of b: "+ Math.floor(b));
          System.out.println("round of b: "+ Math.round(b));


        
        

    }
    
}
