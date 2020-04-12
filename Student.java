import java.util.List;

class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> grades;

	//TODO constructor

	public Student(String index, String firstName, String lastName, List<Integer> grades)
	{
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}


	//TODO seters & getters


	public String getIndex()
	{
		return index;
	}

	public void setIndex(String index)
	{
		this.index = index;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}


	public double getAverage() {
		//TODO
		double average = 0;
		for ( int g : grades )
			average += g;
		return average / grades.size();
	}

	public int ECTSCredits() {
		//TODO
		int total = 0;
		for ( int g : grades )
			total += 6;
		return total;
	}
}
