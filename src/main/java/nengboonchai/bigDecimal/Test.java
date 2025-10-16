package nengboonchai.bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        BigDecimal money = new BigDecimal(34.3044);
        money.doubleValue();
        System.out.println(money);
        BigDecimal scale1 = money.setScale(0, RoundingMode.CEILING);
        System.out.println(scale1);

        BigDecimal scale2 = money.setScale(2, RoundingMode.CEILING);
        System.out.println(scale2);

        BigDecimal scaleUp = money.setScale(3, RoundingMode.FLOOR);
        System.out.println(scaleUp);
    }
}
