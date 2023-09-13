public class Inheritance {
    static class Car {
        String name;
        int noOfWheels;
        int modelNo;

        Car() {
            System.out.println("Default constructure is called");
        }

        Car(String _name, int _wheels, int model) {
            this.name = _name;
            this.noOfWheels = _wheels;
            this.modelNo = model;
        }

        void accelerate() {

        }

        void applyBreak() {

        }

        static class Swift extends Car {
            Swift() {
                System.out.println("swift Car created");
            }
        }

    }

    public static void main(String[] args) {

        Car S = new Car("swift", 4, 22);
        System.out.println(S.name + " " + S.noOfWheels);

    }


}


