public class Person {
    private String name;
    private String color;
    private int age;

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getColor(){
        return color;
    }
    public void setName(String nameInput){
        this.name = nameInput;
    }
    public void setColor(String colorInput){
        this.color = colorInput;
    }
    public void setAge(int ageInput){
        this.age = ageInput;
    }
    @Override
    public String toString() {
        return "Name: " + getName() + ", Favorite Color: " + getColor() + ", Age: " + getAge() + "\n";
    }
}