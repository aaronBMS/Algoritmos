package Ejercicios;
import java.util.*;

public class compareTheTriplets {

	// Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	
    	List<Integer> c=new ArrayList<Integer>();
        int dato1=0,dato2=0;
        for(int i=0;i<a.size();i++) {
            if(a.get(i)>b.get(i)) {
                dato1++;
            }
            else if(a.get(i)<b.get(i)) {
                dato2++;
            }

        }
        c.add(0,dato1);
        c.add(1,dato2);
        
        return c;
    }
	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
	
    	}
	}


