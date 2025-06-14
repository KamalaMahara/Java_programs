//program to perform string methods

class StringMethods {

    public static void main(String[] args) {
        String s1 = "HELLO";
        String s2 = "world ";
        System.out.println("the length of s1 is :" + s1.length());   //length()method
        System.out.println(s2.toUpperCase());                        //toUpperCase() method 
        System.out.println(s1.toLowerCase());                 //toLowerCase(0method
        System.out.println(s1.charAt(2));                     //charAt()method
        System.out.println(s1.equals(s2));                //equals() method
        System.out.println(s1.equalsIgnoreCase(s2));    //equalsIgnoreCase() method
        System.out.println(s1.concat(s2));            //concat() method
        System.out.println(s1.isEmpty());          //isEmpty method
        System.out.println(s2.trim());               //trim() method

    }
}
