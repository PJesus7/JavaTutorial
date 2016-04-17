public class MyComplex {
	private double real;
	private double imag;

	public MyComplex(double real, double imag){
	this.real = real;
	this.imag = imag;
	}
	//setters / getters
	public double getReal() {
		return real;
	}
	public void setReal(double real){
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag){
		this.imag = imag;
	}
	public void setValue(double real, double imag){
		setReal(real);setImag(imag);
	}
	//toString
	public String toString() {
		String out = "(" + real;
		if (imag >= 0) out += " + " + imag + "i)";
		else out += " - " + (-imag) + "i)";
		return  out;
	}
	//booleans
	public boolean isReal() {
		return (imag == 0);
	}
	public boolean isImag() {
		return (real == 0);
	}

	public boolean equals(double real, double imag){
		return (this.real == real && this.imag == imag);
	}
	public boolean equals(MyComplex another){
		return (real == another.getReal() && imag == another.getImag());
	}

	//values
	public double magnitude() {
		return Math.sqrt(real*real + imag*imag);
	}

	public double argumentInRadians() {
		return Math.atan2(imag,real);
	}

	public int argumentInDegrees() {
		return (int)(180.0*Math.atan2(imag,real)/Math.PI);
	}

	//operations
	public MyComplex conjugate() {
	return new MyComplex(real, -imag);}

	public MyComplex add(MyComplex another) {
	return new MyComplex(real + another.getReal(), imag + another.getImag());}

	public MyComplex subtract(MyComplex another) {
	return new MyComplex(real - another.getReal(), imag - another.getImag());}

	public MyComplex multiplyWith(MyComplex another) {
		double c=another.getReal(), d=another.getImag();
		setValue(real*c - imag*d, real*d + imag*c);
	return this;}

	public MyComplex divideBy(MyComplex another) {
		multiplyWith(another.conjugate());
		setValue(getReal()/(another.magnitude()*another.magnitude()),getImag()/(another.magnitude()*another.magnitude()));
	return this;}
}