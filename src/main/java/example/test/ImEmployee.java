package example.test;

import java.time.LocalDate;
import java.util.Date;

public class ImEmployee {

    private final String name;
    private final Integer id;
    private final Date dob;

    public ImEmployee(String name, Integer id, Date dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }

    public ImEmployee() {
        this(null, null, null);
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Date getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "ImEmployee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dob=" + dob +
                '}';
    }
}
