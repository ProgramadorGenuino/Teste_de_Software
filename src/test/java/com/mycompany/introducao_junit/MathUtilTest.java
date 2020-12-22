/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introducao_junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.mycompany.introducao_junit.MathUtil.mdc;

/**
 *
 * @author aluno
 */
public class MathUtilTest {

    @Test
    public void testMdcAParP1() {
        final int a=6;
        final int b=3;
        final int esperado=3;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    }
    @Test
    void testMdcAImparP1(){
        final int a  = 9;
        final int b = 3;
        final int esperado = 3;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcParesP2(){
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int esperado = 0;
        final int obtido = MathUtil.mdc(a, b);
        //assertEquals(esperado, obtido % divisor);
        assertTrue(obtido % divisor == 0);
    }
    
    @Test
        void testMdcAPositivoP3(){
        final int a = 15;
        final int b = 0;
        final int esperado = 15;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado , obtido);
        
    }
        
    @Test
    void testMdcANegativoP3(){
        final int a = -30;
        final int b = 0;
        final int esperado = 30;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcMParP4(){
        final int a = 9;
        final int b = 3;
        final int m = 2;
        final int esperado = MathUtil.mdc(a*m, b*m);
        final int obtido = m * MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP5(){
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = mdc(a*b, c);
        final int obtido = mdc(b,c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP5Resultado1(){
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = 1;
        final int obtido = mdc(b,c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP6(){
        final int a = 8;
        final int b = 2;
        final int esperado = mdc(a, b);
        final int obtido = mdc(b, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP7TudoNegativo(){
        final int a = -12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcP8(){
        final int a = 8;
        final int esperado = 8;
        final int obtido = mdc(a, a);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcGeralIndivisiveis(){
        final int a = 30;
        final int b = 12;
        final int esperado = 6;
        final int obtido = mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcMultiplosValores(){
        final int a = 30;
        final int b = 12;
        final int c = 4;
        final int esperado = 2;
        final int obtido = mdc(a, b, c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcNenhumParametro(){
        assertThrows(IllegalArgumentException.class, () -> mdc());
    }
    
    @Test
    void testMdcNull(){
        assertThrows(NullPointerException.class, () -> mdc(null));
    }
    
    @Test
    void testMdcP9(){
//        Calcular o máximo divisor comum é uma operação associativa: mdc(a,mdc(b,c))=mdc(mdc(a,b),c)=mdc(a,b,c)
        final int a = 20;
        final int b = 10;
        final int c = 2;
        final int esperado = mdc(a, b, c);
        assertEquals(esperado, mdc(a, mdc(b,c)));
        assertEquals(esperado, mdc(mdc(a,b),c));
    }
    
    @Test
    void testMdcP12(){
        final int a = 10;
        final int p = 7;
        final int obtido = mdc(p,a);
        assertTrue(obtido == p || obtido == 1);
    }
}
