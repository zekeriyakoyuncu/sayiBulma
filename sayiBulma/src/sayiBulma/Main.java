package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9};
		int wantedNumber = 7; 
		boolean flag = false;
		for(int index = 0 ; index< numbers.length; index++ ) {
			if(numbers[index] == wantedNumber) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("Aranan sayı bulundu.");
		}
		else{
			System.out.println("Aranan sayı bulunamadı.");
		}

	}

}
