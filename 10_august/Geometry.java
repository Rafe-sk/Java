class Calculate{

    Calculate(double l, double b, double h)
    {
       System.out.println("The area of rectangle is "+ l*b*h );
    }

    Calculate(double l, double h)
    {
        System.out.println("The area of rectangle is "+ l*h );
    }

    Calculate(double r)
    {
        System.out.println("The area of rectangle is "+ 3.14*r );
    }

}

class Geometry{
    public static void main(String[] args){
        Calculate triangle = new Calculate(10, 20, 30);
        Calculate rectangle = new Calculate(10, 20);
        Calculate circle = new Calculate(5);
    }
}