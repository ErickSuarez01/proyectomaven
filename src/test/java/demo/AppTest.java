package demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void mostrarDebug(){
    	log debug= new log();
    	debug.debug();
    	assertTrue(true);
    }
    @Test
    public void mostrarInfo(){
    	log debug= new log();
    	debug.info();
    	assertTrue(true);
    }
    @Test
    public void mostrarWrning(){
    	log debug= new log();
    	debug.warning();
    	assertTrue(true);
    }
}
