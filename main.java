public class main {

    public static void main(String[] args) throws 최대_승객_수_초과 {

        Bus bus1 = new Bus();
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();

//        System.out.println(bus1.toString());
////        taxi1, taxi2 고유 아이디 다른점 확인
//        System.out.println(taxi1.toString());
//        System.out.println(taxi2.toString());
//
////        버스 승객+2 명 추가
//        bus1.ridePassenger(2);
//        bus1.showPassenger();
//
////        주유량 -50 변경
//        System.out.println("현재 주유량 : " + bus1.usingFuel(50));
////        주유량 +10 변경
//        System.out.println("현재 주유량 : " + bus1.chargingFuel(10));
//
////        버스 상태 변경
//        System.out.println(bus1.getDriveState());
////        -1 운행불가, 0 일반, 1 운행중, 2 차고지행
//        bus1.changeState(2);
//
////        System.out.println(bus1.toString());
//
////        승객 수 초과
////        bus1.ridePassenger(45);
//
////        승객 +5
//        bus1.setPassenger(0);
//        bus1.ridePassenger(5);
//        bus1.showPassenger();
//
////        주유량 -55
//        System.out.println("현재 주유량 : " + bus1.usingFuel(55));
////        bus1.FuelStateShow();

        taxi1.orderTaxi(2, "서울역", 2);
        taxi1.showTaxi();
        taxi1.showTaxiDetail();

    }
}
