import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
private String name;
private int rollNumber;

public Student(String name, int rollNumber) {
this.name = name;
this.rollNumber = rollNumber;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public int getRollNumber() {
return rollNumber;
}

public void setRollNumber(int rollNumber) {
this.rollNumber = rollNumber;
}

// add toString() method
@Override
public String toString() {
return "Student name = " + name + ", rollNumber = " + rollNumber;
}

// add appropriate method for avoiding duplicate Student
public int hashCode() {
return rollNumber;

}

public boolean equals(Object o) {
if (this == o)
return true;
if (o == null || getClass() != o.getClass())
return false;
Student s = (Student) o;
return rollNumber == s.rollNumber || Objects.equals(getName(), s.name);
}

public static void main(String[] args) {
Set<Student> s = new HashSet<>();
s.add(new Student("Shashank", 1));
s.add(new Student("Nikhil", 2));
s.add(new Student("Karan", 3));
s.add(new Student("Karan", 1));
System.out.println(s);
}
}