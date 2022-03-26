package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca,boolean estado) {
		this.marca = marca;
		this.estado = estado;
		TV.numTV++;
	}
	
	public Marca getMarca(){
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Control getControl(){
		return control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getPrecio(){
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen(){
		return volumen;
	}
	
	public void setVolumen(int volumen) {
		if(this.estado && volumen>=0 && volumen<=7) {
			this.volumen = volumen;
		}
	}

	public int getCanal(){
		return canal;
	}
	
	public void setCanal(int canal) {
		if(this.estado && canal>=1 && canal<=120) {
			this.canal = canal;
		}
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		this.canal++;
		if(!this.estado || this.canal>120) {
			this.canal--;
		}
	}
	
	public void canalDown() {
		this.canal--;
		if(!this.estado || this.canal<1) {
			this.canal++;
		}
	}
	
	public void volumenUp() {
		this.volumen++;
		if(!this.estado || this.volumen>7) {
			this.volumen--;
		}
	}
	
	public void volumenDown() {
		this.volumen--;
		if(!this.estado || this.volumen<0) {
			this.volumen++;
		}
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	public static void setNumTV(int numTv) {
		TV.numTV = numTv;
	}


}
