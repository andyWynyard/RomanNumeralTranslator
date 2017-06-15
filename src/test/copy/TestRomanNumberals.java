package test.copy;

public class TestRomanNumberals {
    TestRomanNumberals tr; 


    @Before
    public void setUp() throws Exception {
        tr = new TestRomanNumberals();
    }

    @After
    public void tearDown() throws Exception {
        tr = null;
    }

    @Test
    public void test_romnan_numerals_translator() {
        int v = 1;
        //String x = "sdf";
        assertEquals("MMDCXLII", tr.translate(2642));
        assertEquals("MMDCXLII", tr.translate(2642));
        assertEquals("MMDCXLII", tr.translate(2642));
        assertEquals("MMDCXLII", tr.translate(2642));
    }

}