package api.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;

class BeforeAlltest {

    @BeforeAll
    static void initAll() {
        System.out.println("---Inside initAll---");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("---Inside tearDownAll---");
    }
}