public class Student
{
    private String name;
    private int grade;
    private String school;

    public Student(String name, int grade, String school){
    	this.name = name;
	    this.grade = grade;
	    this.school = school; 
    }

    public String getName(){
    	return name;
	}

	public String toString(){
		return this.name + "is from" + this.school; 
	}
}

