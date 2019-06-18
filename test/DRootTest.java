import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DRootTest {

    @Test
    public void digital_root() {
        Assert.assertEquals("Nope!", 1, DRoot.digital_root(1234));
        Assert.assertEquals("Nope!", 6, DRoot.digital_root(132189));
        Assert.assertEquals("Nope!", 1, DRoot.digital_root(1));
        Assert.assertEquals("Nope!", 0, DRoot.digital_root(0));
    }
}