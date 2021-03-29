package Pruebas;

public class Enum {

	public enum DiasSemana{
		LUNES(true),MARTES(true),MIERCOLES(true),JUEVES(true),VIERNES(true),
		SABADO(false),DOMINGO(false);
		
		private boolean laborable;
		
		private DiasSemana(boolean laborable) {
			this.laborable=laborable;
		}
		
		public boolean dameDato(){
			return laborable;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiasSemana d=DiasSemana.DOMINGO;
		System.out.print("El día es: " +d +" - Es laborable?:" + d.dameDato());
	}

}
