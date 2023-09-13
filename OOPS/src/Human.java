public class Human {
    public static class Men{
        int age;
        String name;
        int salary;
        boolean married;
        static long population;

        Men(int age,String name,int salary, boolean married){
            this.age  =age;
            this.name = name;
            this.salary = salary;
            this.married = married;
            Men.population +=1;
        }
    }
}
