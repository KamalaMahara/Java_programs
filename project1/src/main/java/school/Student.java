
package school;


public class Student {
    private int roll;
    private char grade;
    private double per;
    
    public void setdata()
    {
        roll=8;
        grade='A';
        per=98.9;
        
    }
    public void showdata()
    {
       System.out.println(roll +","+grade+","+per);
    }
}
