package example.test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {


    public static void main(String[] args) {
       Stream<Employee> employeeStream =  Stream.of(Employee.builder().id(1).name("Ravi Sharma").age(30).build(),
                Employee.builder().id(2).name("Honey").age(30).build(),
                Employee.builder().id(3).name("Ravinder Sharma").age(38).build(),
                Employee.builder().id(4).name("Teja Kumar").age(36).build(),
                Employee.builder().id(5).name("Papu Sharma").age(30).build());
        employeeStream.collect(Collectors.groupingBy(employee -> employee.getAge(), Collectors.toList())).entrySet().forEach(entrySet -> System.out.println(entrySet.getKey()+" --> "+entrySet.getValue()));

    }


}
