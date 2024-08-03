class Degree {
    void getDegree() {
        System.out.println("I got a degree");
    }

}

class Undergraduate extends Degree {
    void getDegree() {
        System.out.println("I am Undergrat");
    }
}

class Postgraduate extends Degree {
    void getDegree() {
        System.out.println("I am Postgrat");
    }
}

public class prac4_5 {
    public static void main(String[] args) {
        Degree d1 = new Degree();
        d1.getDegree();
        Undergraduate u1 = new Undergraduate();
        u1.getDegree();
        Postgraduate p1 = new Postgraduate();
        p1.getDegree();
    }

}
