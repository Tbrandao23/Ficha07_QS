import Ex3.Mark;
import Ex3.UC;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex3Test {

    private static UC uc1;


    @BeforeAll
    public static void setup(){
        uc1 = new UC("QS",10);


        uc1.insertMarkCU(1,12.0);
        uc1.insertMarkCU(2,9);
        uc1.insertMarkCU(3,18.0);

    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void equalMark(int number){
        double expected = uc1.searchStudent(number);
        double actual = uc1.searchStudent(number);
        assertEquals(expected,actual,"Nota errada");
    }

    @Test
    void testAverageUC(){
        double expected = 13;
        double actual = uc1.averageCU();
        assertEquals(expected,actual,"Calculo mal feito");
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void approvedTest(int num){
        assertTrue(uc1.isApproved(num));
    }

}
