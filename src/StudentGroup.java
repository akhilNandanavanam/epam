import java.util.Date;
import java.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {

		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
        try
        {
            if(student==null)
            {
                throw new IllegalArgumentException();
            }

        else{
	    this.students = new Student[0];
	    for(int i=0;i<students.length;i++)
		{
			students[i+1]=students[i];

		}
		students[0]=student;
		}
        }
        catch(Exception e){
            System.out.println(e);
        }
	}


		// Add your implementation here




	@Override
	public void addLast(Student student) {
		// Add your implementation here
		try
        {
            if(student==null)
            {
                throw new IllegalArgumentException();
            }

        else{
	    this.students = new Student[students.length+1];

		students[students.length+1]=student;
		}
        }
        catch(Exception e){
            System.out.println(e);
        }
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		try{
			if(index<0 || index>students.length){
				throw new IllegalArgumentException();
		}
		else{

		for(int i=0;i<students.length;i++)
		{
			students[i]=students[i+1];
        }
		this.students = new Student[index];
		students[index]=student;
		}
		}
			catch(Exception e)
			{
                System.out.println(e);
			}
	}

	@Override
	public void remove(int index) {
	    try{
			if(index<0|| index>students.length){
				throw new IllegalArgumentException();
		}
		else{
		for(int i=index;i<students.length;i++)
		{
			students[i]=students[i+1];
		}
		}
		}
			catch(Exception e)
			{
                System.out.println(e);
			}
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {

		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
	    try{
			if(index<0|| index>students.length){
				throw new IllegalArgumentException();
		}
		else{
		for(int i=index+1;i<=students.length;i++)
		{
			students[i]=null;
		}
		}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
	    int i;
	    try{
			if(student==null){
				throw new IllegalArgumentException();
		}
		else{
		for(i=0;i<students.length;i++)
		{
			if(students[i]==student)
				break;
		}
		for(int j=0;i<=students.length;i++)
		{
			students[i]=students[i+1];
		}
		}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}

		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
	    try{
			if(index<0|| index>students.length){
				throw new IllegalArgumentException();
		}
		else{
		for(int i=0;i<=index;i++)
		{
			students[i]=students[index+1];

		}
		}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
	   int p=0;
	    try{
			if(student==null){
				throw new IllegalArgumentException();
		}
		else{
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==student)
			{
				p=i;
				break;
			}

		}
		for(int i=0;i<p;i++)
		{
			students[i]=students[p+1];

		}
		}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
