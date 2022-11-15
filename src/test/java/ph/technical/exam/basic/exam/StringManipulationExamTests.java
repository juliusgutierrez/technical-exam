package ph.technical.exam.basic.exam;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class StringManipulationExamTests {

    private static String INPUT;
    private static String EXPECTED_OUTPUT;

    @BeforeAll
    public static void setUp() {
        INPUT = "getting good at coding needs a lot of practice";
        EXPECTED_OUTPUT = "practice of lot a needs coding at good getting";
    }

    @Test
    public void getReverseParagraphOutputNotNull() {
        StringManipulationExam stringManipulationExam = new StringManipulationExam();
        String results = stringManipulationExam.getReverseParagraphOutput(INPUT);
        assertThat(results).isNotBlank();

    }

    @Test
    public void getReverseParagraphOutputSuccess() {
        StringManipulationExam stringManipulationExam = new StringManipulationExam();
        String results = stringManipulationExam.getReverseParagraphOutput(INPUT);
        assertThat(results).isEqualTo(EXPECTED_OUTPUT);

    }


}
