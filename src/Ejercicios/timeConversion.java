package Ejercicios;

public class timeConversion {
	
	static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String hora=s.substring(0,2);
        String format=s.substring(8,10);
        int tiempo=Integer.parseInt(hora);
        if(format.equals("PM")){
            if(tiempo>=01 && tiempo<12){
                tiempo=tiempo+12;
                s=tiempo+""+s.substring(2,8);
            }else{
                s=s.substring(0,8);
            }
        }
        if(format.equals("AM")){
            if(tiempo==12){
                s="00"+s.substring(2,8);
            }else{
                s=s.substring(0,8);
            }
        }
        return s;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
