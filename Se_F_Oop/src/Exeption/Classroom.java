package Exeption;

public class Classroom {

	private String teacherName;

	private int[] studentArr;

	private int amountOfStudents;

	public Classroom(String tmpTeacherName, int tmpAmountOfStudent) {

		setAmountOfStudent(tmpAmountOfStudent);

		setTeacherName(tmpTeacherName);

	}

	private void setAmountOfStudent(int tmpAmountOfStudent) {

		this.amountOfStudents = tmpAmountOfStudent;

		this.studentArr = new int[this.amountOfStudents];
	}

	public void setTeacherName(String tmpTeacherName) {
		this.teacherName = tmpTeacherName;
	}

	public void setGrades(int[] greads) throws Exception {

		if (greads.length > studentArr.length) {
			throw new Exception("Error the arrey is bigger then the amount of students");
		}

		else if (greads.length == studentArr.length) {
			for (int i = 0; i < greads.length; i++) {

				if (greads[i] < 0 || greads[i] > 100)
					throw new Exception("Error the greads is not between 0-100");

				else
					this.studentArr[i] = greads[i];
			}
		}
	}

	public int returnGreade(int index) throws ArrayIndexOutOfBoundsException, NullPointerException {

		int result = 0;

		try {
			result = studentArr[index];

		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println(e.getMessage());

		}

		return result;

	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (this.getClass() != obj.getClass())
			return false;

		Classroom other = (Classroom)obj;

		if (this.amountOfStudents != other.amountOfStudents)
			return false;

		return this.teacherName != other.teacherName;

	}

	public String toString() {
		return "Name of teacher is " + this.teacherName + " amount of students is: " + this.amountOfStudents;
	}
}