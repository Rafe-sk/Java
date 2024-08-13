class Box {
    double w, h, d; 

   
    Box(double w, double h, double d) {
        this.w = w;
        this.h = h;
        this.d = d;
    }

    public double geWidth()
    {
        return w;
    }


    Box() {
        w = h = d = 0;
    }


    Box(double a) {
        w = h = d = a;
    }

    Box(Box obj) {
        this.w = obj.w;
        this.h = obj.h;
        this.d = obj.d;
    }


    double volume() {
        return w * h * d;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box(5);
        Box mybox3 = new Box(5,10,15);
        Box mybox4 = new Box(mybox3);
        Box mybox5 = mybox3;


        System.out.println("Volume of mybox1 is " + mybox1.volume());
        System.out.println("Volume of box2 is " + mybox2.volume());
        System.out.println("Volume of box3 is " + mybox3.volume());
        System.out.println("Volume of box4 is " + mybox4.volume());
        System.out.println("Volume of box5 is " + mybox5.volume());
    }
}
