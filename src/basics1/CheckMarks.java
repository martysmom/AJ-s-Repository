package basics1;

public class CheckMarks {

	public static void main(String[] args) {
		gradeStudent(50);

	}

	static void gradeStudent(int studentScore) {
		
		// if studentScore is 50-60 print grade D
		if (studentScore >= 50 && studentScore < 60) {
			System.out.println("Grade D");

		}
		// if studentScore is 61-70 print grade C
		else if (studentScore >= 60 && studentScore < 70) {
			System.out.println("Grade C");

		}

		// if studentScore is 71-80 print grade B
		else if (studentScore >= 70 && studentScore < 80) {
			System.out.println("Grade B");
		}	

			// if studentScore is 81-100 print grade A
			else if (studentScore >= 80 && studentScore < 90) {
				System.out.println("Grade A");
			}
		}
	}
	