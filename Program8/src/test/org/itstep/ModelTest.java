package test.org.itstep;

import main.org.itstep.Model;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {
    @Test
    public void inputWordByScanerWord1() {
        Model model = new Model();
        String runTest = model.inputWordByScanerWord1("Anastasiia");
        assertEquals("Anastasiia", runTest);
    }

    @Test
    public void inputWordByScanerWord1v2(){
        Model model = new Model();
        String runTest = model.inputWordByScanerWord1("Katya");
        assertNull(runTest);
    }

    @Test
    public void inputWordByScanerWord2(){
        Model model = new Model();
        String runTest = model.inputWordByScanerWord2("Lunova");
        assertEquals("Lunova", runTest);
    }

    @Test
    public void inputWordByScanerWord2v2(){
        Model model = new Model();
        String runTest = model.inputWordByScanerWord2("Ivanova");
        assertNull(runTest);
    }

    @Test
    public void inputWordByScanerNumber(){
        Model model = new Model();
        int runTest = model.inputWordByScanerNumber(8);
        assertEquals(8,runTest);
    }

    @Test
    public void inputWordByScanerNumberV2(){
        Model model = new Model();
        int runTest = model.inputWordByScanerNumber(10);
        assertEquals(0, runTest);
    }

    @Test
    public void writeSentence(){
        Model model = new Model();
        String runTest = model.writeSentence("Anastasiia", "Lunova", 8);
        assertEquals("Anastasiia " + " Lunova " +8,runTest);
    }
}




