package Ejercicios;

public class staircase {

	/*
		% - Siginifica que ah� ira un valor.
		n - En este caso es la cantidad de valores.
		s - Significa que ir� una cadena.
		str - Ser�a el valor.(Cadena).
	*/
	static void staircase(int n) {
        String str="#";
        for(int i=1;i<=n;i++){
            System.out.printf("%" + (n) + "s \n", str);
            str += "#";
        }

    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
