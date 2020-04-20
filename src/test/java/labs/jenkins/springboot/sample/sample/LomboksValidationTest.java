package labs.jenkins.springboot.sample.sample;

import labs.jenkins.springboot.sample.sample.model.LomboksValidation;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Alain Lompo on 20.04.2020
 * @project boot-sample
 **/
public class LomboksValidationTest {

    @Test
    public void should_validate_Lombok() {
        LomboksValidation validator = new LomboksValidation();

        Assert.assertEquals("1.5", validator.getValidationVersion());
    }
}
