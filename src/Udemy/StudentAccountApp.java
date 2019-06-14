package Udemy;
/* This is concerned about four key concepts. one is about private properities and private method which are initalized in class constructor.
* But for public method,we need to call them by instance of class.
* Two is private static final int costofcourse, final is allowed to changed.
* Getters and Setters for Encapsulation.
* Not mentioned Polymorphism and Abstraction
* toString method is Inheritance.
*/ 

public class StudentAccountApp {
    public static void main(String[] args) {
        StudentAccount ac1 = new StudentAccount("Fang", "100234221");
        StudentAccount ac2 = new StudentAccount("Fred", "100923210");
        ac1.enroll("Math101");
        ac1.enroll("Math102");
        ac2.enroll("Eng321");
        ac2.enroll("Eng322");
        ac1.showCourses();
        ac1.checkBalance();
        ac1.payTuition(600);
        ac1.checkBalance();
        System.out.println(ac1.toString());

    }
}
class StudentAccount {
    //properties
    private String name;
    private String ssn;
    private String email;
    private static int id = 10;
    private String userId; //id + random 4-digit number + last 4 of SSN
    private String phone;
    private String city;
    private String state;
    private String courses="";
    private static final int costofcourse = 800;
    private int balance=0;
    //constructor
    public StudentAccount (String name, String ssn){
        this.name = name;
        this.ssn = ssn;
        id++;
        setEmail();//call the method in the constructor
        setUserId();//call the method in the constructor
    }
    //getters and setters
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }



    public String getPhone() {
        return phone;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    //private method
    private void setEmail() {
        email = name.toLowerCase() + "."+ id + "@gmail.com";
        System.out.println("Your email is:" + email);
    }
    private void setUserId(){
        int max = 9999;
        int min= 1000;
        int randNum = (int)((Math.random()*(max-min)));
        randNum= randNum + min;
        userId = id + randNum + ssn.substring(3);
        System.out.println("Your user id is " + userId);
    }
    //public method
    public void enroll(String course){
        this.courses +="\n" + course;
        System.out.println(courses);
        balance = balance + costofcourse;

    }
    public void payTuition(int amount){
        System.out.println("Payment $" + amount);
        balance = balance-amount;

    }
    public void checkBalance(){
        System.out.println("Your balance is $" + balance);

    }
    public void showCourses(){
        System.out.println("Your courses are" + courses);

    }
    public String toString(){
        return "[NAME: " +  name + "]\n[COURSE: " + courses + "]\nBALANCE: " + balance + "]";


    }

}
