package com.github.hellomvn;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/**
 * JUnit5 tests
 */
public class UnitTest {
    @BeforeEach
    void init() {
        System.out.println("UnitTest init");
    }


    @AfterEach
    void tearDown() {
        System.out.println("UnitTest tearDown");
    }

    
    @Test
    @DisplayName("TestCaseName")
    void yourTestCase() throws Exception {
    }
}
