package labWork_2_2_4c;

/**

 Create class Person with fields firstName(String), lastName(String), age(int), gender(String), phoneNumber(int),
 and  five overloaded methods that set this fields with different arguments list.
 And create class that will be use instance of class Person and his methods.


 */
public class Person {
    private String firstName,
                   lastName,
                   gender;
    private int age,
                phoneNumber;
    public void  set(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void set(String firstName, int age){
        this.firstName = firstName;
        this.age = age;

    }
    public void set(int age, String firstName){
        this.age= age;
        this.firstName= firstName;
    }
    public  void set (int age, int phoneNumber){
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    public  void set (String firstName, String lastName, String gender, int age, int phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.phoneNumber= phoneNumber;
    }
    public void view(){
        System.out.println("FirstName= "+ firstName + ",\tLastName= "+ lastName + "\tGender= "+ gender+ "\tAge= "+ age +"\tPhon= "+ phoneNumber);
    }

}
