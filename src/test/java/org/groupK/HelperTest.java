package org.groupK;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelperTest{
    @Test
    public void isValidYesOrNoTest() {
        String testString = "test";
        assertFalse(TicTacToe.isValidYesOrNo(testString));

    }
}