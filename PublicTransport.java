import java.util.UUID;

public class PublicTransport {


    private final String number;
    private int fuelVolume = 100;
    private int speed = 0;
    private int speedChange;
    private int maxPassenger;
    private int remainPassenger;
    private int passenger;
    private String driveState;
    private int basicCharge;
    private int currentPay;


    public PublicTransport() {
        this.number = UUID.randomUUID().toString();
    }


    @Override
    public String toString() {
        return "PublicTransport{" +
                "번호='" + number + '\'' +
                ", 주유량=" + fuelVolume +
                ", 속도=" + speed +
                ", 속도 변경=" + speedChange +
                ", 최대 승객 수=" + maxPassenger +
                ", 탑승 승객 수=" + passenger +
                ", 상태=" + driveState +
                ", 기본 요금=" + basicCharge +
                ", 현재 요금=" + currentPay +
                '}';
    }

    public void driveStart() {
        System.out.println("운행을 시작합니다");
        changeState(1);
    }

    public void changeSpeed(int speed) {
        this.speedChange = speed;
        if ((this.speed - speedChange) == 0) {
            this.speed = 0;
            System.out.println("속도가 0이 되었습니다. 운행을 정지합니다");
            changeState(0);
            System.out.println("현재 상태 : " + driveState);
        }
        else {
            this.speed += speedChange;
            System.out.println("현재 속도 : " + this.speed);
        }
    }

    public void changeState(int State) {
        switch (State) {
            case -1:
                driveState = "운행불가";
            case 0:
                driveState = "일반";
            case 1:
                driveState = "운행중";
            case 2:
                driveState = "차고지행";
        }
        System.out.println(driveState);
    }

    public void ridePassenger(int persons) throws 최대_승객_수_초과 {
        try {
            if ((passenger + persons) > maxPassenger) {
                throw new 최대_승객_수_초과();
            } else if ((passenger + persons) <= maxPassenger) {
                passenger += persons;
                remainPassenger = maxPassenger - passenger;
            } else if ((passenger +persons <= 0)) {
                passenger = 0;
                remainPassenger = maxPassenger;
            }
        } catch (최대_승객_수_초과 e) {
            System.out.println(e.getMessage());
        }
    }

    public int usingFuel (int value) {

            try {
                if (fuelVolume - value < 0) {
                    fuelVolume = 0;
                    throw new 주유필요();
                }
                else {
                    fuelVolume -= value;
                    if (fuelVolume > 0 && fuelVolume <= 5)
                        System.out.println("주유 필요");
                }
            } catch (주유필요 e) {
                System.out.println(e.getMessage());
            }

        return fuelVolume;
    }

    public int chargingFuel (int value) {
        if (fuelVolume + value > 100)
            fuelVolume = 100;
        else fuelVolume += value;

        return fuelVolume;
    }

    public void FuelStateShow() {

        String temp = "주유량=" + fuelVolume + "\n" +
                "상태=" + driveState + "\n"
                ;

        if (fuelVolume > 0 && fuelVolume <= 5)
            temp = "주유 필요" + "\n" + "주유량=" + fuelVolume + "\n" +
                    "상태=" + driveState + "\n"
                    ;

        System.out.println(temp);
    }

    public int getCurrentPay() {
        return currentPay;
    }

    public String getNumber() {
        return number;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSpeedChange() {
        return speedChange;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public int getPassenger() {
        return passenger;
    }

    public String getDriveState() {
        return driveState;
    }

    public int getBasicCharge() {
        return basicCharge;
    }

    public int getRemainPassenger() {
        return remainPassenger;
    }

    public void setCurrentPay(int currentPay) {
        this.currentPay = currentPay;
    }

    public void setBasicCharge(int basicCharge) {
        this.basicCharge = basicCharge;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public void setDriveState(String driveState) {
        this.driveState = driveState;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSpeedChange(int speedChange) {
        this.speedChange = speedChange;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public void setRemainPassenger(int remainPassenger) {
        this.remainPassenger = remainPassenger;
    }
}


//    1 요소
//    - 번호
//    - 주유량
//    - 속도
//    - 속도 변경
//    - 최대 승객 수
//    - **있을 경우** {기타 공통 요소들}

//    2 기본값
//    - 주유량 = 100
//    - 속도 = 0

//    3 기능
//    - 운행 시작
//    - 속도 변경
//    - 상태 변경
//    - 승객 탑승
//    - **있을 경우** {기타 공통 기능들}