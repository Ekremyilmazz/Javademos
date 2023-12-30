package rosterArray;

public class Main {

	public static void main(String[] args) {
		Student[] studentRoster=new Student[4];
		
		studentRoster[0]=new Student("Ekrem",18);
		studentRoster[1]=new Student("Ahmet",23);
		studentRoster[2]=new Student("Deniz",17);
		studentRoster[3]=new Student("Cenk",22);
		
		for(int i=0;i<studentRoster.length;i++) {
			System.out.println("Student"+(i+1)+":"+studentRoster[i].getName());
		}
	}

}
