 class Student {
     String name;
     int age;
 
     Student(String name, int age) {
         this.name = name;
         this.age = age;
     }
 
     void display() {
         System.out.println("Name: " + name + ", Age: " + age);
     }
 }
 
 public class ClassesAndObjects {
     public static void main(String[] args) {
         Student student1 = new Student("Satya", 19);
         Student student2 = new Student("Hema", 17;
 
         student1.display();
         student2.display();
     }
 }
