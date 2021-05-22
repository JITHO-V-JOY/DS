import java.util.Scanner;
import java.util.Arrays;

class Student{
	String name;
	int mark;
	String[] subjects;

	Student(String name, int mark){
		this.name = name;
		this.mark = mark;
	}
	void getGrade(){
		if(mark <= 100 && mark >= 91){
			System.out.println(name +" has A+ Grade");
		}else if(mark <= 90 && mark >= 81){
                        System.out.println(name +" has A Grade");
                }else if(mark <= 80 && mark >= 71){
                        System.out.println(name +" has B+ Grade");
                }else if(mark <= 61 && mark >= 70){
                        System.out.println(name +" has B Grade");
                }else if(mark <= 51 && mark >= 60){
                        System.out.println(name +" has C+ Grade");
                }else  if(mark <= 41 && mark >= 50){
                        System.out.println(name +" has C Grade");
                }else{
			System.out.println(name+ " has failed");
		}

	}
	void quiz(){
		System.out.println("pick a state\n1.Kerala 2.Tamilnadu 3.Bengaluru");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch){
			case 1: System.out.println("In which year kerala was fromed as Indian state");
				       int ans1 = sc.nextInt();
				       if(ans1 == 1956){
				       		System.out.println("Congratulations!");
				       }else{
				       		System.out.println("answer is 1956");
				       }
				break;
			case 2: System.out.println("In which year madras state is renamed as Tamilnadu");
                                       int ans2 = sc.nextInt();
                                       if(ans2 == 1969){
                                                System.out.println("Congratulations!");
                                       }else{
                                                System.out.println("answer is 1969");
                                       }
				break;

			case 3: System.out.println("Bengaluru is also known as ______ city of india\n");
				       sc.nextLine();
                                       String ans = sc.nextLine();
                                       if(ans.equals("garden")){
                                                System.out.println("Congratulations!");
                                       }else{
                                                System.out.println("answer is garden city");
                                       }
				break;	
			default: System.out.println("invalid choice");
				 break;

		}
	}
	void favSubjects(){
		System.out.println("Enter your number of favourite subjects");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		subjects = new String[num];
		System.out.println("List them");
		sc.nextLine();
		for(int i = 0; i < num; i++ ){
			subjects[i] = sc.nextLine();
		}
		System.out.println("your favourite subjects are");
		System.out.println(Arrays.toString(subjects));

	}
}

class Main{
	public static void main(String args[]){
		Student std = new Student("jerin", 89);
		std.getGrade();
		std.quiz();
		std.favSubjects();
	}
}
