package ndk.to_java_utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JTextField;

public class BigDecimalUtils {

    public static BigDecimal zeroBigDecimal = new BigDecimal("0");

    public static BigDecimal getBigDecimalFromJTextField(JTextField jTextField) {

        String jTextFieldText = jTextField.getText();
        if (jTextFieldText.isEmpty()) {

            return zeroBigDecimal;

        } else {

            return new BigDecimal(jTextFieldText);
        }
    }

    public static BigDecimal getTwoPiontsRoundedBigDecimal(BigDecimal bigDecimal) {

        return bigDecimal.setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal getTwoPiontsRoundedBigDecimalFromText(String bigDecimal) {

        return getTwoPiontsRoundedBigDecimal(new BigDecimal(bigDecimal));
    }
}
