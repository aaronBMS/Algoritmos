package Ejercicios;

public class SimpleArraySum {
	
	static int simpleArraySum(int[] ar) {
        int sum=0;
        for(int i=0;i<ar.length;i++){
            sum=sum+ar[i];
        }
        return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
