package task_4;

public class Phone {
    private String country_code;
    private String num3_1;
    private String num3_2;
    private String num4;

    public Phone(String phone) {
        if (phone.charAt(0) == '+') {
            country_code = String.valueOf(phone.charAt(1));
            num3_1 = phone.substring(2, 5);
            num3_2 = phone.substring(5, 8);
            num4 = phone.substring(8, 12);
            return;
        }
        country_code = "7";
        num3_1 = phone.substring(1, 4);
        num3_2 = phone.substring(4, 7);
        num4 = phone.substring(7, 11);
    }

    @Override
    public String toString() {
        return String.format(
                "+%s(%s)-%s-%s",
                country_code, num3_1, num3_2, num4);
    }
}
