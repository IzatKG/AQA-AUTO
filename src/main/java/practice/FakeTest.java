package practice;

import com.github.javafaker.Faker;

public class FakeTest {

    public static void main(String[] args) {

        Faker faker = new Faker();

        String name = faker.name().firstName();
        String lastname = faker.name().lastName();
        String address = faker.address().streetAddress();
        String phone = faker.phoneNumber().phoneNumber();
        String email = faker.internet().emailAddress();
        String dateOfBirth = faker.date().birthday().toString();
        String nameofGroup = faker.company().name();

        String text = faker.lorem().sentence();



        System.out.println("FIRSNAME is: " + name + " LASTNAME is :" + lastname);
        System.out.println("ADDRESS: " + address);
        System.out.println("MOBILE: " + phone);
        System.out.println("EMAIL : " + email);
        System.out.println("DATEOFBIRTH : " + dateOfBirth);
        System.out.println("NAMEOFCROUP : " + nameofGroup);
        System.out.println("TEXT : " + text);
    }
}
