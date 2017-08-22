package configuration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = hello.Application.class)
public class TestConfiguration {
    @Value("${baseURL}")
    private String baseURL;

    @Autowired
    private Environment environment;

    @Test
    public void assertBaseURL() {
        final String[] profiles = this.environment.getActiveProfiles();
        if (Arrays.stream(profiles).anyMatch(p -> p.equalsIgnoreCase("development"))) {
            assertEquals("http://development", this.baseURL);
        } else {
            assertEquals("http://production", this.baseURL);
        }

    }
}
