/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;

import junit.framework.TestCase;
import static nam.util.MathUtil.computeFactorial;
import org.junit.Test;

/**
 *
 * @author Namng
 */
public class MathUtilTest extends TestCase {

    @Test
    public void testfailedCase() {
        assertEquals(computeFactorial(-5), 1);
    }
}
