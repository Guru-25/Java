package comparison;

import java.util.Arrays;
import java.util.Comparator;

class St {
    int reg;
    int marks;
    St(int reg,int marks){
        this.reg=reg;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return marks+" - "+reg;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        St s1=new St(65566,97);
        St s2=new St(65567,95);
        St s3=new St(65568,100);
        St[] students={s1,s2,s3};
        System.out.println(Arrays.toString(students));
//        Arrays.sort(students);
        Arrays.sort(students, new Comparator<St>() {
            @Override
            public int compare(St o1, St o2) {
                return -(o1.marks - o2.marks);
            }
        });
        System.out.println("after sort");
        System.out.println(Arrays.toString(students));
    }
}
