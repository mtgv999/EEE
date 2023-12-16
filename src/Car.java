public class Car {
    int maxSpeed;
    String name;
    CarType carType = CarType.CAR;
    CarTire carTire;
    int nowSpeed;
    int nowCount;
    int maxCount;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(CarType carType, CarTire carTire) {
        this.carType = carType;
        this.carTire = carTire;
    }

    public Car() {
    }

    public boolean ifMaxSpeed() {
        if (nowSpeed >= maxSpeed) {
            System.out.println("속도 감소");
            return true;
        }
        return false;
    }
}