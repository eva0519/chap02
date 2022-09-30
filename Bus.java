public class Bus extends PublicTransport{

    public Bus() {
        super.setDriveState("운행");
        super.setMaxPassenger(30);
        super.setBasicCharge(1000);
    }

    @Override
    public String toString() {
        return "버스{" +
                "번호='" + super.getNumber() + '\'' + "\n" +
                "주유량=" + super.getFuelVolume() + "\n" +
                "속도=" + super.getSpeed() + "\n" +
                "속도 변경=" + super.getSpeedChange() + "\n" +
                "최대 승객 수=" + super.getMaxPassenger() + "\n" +
                "탑승 승객 수=" + super.getPassenger() + "\n" +
                "잔여 승객 수=" + super.getRemainPassenger() + "\n" +
                "상태=" + super.getDriveState() + "\n" +
                "기본 요금=" + super.getBasicCharge() + "\n" +
                "현재 요금=" + super.getCurrentPay() + "\n";
    }

    @Override
    public void ridePassenger(int persons) throws 최대_승객_수_초과 {
        super.ridePassenger(persons);
        super.setCurrentPay(getBasicCharge() * getPassenger());
    }

    public void showPassenger() {
        String temp = "";
        temp = "탑승 승객 수 = " + getPassenger() + "\n" +
                "잔여 승객 수 = " + getRemainPassenger() + "\n" +
                "요금 = " + getCurrentPay();
        System.out.println(temp);
    }

}

//1. 탑승 승객 수 = 2
//2. 잔여 승객 수 = 28
//3. 요금 확인 = 2000

//### 버스
//
//- 요소
//    - 현재 승객 수
//    - **있을 경우** {기타 버스 요소들}
//- 기능
//    - **있을 경우** {기타 버스 기능들}
//- 기본값
//    - 최대 승객 수 = 30
//    - 상태 = 운행
//    - 요금 = 1000