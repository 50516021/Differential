package differential;

public class Differential_lib implements Differential_if {

	private double a, h;
	
	
	public Differential_lib(double a, double h) {
		this.a = a;
		this.h = h;
	}
	
	@Override
	public double getRx(){
		return 2*this.a;
	}
	@Override
	public double getDx(){
	return (Math.pow(this.a+this.h, 2)-Math.pow(this.a, 2))/h;

	}
	@Override
	public double getRex(){
	return Math.abs(getRx()-getDx())/getRx()*100;

	}
	
}
//Input value of a> 1
//Input value of h> 0.00000001
//f(x)=x^2��x=1.0�ɂ���������W����2.0
//f(x)=x^2��x=1.0�ɂ����鐔�l������1.999999987845058
//���Ό덷�F6.07747097092215E-7
//�ƂȂ�A��Ԃ�������h��0.00000001
