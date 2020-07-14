
package student1;

class student{
    private String name;
    private String address;
    private int numCourse;
    private String[] courses;
    private int[] grades;
    
    
    student(String name, String address){
        this.name = name;
        this.address = address;
        this.numCourse = 0;
        this.courses = new String[30];
        this.grades = new int[30];
        }
    
    public String getName(){
        return name;
    }
    
    public String getAdd(){
        return address;
    }
    
    public void setAddress(String add){
        address = add;
    }
    
    public void addCourse(String Course){
        courses[numCourse] = Course;
        numCourse++;
    }
    
    public void addCourseGrade(String course, int grade){
        for(int i=0;i<numCourse;i++){
            if(course.equals(courses[i])){
                grades[i] = grade;
                break;
            }
        }
    }
    
    public void printGrades(){
        System.out.println("Name: " + this.name);
        for(int i=0;i<numCourse;i++){
            System.out.println("Course: " + courses[i] + ", Grade: " + grades[i]);
        }
    }
    
    public double getAverage(){
     double sum=0.0;
     for(int i=0;i<numCourse;i++){
         sum+=grades[i];
        }
     return sum/numCourse;
    }
    
    public String toString(){
        return ("Name: " + name + ", Address: " + address + ", Average Grade: " + getAverage());
    }
    
}
public class Student1 {

    public static void main(String[] args) {
        
    }
    
}
