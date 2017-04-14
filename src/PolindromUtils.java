/**
 * Created by dzmitry.karayedau on 14-Apr-17.
 */
public class PolindromUtils {

    public static boolean checkOnPolindrom(long number) {
        StringBuilder stringNumber = new StringBuilder();
        StringBuilder invertStringNumber = new StringBuilder();
        stringNumber.append(number);
        invertStringNumber.append(number);
        invertStringNumber.reverse();
        return stringNumber.toString().equals(invertStringNumber.toString());
    }

}
