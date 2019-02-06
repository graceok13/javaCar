public class Runner {
    public static void main(String[] args){
        Car myCar = new Car (2006, "Audi", 100, "A6");
        System.out.println(myCar.toString());
        myCar.drive(100);
        System.out.println(myCar.toString());
        Rectangle myRectangle = new Rectangle (30.0, 40.0);
        System.out.println("Area: " + myRectangle.getArea());
        System.out.println("Diagonal: " + myRectangle.getDiagonal());
        System.out.println("Is a Square: " + myRectangle.isSquare());
    }
}