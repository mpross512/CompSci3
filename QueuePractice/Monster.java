public class Monster {

    private int height;
    private int weight;
    private int age;

    public Monster() {
        this(1, 1, 1);
    }

    public Monster(int height) {
        this(height, 1, 1);
    }

    public Monster(int height, int weight) {
        this(height, weight, 1);
    }

    public Monster(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    
}