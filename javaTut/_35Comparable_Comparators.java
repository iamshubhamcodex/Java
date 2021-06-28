package javaTut;

//import java.util.*;

//class Student {
//	int marks;
//	String name;
//
//	public Student(int marks, String name) {
//		super();
//		this.marks = marks;
//		this.name = name;
//	}
//
//	public int getMarks() {
//		return marks;
//	}
//
//	public void setMarks(int marks) {
//		this.marks = marks;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [marks=" + marks + ", name=" + name + "]";
//	}
//
//	public int compareTo(Student obj) {
//		return this.marks - obj.marks;
//
//	}
//
//}

public class _35Comparable_Comparators {

	public static void main(String[] args) {
//		List<Student> students = new ArrayList<>();
//		students.add(new Student(23, "Ram"));
//		students.add(new Student(25, "Zhl"));
//		students.add(new Student(63, "Shyam"));
//		students.add(new Student(73, "Sonu"));
//		students.add(new Student(73, "Monu"));
//		students.add(new Student(13, "Ram"));
//		students.add(new Student(24, "Lalu"));
//		students.add(new Student(23, "Bhalu"));

//		Collections.sort(students);	//	if student class does not implements comparable then
//		Collections.sort(students, new SortByNameThenMarks());	//	if you don't want to create a different class so 
//		Collections.sort(students, new Comparator<Student>() {
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				if (o1.name.equals(o2.name)) {
//					return o1.marks - o2.marks;
//				} else {
//					return o1.name.compareTo(o2.name);
//				}
//			}
//		});		//	below is using lambda as we know only one function to implement and class is comparator and we can also delete student return typeso
//		Collections.sort(students, ( o1, o2) -> {
//			if (o1.name.equals(o2.name)) {
//				return o1.marks - o2.marks;
//			} else
//				return o1.name.compareTo(o2.name);
//		});
//		Collections.sort(students, (o1, o2) -> o1.name.compareTo(o2.name));
//		Collections.sort(students, Comparator.comparing(Student::getName));		//	sort by basis of name
//		Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
//		Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());	//	reverses the order of sorting
//		
//		students.forEach(System.out::println);
	}
}

//class SortByNameThenMarks implements Comparator<Student> {
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		if (o1.name.equals(o2.name)) {
//			return o1.marks - o2.marks;
//		}else {
//			return o1.name.compareTo(o2.name);
//		}
//		
//	}
//}
