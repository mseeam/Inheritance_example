public class SubClass extends SuperClass{
    /** Constructor  */
    public SubClass(){
        super(10); //it will execute not default constructor but the constructor with parameter 
        System.out.println("This is subclass" + " Constructor");
    }
}