/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package rules;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit tests for RulesOf6005.
 */
public class RulesOf6005Test {
    
    /**
     * Tests the mayUseCodeInAssignment method.
     */
    @Test
    public void testMayUseCodeInAssignment() {
        // Test 1: Code is publicly available but not cited
        assertFalse("Should be false: code is public but not cited",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
        
        // Test 2: Code is written by yourself and required for coursework
        assertTrue("Should be true: code written by yourself and required",
                RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
        
        // Test 3: Code is coursework but not cited
        assertFalse("Should be false: it's coursework and not cited",
                RulesOf6005.mayUseCodeInAssignment(false, true, true, false, false));
        
        // Test 4: Code is not public and not written by yourself
        assertFalse("Should be false: code is not public and not self-written",
                RulesOf6005.mayUseCodeInAssignment(false, false, false, true, false));
        
        // Test 5: Code is written by yourself but not required
        assertTrue("Should be true: code written by yourself even if not required",
                RulesOf6005.mayUseCodeInAssignment(true, false, false, false, false));
    }

}