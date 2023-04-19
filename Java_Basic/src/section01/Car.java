package section01;
public class Car {
    private int maxSpeed;
    private String manufacturer = "현대자동차";
    private String model;
    private String color;
    private int gas;
    private int step;
    private int currentSpeed = 10;
    
    public Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public void setGas(int gas){
        this.gas = gas;
    }
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    public void setCurrentSpeed(){
        this.currentSpeed = currentSpeed + 10;
    }
    public void resetSpeed(){
        this.currentSpeed = 0;

    }

    public void run(){
        while(true){
            if (gas >0){
                System.out.println("가스가"+gas+"남아있습니다.");
                setCurrentSpeed();
                increaseSpeed();
                gas -= 1;
            }
            else{
                System.out.println("가스가 없습니다.");
                resetSpeed();
                return;
            }
        }
    }
    public void increaseSpeed(){
            System.out.println("현재 속도: " + getCurrentSpeed()+ "km");
            
    }
}
