package ph.technical.exam.basic.exam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamApplication implements CommandLineRunner {
	private static Logger LOG = LoggerFactory.getLogger(ExamApplication.class);
	private StringManipulationExam stringManipulationExam = new StringManipulationExam();

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}


	@Override
	public void run(String... args) {
		String input = "getting good at coding needs a lot of practice";
		String output = stringManipulationExam.getReverseParagraphOutput(input);
		LOG.info(String.format("Output : %s", output));
	}
}
