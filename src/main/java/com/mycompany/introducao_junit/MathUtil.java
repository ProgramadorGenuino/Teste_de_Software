/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introducao_junit;

import java.util.Objects;

/**
 *
 * @author aluno
 */
public class MathUtil {

    public static int mdc(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        
        //Propriedade 6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;
        
        //Propiedade 1
        if (b > 0 && a % b == 0) {
            return b;
        }
        
        //Propriedade 3
        if(b == 0){
            return Math.abs(a);
        }
        
        
        
        return mdc(a-b, b);
    }
    
    public static int mdc(int ...valores){
        Objects.requireNonNull(valores, "O parâmetro valores não pode ser nulo para calcular o MDC");
        
        if(valores.length == 0){
            throw new IllegalArgumentException("É necessário indicar pelo menos um número para calculor o MDC");
        }
        
        int a = valores[0];
        for (int b : valores) {
            a = mdc(a, b);
        }
        return a;
    }
}
