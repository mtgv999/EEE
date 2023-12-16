import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        System.out.print("트럭 최대 속도 입력");
        int maxSpeedTruck = sc2.nextInt();
        System.out.print("버스 최대 속도 입력");
        int maxSpeedBus = sc2.nextInt();
        System.out.print("km 입력");
        int km= sc2.nextInt();

        CarTire carTire1 = new CarTire(200, "truckTire");
        CarTire carTire2 = new CarTire(300, "busTire");

        Car truck = new Car(CarType.TRUCK, carTire1);
        Car bus = new Car(CarType.BUS, carTire2);
        truck.maxSpeed = maxSpeedTruck;
        bus.maxSpeed = maxSpeedBus;

        for (int i = 0; i < km; i++) {
            if (truck.ifMaxSpeed()) {
                System.out.println("현재 속도 " + truck.nowSpeed);
                break;
            }
            truck.nowSpeed++;
        }
        for (int i = 0; i < km; i++) {
            if (bus.ifMaxSpeed()) {
                System.out.println("현재 속도 " + bus.nowSpeed);
                break;
            }
            bus.nowSpeed++;
        }
        System.out.println("트럭 최대 사용 가능 횟수 입력");
        int maxCountTruck=sc2.nextInt();
        System.out.println("버스 최대 사용 가능 횟수 입력");
        int maxCountBus=sc2.nextInt();
        System.out.println("count 입력");
        int count=sc2.nextInt();

        truck.maxCount=maxCountTruck;
        bus.maxCount=maxCountBus;

        for (int i = 0; i < count; i++) {
            if(carTire1.ifMaxCount()){
                System.out.println("현재 남은 횟수 " + truck.carTire.nowCount);
                break;
            }
            truck.nowCount++;
        }
        for (int i = 0; i < count; i++) {
            if(carTire2.ifMaxCount()){
                System.out.println("현재 남은 횟수 " + bus.carTire.nowCount);
                break;
            }
            bus.nowCount++;
        }
    }
}