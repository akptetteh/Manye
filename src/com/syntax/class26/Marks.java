package com.syntax.class26;

public abstract class Marks {
	//Group Home Work-2:
	/**
	We have to calculate the average of marks obtained 
	in three subjects by student A and by student B. 
	Create class 'Marks' with an abstract method 'getPercentage' that will be 
	returning the average percentage of marks. 
	Provide implementation of abstract method in classes 'A' and 'B'. 
	The constructor of student A takes the marks in three subjects as its parameters 
	and the marks in four subjects as its parameters for student B. 
	Test your code
	**/

		int mathMark;
		int englishMark;
		int scienceMark;
		int biologyMark;
		int countSubject;
		Marks(int mathMark,int englishMark,int scienceMark){
			this.mathMark=mathMark;
			countSubject++;
			this.englishMark=englishMark;
			countSubject++;
			this.scienceMark=scienceMark;
			countSubject++;
		}
		Marks(int mathMark,int englishMark,int scienceMark, int biologyMark){
			this.mathMark=mathMark;
			countSubject++;
			this.englishMark=englishMark;
			countSubject++;
			this.scienceMark=scienceMark;
			countSubject++;
			this.biologyMark=biologyMark;
			countSubject++;
		}
		public abstract double getPercentage();
	}
	class TestMarks {
		public static void main(String[] args) {
			StudentA student1=new StudentA(80,90,95);
			double averageP=student1.getPercentage();
			System.out.println(averageP+" % ");
			System.out.println("===========================");
			StudentB student2=new StudentB(90,89,95,90);
			averageP=student2.getPercentage();
			System.out.println(averageP+" %");
		}
	}
	class StudentA extends Marks{
		StudentA(int mathMark, int englishMark, int scienceMark) {
			super(mathMark, englishMark, scienceMark);
		}
		@Override
		public double getPercentage() {
			double averagePercentage;
			averagePercentage=((mathMark+englishMark+scienceMark)/super.countSubject);
			System.out.print("The average percentage for "+super.countSubject+" subjects marks is: ");
			return averagePercentage;
		}
	}
	class StudentB extends Marks{
		StudentB(int mathMark, int englishMark, int scienceMark, int biologyMark) {
			super(mathMark, englishMark, scienceMark, biologyMark);
		}
		@Override
		public double getPercentage() {
			double averagePercentage;
			averagePercentage=((mathMark+englishMark+scienceMark+biologyMark)/super.countSubject);
			System.out.print("The average for "+super.countSubject+" subjects marks is: ");
			return averagePercentage;
		}
	}


