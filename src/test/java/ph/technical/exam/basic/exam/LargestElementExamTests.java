package ph.technical.exam.basic.exam;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class LargestElementExamTests {

    private static Integer EXPECTED_RESULTS = 51;
    private static List listOfInt = new ArrayList<>(Arrays.asList(7,51,13,1,19));

    @Test
    public void getHighestNumberExpectedTheHighestNumberResult() {
        LargestElementExam largestElementExam = new LargestElementExam();
        Integer output = largestElementExam.getHighestNumber(listOfInt);
        assertThat(output).isEqualTo(EXPECTED_RESULTS);
    }
}
