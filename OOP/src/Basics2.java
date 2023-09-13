import java.util.Scanner;
/*
4 pillars
1. polymorphism
2. Abstraction
3. Encapsulation
4. Inheritance
 */
public class Basics2 {
    static class Student{
        String name;
        int roll;
        Student(String _name,int _roll){
            System.out.println("Constructor is called");
            this.name = _name;
           this.roll = _roll;
        }
        Student(String namee){
            this.name = namee;
           this.roll = 10;
        }
       public void study(){
            System.out.println(name+" " + "is Studying");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] stdata = new Student[2]; //creating  Student Array of objects
        Student s  =new Student("ayush");
        s.study();
        for(int i =0;i<2;i++){
            String sName = sc.next();
            int sroll = sc.nextInt();
            stdata[i] = new Student(sName,sroll); //adding student name ans roll of two different students

        }
        for (int i = 0; i <2 ; i++) {

            System.out.println(stdata[i].name+" "+stdata[i].roll);
        }

    }
}
