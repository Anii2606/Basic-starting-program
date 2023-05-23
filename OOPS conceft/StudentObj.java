import ClassandObject.*;
public class StudentObj{
public static void main(String []args){
	// Student c;
	// c=new Student;
	Student c=new Student();
	c.student_name="Anikesh chouhan";
	c.student_Id=1270;
	c.student_city="Khategaon";
	c.student_class="Final year";
	c.study();
	c.alldata();
	System.out.println(" ");
	
	Student d=new Student();
	d.student_name="Harshit chouhan";
	d.student_Id=1230;
	d.student_city="Khategaon";
	d.student_class="12th";
	d.study();
	d.alldata();
	System.out.println(" ");	
	
	Student e=new Student();
	e.student_name="Saloni chouhan";
	e.student_Id=1220;
	e.student_city="Khategaon";
	e.student_class="8th";
	e.study();
	e.alldata();
	System.out.println(" ");
	
	Student f=new Student();
	f.student_name="Ishika maheshwari";
	f.student_Id=1120;
	f.student_city="Rehti";
	f.student_class="4th";
	f.study();
	f.alldata();
}
}