import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompileFailTest {

    @Test
    void testGetTrue() {
        CompileFail cf = new CompileFail();
        assertTrue(cf.getTrue());
    }
}