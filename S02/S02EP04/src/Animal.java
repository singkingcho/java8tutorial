public class Animal {


    public double weight;

    String color;


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void eat(String food) {
        System.out.println("animal在吃：" + food);
    }

    public void sleep() {
        System.out.println("睡了八千年");
    }



}
















