package ph.technical.exam.basic.exam;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class StringSortExamTest {

    private static String inputString = "geeksforgeeks";
    private static String EXPECTED_RESULTS = "eeeefggkkorss";

    @Test
    public void reverseOrderExpectedResultIsReverse() {
        StringSortExam exam = new StringSortExam();
        String output = exam.reverseOrder(inputString);
        assertThat(output).isEqualTo(EXPECTED_RESULTS);
    }
}
