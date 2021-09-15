package com.horiaconstantin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AppTest {

    private App app;

    @Test
    void testMethodWithoutException() {
        app = new App();

        assertTrue(app.wrapper(false));
    }

    @Test
    void testMethodThrowingException() {
        app = new App();
        assertThrows(RuntimeException.class, () -> app.wrapper(true));
    }

}
