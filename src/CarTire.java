public class CarTire {
    int maxCount;
    String tireName;
    int nowCount;
    public CarTire(int maxCount,String tireName){
        this.maxCount=maxCount;
        this.tireName=tireName;
    }
    public CarTire(){}
    public boolean ifMaxCount(){
        if(nowCount>=maxCount){
            System.out.println("타이어 교체");
            return true;
        }
        return false;
    }
}