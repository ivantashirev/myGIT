package HW5;

public class Person {

   private String surname;
   private String name;
   private String secondName;
   private String position;
   private String email;
   private String phoneNumber;
   private int salary;
   private int age;


   public Person(String surname,
                 String name,
                 String secondName,
                 String position,
                 String phoneNumber,
                 String email,
                 int salary,
                 int age) {
       this.surname = surname;
       this.name = name;
       this.secondName = secondName;
       this.position = position;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.salary = salary;
       this.age = age;
   }

   int getAge() {
       return age;
   }
   int getSalary() {
       return salary;
   }

   String getAllFields() {
       return this.surname + " " +
               this.name + " " +
               this.secondName + " " +
               this.getAge() + " " +
               this.position + " " +
               this.email + " " +
               this.phoneNumber + " " +
               this.getSalary() + " rub";
   }
}
