import java.time.*;

public class Day {
    public static void main(String[] args) {
        ZonedDateTime airplane = ZonedDateTime.now();
        System.out.println(airplane);
        LocalDateTime busplan = LocalDateTime.now();
        System.out.println(busplan);
        LocalDateTime notdienst = LocalDateTime.now();
        System.out.println(notdienst);
        LocalDate ostern = LocalDate.now();
        System.out.println(ostern);
        LocalTime ticket = LocalTime.now();
        System.out.println(ticket);
        LocalDate unterschrift = LocalDate.now();
        System.out.println(unterschrift);
        LocalTime weihnachten = LocalTime.now();
        System.out.println(weihnachten);
        ZonedDateTime videocall = ZonedDateTime.now();
        System.out.println(videocall);

        Animal cat = new Animal("cat", LocalDate.of(2003,10,8));
        System.out.println(calculateAge(cat));

    }
    public static int calculateAge(Animal animal){

        return Period.between(animal.birthdayAnimal(),LocalDate.now()).getYears();
    }


}
