package Ejercicios;
import java.util.*;

public class gradingStudents {

	public static List<Integer> gradingStudents(List<Integer> grades) {
	    // Write your code here
	        for(int i=0;i<grades.size();i++){
	            if(grades.get(i)<38){
	                grades.set(i,grades.get(i));
	            }
	            else if((((grades.get(i)/5)+1)*5)-grades.get(i)>2){
	                grades.set(i,grades.get(i));
	            }else{
	                grades.set(i,(((grades.get(i)/5)+1)*5));
	            }
	        }
	        return grades;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
