package Ejercicios;
import java.util.*;

public class birthdayCakeCandles {
	
	public static int birthdayCakeCandles(List<Integer> candles) {
	    // Write your code here
		int base=-1;
        int velas=0;
        	for(int i=0;i<candles.size();i++){
            	if(base==candles.get(i)){
                velas++;
            	}
            	if(candles.get(i)>base){
                base=candles.get(i);
                velas=1;
            	}
        	}
        	return velas;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
