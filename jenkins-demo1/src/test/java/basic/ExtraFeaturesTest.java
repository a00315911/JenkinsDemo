package basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtraFeaturesTest {

    @Test
    public void testFeatureOne() {
        ExtraFeatures features = new ExtraFeatures();
        Assertions.assertEquals("FeatureOne: Test", features.featureOne("Test"));
    }

}
