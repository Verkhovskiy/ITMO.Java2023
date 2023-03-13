package Task07;

public class Plane {
    public class Wing {
        private int weight;
        public int getWeight() {
            return weight;
        }
        public void setWeight(int weight) {
            this.weight = weight;
        }
        public void printWeight() {
            System.out.println("The weight of this wing is: " + this.weight);
        }
    }
}
