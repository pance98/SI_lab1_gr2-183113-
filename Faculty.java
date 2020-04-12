class Faculty
{
    List<Student> students;
    String facultyName;

    public Faculty(String facultyName)
    {
        this.facultyName = facultyName;
        this.students = new ArrayList<>();
    }
    public void addStudent (Student s)
    {
        students.add(s);
    }
    public void removeStudent (Student s)
    {
        students.remove(s);
    }
    public float averageCredits()
    {
        float average = 0;
        for ( Student s : students )
            average += s.ECTSCredits();
        return average / students.size();
    }
}