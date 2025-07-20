package comparison;

class Student implements Comparable<Student>{
    int reg;
    int marks;
    Student(int reg,int marks){
        this.reg=reg;
        this.marks=marks;
    }
    public int compareTo(Student o){
        return this.marks - o.marks;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        Student guru=new Student(65566,100);
        Student raja=new Student(65567,99);

        if(guru.compareTo(raja) > 0){
            System.out.println("guru has more marks");
        } else if(guru.compareTo(raja) < 0){
            System.out.println("raja has more marks");
        } else{
            System.out.println("both have same marks");
        }

    }
}
