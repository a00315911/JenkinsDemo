package basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExtraFeaturesTest {

    @Test
    void testFeatureOne() {
        ExtraFeatures features = new ExtraFeatures();
        Assertions.assertEquals("FeatureOne: Test", features.featureOne("Test"));
    }

    @Test
    public void test(){
        ExtraFeatures features = new ExtraFeatures();
        Assertions.assertEquals("FeatureTwo: Test", features.featureTwo("Test"));
    }

    @Test
    public void testThree(){
        ExtraFeatures features = new ExtraFeatures();
        Assertions.assertEquals("FeatureThree: Test", features.featureThree("Test"));
    }
}
