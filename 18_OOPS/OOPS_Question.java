

class OOPS_Questions{
    public static void main(String args[]){
        Complex c = new Complex(4, 5);
        Complex d = new Complex(8, 9);
        
        Complex e = Complex.add(c, d);
        Complex f = Complex.sub(c, d);
        Complex g = Complex.prod(c,d);
    }
}

class Complex{
    int real;
    int imag;

    public Complex(int r, int i){
        real = r;
        imag = i;
    }


    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real), (a.imag+b.imag));
}

    public static Complex sub(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }

    public static Complex prod(Complex a, Complex b){
        return new Complex((a.real*b.real)-(a.imag*b.imag), (a.real*b.imag)+(a.imag*b.real));
    }

    public void printComplex(){
        if (real == 0 && imag!=0){
            System.out.println(imag+"i");
        }

        else if(real != 0 && imag == 0){
            System.out.println(real);
        }

        else{
            System.out.println(real + "+" + imag + "i");
        }
    }
}

