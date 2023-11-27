package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConversorTeste {
    private Conversor conversor;

    @Before
    public void start() {
      conversor = new Conversor();
    }

    @Test
    public void converterNumeroReal() {
        Assert.assertEquals("MX", conversor.converterNumeroReal(1010));
        Assert.assertEquals("X", conversor.converterNumeroReal(10));
        Assert.assertEquals("MI", conversor.converterNumeroReal(1001));
        Assert.assertEquals("DLXX", conversor.converterNumeroReal(570));
        Assert.assertEquals("DXX", conversor.converterNumeroReal(520));
        Assert.assertEquals("CCCXLIV", conversor.converterNumeroReal(344));
        Assert.assertEquals("XII", conversor.converterNumeroReal(12));
        Assert.assertEquals("DCCXLII", conversor.converterNumeroReal(742));
        Assert.assertEquals("MMMCMXCIX", conversor.converterNumeroReal(3999));
    }

    @Test
    public void converterNumeroRomano() {
        Assert.assertEquals(1010, conversor.converterNumeroRomano("MX"));
        Assert.assertEquals(10, conversor.converterNumeroRomano("X"));
        Assert.assertEquals(1001, conversor.converterNumeroRomano("MI"));
        Assert.assertEquals(570, conversor.converterNumeroRomano("DLXX"));
        Assert.assertEquals(520, conversor.converterNumeroRomano("DXX"));
        Assert.assertEquals(344, conversor.converterNumeroRomano("CCCXLIV"));
        Assert.assertEquals(12, conversor.converterNumeroRomano("XII"));
        Assert.assertEquals(742, conversor.converterNumeroRomano("DCCXLII"));
        Assert.assertEquals(3999, conversor.converterNumeroRomano("MMMCMXCIX"));
    }
}
