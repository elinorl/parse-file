package com.el;

import org.junit.Assert;
import org.junit.Test;

public class ParseFileTest {

    @Test
    public void delimiterTab() {
        String testFile = "test.tab";
		String expected = "\\\\t";
		ParseFile parseFile = new ParseFile();
		String result = parseFile.extToDelimiter(testFile);
		Assert.assertEquals(expected, result);
    }
	
	@Test
    public void delimiterCsv() {
        String testFile = "test.csv";
		String expected = "";
		ParseFile parseFile = new ParseFile();
		String result = parseFile.extToDelimiter(testFile);
		Assert.assertEquals(expected, result);
    }

	@Test
    public void delimiterNone() {
        String testFile = "test";
		String expected = "";
		ParseFile parseFile = new ParseFile();
		String result = parseFile.extToDelimiter(testFile);
		Assert.assertEquals(expected, result);
    }

	@Test
    public void lineNoTab() {
        String line = "notabs";
		String delim = "\t";
		String expected = "[notabs]";
		ParseFile parseFile = new ParseFile();
		String result = (parseFile.lineToList(line, delim)).toString();
		Assert.assertEquals(expected, result);
    }
	
	@Test
    public void lineSomeTab() {
        String line = "line\twith\ttab";
		String delim = "\t";
		String expected = "[line, with, tab]";
		ParseFile parseFile = new ParseFile();
		String result = (parseFile.lineToList(line, delim)).toString();
		Assert.assertEquals(expected, result);
    }
	
	@Test
    public void lineSpace() {
        String line = " ";
		String delim = "\t";
		String expected = "[ ]";
		ParseFile parseFile = new ParseFile();
		String result = (parseFile.lineToList(line, delim)).toString();
		Assert.assertEquals(expected, result);
    }
	
}