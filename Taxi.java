public class Taxi extends PublicTransport {

    private String goal;
    private int goalDistance;
    private int basicDistance = 1;
    private int payToDistance = 1000;

    public Taxi() {
        super.setDriveState("일반");
        super.setMaxPassenger(4);
        super.setBasicCharge(3000);
        super.setSpeed(0);
    }

    public void showTaxi() {
        System.out.println("번호 = " + getNumber() + "\n" + "주유량 = " + getFuelVolume() + "\n" + "상태 = " + getDriveState());
    }

    public void showTaxiDetail() {
        String temp = "";
        temp = "탑승 승객 수 = " + getPassenger() + "\n" +
                "잔여 승객 수 = " + getRemainPassenger() + "\n" +
                "기본 요금 확인 = " + getBasicCharge() + "\n" +
                "목적지=" + goal + "\n" +
                "목적지까지 거리=" + goalDistance + "km" + "\n" +
                "기본 거리=" + basicDistance + "\n" +
                "거리당 요금=" + payToDistance + "\n" +
                "지불할 요금=" + getCurrentPay() + "\n" +
                "상태=" + getDriveState() + "\n";

        System.out.println(temp);
    }
    
    public void orderToTaxi(int passenger, String goal, int goalDistance) throws 최대_승객_수_초과 {
        ridePassenger(passenger);
        this.goal = goal;
        this.goalDistance = goalDistance;
        super.setCurrentPay(super.getBasicCharge() + (payToDistance * (goalDistance - 1)));
        changeState(1);

        System.out.println("승객 수, 목적지, 목적지 까지의 거리 입력이 완료되었습니다");
    }

    public void AddPayPerDistance(int distance) {
        super.setCurrentPay(getBasicCharge() * distance);
        System.out.println("지불할 요금 = " + getCurrentPay());
    }

    public void doPayment() {
        setCurrentPay(0);
        System.out.println("요금 결제를 완료하셨습니다");
    }


    public String getGoal() {
        return goal;
    }

    public int getGoalDistance() {
        return goalDistance;
    }

    public int getBasicDistance() {
        return basicDistance;
    }

    public int getPayToDistance() {
        return payToDistance;
    }

    public int getCurrentPay() {
        return super.getCurrentPay();
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public void setGoalDistance(int goalDistance) {
        this.goalDistance = goalDistance;
    }

    public void setBasicDistance(int basicDistance) {
        this.basicDistance = basicDistance;
    }

    public void setPayToDistance(int payToDistance) {
        this.payToDistance = payToDistance;
    }

    public void setCurrentPay(int currentPay) {
        super.setCurrentPay(currentPay);
    }

    @Override
    public String toString() {
        return "택시{" +
                "번호='" + super.getNumber() + '\'' + "\n" +
                "주유량=" + super.getFuelVolume() + "\n" +
                "속도=" + super.getSpeed() + "\n" +
                "속도 변경=" + super.getSpeedChange() + "\n" +
                "최대 승객 수=" + super.getMaxPassenger() + "\n" +
                "탑승 승객 수=" + super.getPassenger() + "\n" +
                "잔여 승객 수=" + super.getRemainPassenger() + "\n" +
                "상태=" + super.getDriveState() + "\n" +
                "기본 요금=" + super.getBasicCharge() + "\n" +
                "목적지=" + goal + "\n" +
                "목적지까지 거리=" + goalDistance + "km" + "\n" +
                "기본 거리=" + basicDistance + "\n" +
                "거리당 요금=" + payToDistance + "\n" +
                "지불할 요금=" + getCurrentPay() + "\n";
    }



}

//    private String goal;
//    private int goalDistance;
//    private int basicDistance = 1;
//    private int payToDistance = 1000;
//    private int currentPay;


//### 택시
//
//- 요소
//    - 목적지
//    - 목적지까지 거리
//    - 기본 거리
//    - 기본 요금
//    - 거리당 요금
//    - **있을 경우** {기타 택시 요소들}
//- 기능
//    - 거리당 요금 추가
//    - 요금 결제
//    - **있을 경우** {기타 택시 기능들}
//- 기본값
//    - 최대 승객 수 = 4
//    - 기본 요금 = 3000
//    - 거리당 요금 = 1000
//    - 기본 거리 = 1
//    - 주유량 = 100
//    - 상태 = 일반
//    - 속도 = 0