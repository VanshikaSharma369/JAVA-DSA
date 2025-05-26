class Circle extends Shape {
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double area(){
        double result = Math.PI*radius*radius;
        System.out.println("Area of a circle:" + result);
        return result;
    }
}
