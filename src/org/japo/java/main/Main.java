/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Definir Variables
        double baseTriang;
        double altTriang;
        double areaTriang;

        //Pedir base del triángulo  
        System.out.print("Base triángulo ....: ");
        baseTriang = SCN.nextDouble();

        //Pedir altura del triángulo     
        System.out.print("Altura triángulo ..: ");
        altTriang = SCN.nextDouble();

        //Cálculo del área
        areaTriang = baseTriang * altTriang / 2;

        //RESPUESTA
        System.out.printf(Locale.ENGLISH, "Área triángulo ....: %.2f%n", areaTriang);

    }//main

}//class
