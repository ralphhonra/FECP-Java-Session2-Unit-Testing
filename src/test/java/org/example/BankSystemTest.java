package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BankSystemTest {
    private final InputStream originalIn = System.in;
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        BankSystem.bankAccounts.clear(); // Use the same list from BankSystem
        BankSystem.bankAccounts.add(new BankAccount(12345, "Test name", 0));
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testDepositAmountWithValidInteger() {
        String simulatedInput = "12345\n1000\nyes\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        BankSystem.depositAmount();

        String output = outputStream.toString();

        assertTrue(output.contains("Your balance has been updated successfully!"));
    }

    @Test
    void testDepositAmountWithInvalidInteger() {
        String simulatedInput = "12345\n-1000\n0\nyes\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        BankSystem.depositAmount();

        String output = outputStream.toString();

        assertTrue(output.contains("Error. Please input an invalid amount."));
    }
}