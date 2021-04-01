package Ejercicios;

public class PlusMinus {
	
	static void plusMinus(int[] arr) {
        double pos=0,neg=0,cer=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos++;
            }
            if(arr[i]<0){
                neg++;
            }
            if(arr[i]==0){
                cer++;
            }
        }
        System.out.printf("%.6f %n", pos/arr.length);
        System.out.printf("%.6f %n", neg/arr.length);
        System.out.printf("%.6f %n", cer/arr.length);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
