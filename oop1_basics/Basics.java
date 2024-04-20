public class Basics {
    public static void main(String[] args) throws Throwable {
        Student s1 = new Student("Mayank",7,8.60);
        Teacher t = new Teacher("Rahul");
        t = new Teacher("mangu");
        System.out.println(s1.name +" "+ s1.roll+ " "+ s1.marks);
    }
    static class Student{
        int roll;
        double marks;
        String name;
        Student(){
            this.roll = 1;
            this.marks = 100.00;
            this.name = "Unknown";
        }
        Student(String name, int roll, double marks){
            this.roll = roll;
            this.marks = marks;
            this.name = name;
        }
        Student(Student s){
            this.roll = s.roll;
            this.marks = s.marks;
            this.name = s.name;
        }
         Student(boolean isNew){
            this("New",23,50.00);
         }
    }
}

final class Teacher{
    String name;
    Teacher(String name){
        this.name = name;
    }
}
