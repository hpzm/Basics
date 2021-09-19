/**
 * @author 夏雨
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        System.out.println("水仙花数为：");
        for (int i = 100; i <= 999; i++) {
            int unitsDigit = i % 10;
            int tensDigit = i / 10 % 10;
            int hundredsDigit = i / 10 / 10 % 10;
            if(unitsDigit*unitsDigit*unitsDigit
                    +tensDigit*tensDigit*tensDigit
                    +hundredsDigit*hundredsDigit*hundredsDigit
                    ==i){
                System.out.println(i);
            }

        }
    }
}
