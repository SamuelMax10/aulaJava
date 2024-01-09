import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        //Acrecentar ou subtrair um tempo em Data-hora.

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate semanaAnteriorLocalDate = d01.minusDays(7);
        LocalDate proximaSemanaLocalDate = d01.plusDays(7);

        System.out.println("semanaAnteriorLocalDate = " + semanaAnteriorLocalDate);
        System.out.println("proximaSemanaLocalDate = " + proximaSemanaLocalDate);

        LocalDateTime semanaAnteriorLocalDateTime = d02.minusDays(7);
        LocalDateTime proximaSemanaLocalDateTime = d02.plusDays(7);

        System.out.println("semanaAnteriorLocalDateTime = " + semanaAnteriorLocalDateTime);
        System.out.println("proximaSemanaLocalDateTime = " + proximaSemanaLocalDateTime);

        Instant semanaAnteriorInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant proximaSemanaInstant = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("semanaAnteriorInstant = " + semanaAnteriorInstant);
        System.out.println("proximaSemanaInstant = " + proximaSemanaInstant);

        //Calcular duração de Data-hora.

        Duration t1 = Duration.between(semanaAnteriorLocalDate.atStartOfDay(),d01.atStartOfDay());
        Duration t2 = Duration.between(semanaAnteriorLocalDateTime,d02);
        Duration t3 = Duration.between(semanaAnteriorInstant,d03);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
    }
}