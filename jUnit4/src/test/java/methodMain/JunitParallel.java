package methodMain;

import org.junit.*;

import cucumber.api.cli.Main;

public class JunitParallel {

    @BeforeClass
    public static void beforeClassFunction(){
        System.out.println("Before Class");
    }

    @Before
    public void beforeFunction(){
        System.out.println("Before Function");
    }

    @After
    public void afterFunction(){
        System.out.println("After Function");
    }

    @AfterClass
    public static void afterClassFunction(){
        System.out.println("After Class");
    }

    /**
     * ToDo: Ejecución vía Maven
     */
    @Test
    public void test() {
        Main.main(new String[]{"--threads", "2","-p","pretty","-g", "stepdef", "src/test/resources/features/"});
    }
}
