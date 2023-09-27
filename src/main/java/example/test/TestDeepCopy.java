package example.test;

import java.time.LocalDate;
import java.util.Date;

public class TestDeepCopy {

    public static void main(String[] args) throws InterruptedException {
        LocalDate dob = LocalDate.of(1991, 9, 7);
        Date date = new Date(System.currentTimeMillis());
        ImEmployee em1 = new ImEmployee("Ravi", 1, date);
        System.out.println("Before dob change -- " + em1.toString());
        Thread.sleep(500);
        date = new Date(System.currentTimeMillis());

        System.out.println("After dob change -- " + em1.toString());

    }
}
