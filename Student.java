public class Student(String name, int grade, String school){
    this.name = name;
    this.grade = grade;
    this.school = school; 
}

public String getName(){
    return this.name;
}


public String toString(){
    return this.name + "is from" + this.school; 
}