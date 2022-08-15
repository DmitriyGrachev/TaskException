package One;
//- Создайте до 10 исключительных ситуаций и обработайте их.
public class TenSituations {
    public static void main(String[] args) {
        try{
            ClockClass clock1 = new ClockClass(1,2,3);
            System.out.println(clock1);
            clock1.addSecond(14400);
            System.out.println(clock1);
            clock1.addMinute(14);
            System.out.println(clock1);
            clock1.addHour(45);
            System.out.println(clock1);
            clock1.addMinute(-11);
            System.out.println(clock1);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
