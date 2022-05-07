package org.example.notice_board.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DBIdGeneratorTest {
    @Test
    void makeId() {
        assertEquals(14, String.valueOf(DBIdGenerator.makeId()).length());
    }
}