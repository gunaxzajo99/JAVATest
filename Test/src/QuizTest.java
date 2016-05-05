import java.util.Scanner;

public class QuizTest {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		int num = kb.nextInt();
		Quiz [] Q = new Quiz[num];
		for(int i = 0;i<Q.length;i++){
			Q[i]= new Quiz(kb.nextInt(), 0, null);
		}
		for(int i = 0;i<Q.length;i++){
			Q[i].setFinalSc(kb.nextInt());;
		}
		for(int i = 0;i<Q.length;i++){
			Q[i].setName(kb.next());;
		}
		for(int i = 0;i<Q.length;i++){
			int sum = Q[i].getMidSc()+Q[i].getFinalSc();
			System.out.print(Q[i].getName()+" "+sum+" ");
		}
	}

}
