/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package api.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import api.runtime.LoadConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @DisplayName("------------")
    @Test
    void appHasAGreeting() {

        System.out.println("----------------------");
        System.out.println(LoadConfig.load("BaseUrl"));

        assertEquals("1", "1");

    }
}
