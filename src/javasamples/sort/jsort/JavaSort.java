package javasamples.sort.jsort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSort {
  public static Comparator<Student> GPAComparator = new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
            if(o1.getCgpa() < o2.getCgpa()) return 1;
            else if(o1.getCgpa() > o2.getCgpa()) return  -1;
            else if(o1.getCgpa() == o2.getCgpa()) {
                if(o1.getFname().compareTo(o2.getFname()) > 0  ) return 1;
                else if (o1.getFname().compareTo(o2.getFname()) <0)  return -1;
                else if(o1.getFname().compareTo(o2.getFname()) == 0 ) {
                    if(o1.getId() < o2.getId() ) return  1;
                    else if (o1.getId() > o2.getId() ) return -1;
                }
            }


          return 0;
      }
  };

    public static void main(String[] args){
        List<Student> studentList = new ArrayList<Student>();

        Scanner scanner = new Scanner(System.in);
        int numberOfStudent= scanner.nextInt();

        while(numberOfStudent>0){
            int id = scanner.nextInt();
            String fname = scanner.next();
            double cgpa = scanner.nextDouble();
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            numberOfStudent--;
        }

        studentList.sort(GPAComparator);

        for(int i=0; i<studentList.size();i++){
            System.out.println(studentList.get(i).getId() + " - " + studentList.get(i).getFname() + " - " + studentList.get(i).getCgpa());
        }

    }
}
