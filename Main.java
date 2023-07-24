import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int amountOfDucks;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de patinhos: ");
		amountOfDucks = scan.nextInt();
		
		System.out.println("\n________________");
		System.out.println("Música: \n");
		
		for(int i = amountOfDucks; i >= 0; i--) {
		    switch(i) {
		        case 2:
		            System.out.println(i + " patinhos foram passear \nAlém das montanhas para brincar \nA mamãe gritou: 'Quá, quá, quá, quá' \nMas só "+ (i - 1) +" patinho voltou de lá\n");
		            break;
		        case 1:
		            System.out.println(i + " patinho foi passear \nAlém das montanhas para brincar \nA mamãe gritou: 'Quá, quá, quá, quá' \nMas nenhum patinho voltou de lá\n");
		            break;
		        case 0:
		            System.out.println("A mamãe patinha foi procurar \nAlém das montanhas, na beira do mar \nA mamãe gritou 'Quá, quá, quá, quá' \nE os "+ amountOfDucks +" patinhos voltaram de lá\n");
		            break;
		        default:
		            System.out.println(i + " patinhos foram passear \nAlém das montanhas para brincar \nA mamãe gritou: 'Quá, quá, quá, quá' \nMas só "+ (i - 1) +" patinhos voltaram de lá\n");
		        
		    }
		}
	}
}
