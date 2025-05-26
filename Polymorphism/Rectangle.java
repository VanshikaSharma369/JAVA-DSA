class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    @Override
    double area(){
        double ans = length*width;
        System.out.println("Area of a rectangle:" + ans);
        return ans;
    }
}
