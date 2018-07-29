//Complex class calculates the sum of two complex numbers
public class Complex {
	
	private float real;
	private float imaginary;
	
	

	public float getReal() {
		return real;
	}

	public void setReal(float real) {
		this.real = real;
	}

	public float getImaginary() {
		return imaginary;
	}

	public void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}
	
	//Addition of two numbers
	public Complex sum(Complex C1, Complex C2) //passing objects of the class as parameters
	{
		Complex csum = new Complex();
		csum.real = C1.real + C2.real;
		csum.imaginary = C1.imaginary + C2.imaginary;
		return csum;
	}

	
}
