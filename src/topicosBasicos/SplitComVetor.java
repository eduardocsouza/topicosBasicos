package topicosBasicos;

public class SplitComVetor {
	
	public static void main(String[] args) {
		
		String s = "Lemon tomato aplle";
		
		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}

//split é um comando que se utiliza sempre com um vetor.