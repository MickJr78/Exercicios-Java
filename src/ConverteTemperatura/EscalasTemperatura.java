package ConverteTemperatura;

public class EscalasTemperatura {
	private float c;
	private float f;
	private float k;
	private float re;
	private float ra;

	public EscalasTemperatura(float c, float f, float k, float re, float ra) {
		this.c = c;
		this.f = f;
		this.k = k;
		this.re = re;
		this.ra = ra;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public float getF() {
		return f;
	}

	public void setF(float f) {
		this.f = f;
	}

	public float getK() {
		return k;
	}

	public void setK(float k) {
		this.k = k;
	}

	public float getRe() {
		return re;
	}

	public void setRe(float re) {
		this.re = re;
	}

	public float getRa() {
		return ra;
	}

	public void setRa(float ra) {
		this.ra = ra;
	}

	public void celsius() {
		System.out.println("");
		System.out.println("========================================= CONVERSOR DE TEMPERATURAS =========================================");
		System.out.print("");
		System.out.println("A temperatura definida é de " + this.getC() + " graus Celsius. ");
		System.out.println("Na escala Fahrenheit, esta temperatura corresponde a " + this.getF() + " graus.");
		System.out.println("Já na escala Kelvin, a mesma temperatura corresponde a " + this.getK() + " graus.");
		System.out.println("Na escala de Réaumur, por sua vez, corresponde a " + this.getRe() + " graus.");
		System.out.println("Por fim, na escala de Rankine, " + this.getC() + " graus corresponde a " + this.getRa() + " graus.");
		System.out.println("");
		System.out.println("============================================== FIM DO PROCESSO ==============================================");
	}

	public void fahrenheit() {
		this.f = ((this.getC()*1.8f) + 32 );
	}

	public void kelvin() {
		this.k = (this.getC() + 273.15f);

	}

	public void reaumur() {
		this.re = (this.getC() * 0.8f);

	}

	public void rankine() {
		this.ra = ((this.getC() * 1.8f) + 32 + 459.8f);

	}
}
