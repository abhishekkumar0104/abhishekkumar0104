import java.lang.*;
class student
{ 
  String name;
  int rn;
  int m1, m2, m3, total;
  student()
 { name = "\0";
   rn = 0;
   m1 = m2 = m3 = 0;
   total = 0;
  }
  student(String x, int y, int a, int b, int c)
  {  name = x;
     rn = y;
     m1 = a;
     m2 = b;
     m3 = c;
     total =a+b+c;
   }
  student(student p)
 { name = p.name;
   rn = p.rn;
   m1 = p.m1;
   m2 = p.m2;
   m3 = p.m3;
   total = m1+m2+m3;
   }
  void display()
 { System.out.println("name-"+name);
   System.out.println("rollno.-"+rn);
   System.out.println("marks1-"+m1);
   System.out.println("marks2-"+m2);
   System.out.println("marks3-"+m3);
   System.out.println("total-"+total);
  }
}
class A
{ 
  public static void main(String args[])
 { System.out.println("\nusing default constructor-");
   student s1 = new student();
   s1.display();
   System.out.println("\nusing parametrised constructor-");
   student s2 = new student("anuj", 12, 36, 64, 57);
   s2.display();
   System.out.println("\nusing copy constructor-");
   student s3 = new student(s2);
   s3.display();
   }
}