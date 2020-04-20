package labs.jenkins.springboot.sample.sample;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * @author Alain Lompo on 20.04.2020
 * @project boot-sample
 **/
public class AssertJValidationTest {

    @Test
    public void should_Use_AssertThat() {
        int x = 100;

        assertThat(x).isGreaterThan(50);
    }
}
