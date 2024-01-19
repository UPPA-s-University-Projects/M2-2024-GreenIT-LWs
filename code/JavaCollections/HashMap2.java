/*
 * Copyright (c) 2022, Adel Noureddine, Université de Pays et des Pays de l'Adour.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the
 * GNU General Public License v3.0 only (GPL-3.0-only)
 * which accompanies this distribution, and is available at
 * https://www.gnu.org/licenses/gpl-3.0.en.html
 *
 * Author : Adel Noureddine
 */

import java.util.*;  

public class HashMap2 {
    public static void main(String args[]) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        // Insert 100 000 000 elements
        for (int i = 0; i < 100000000; i++) {
            map.put(i,"Number is " + i);
        }
        
        // Accessing elements
        for (Map.Entry m : map.entrySet()) {
            m.getKey();
            m.getValue();
        }

        // Removing first 50 000 000 elements
        for (int i = 0; i < 50000000; i++) {
            map.remove(i);
        }

        // Accessing elements
        for (Map.Entry m : map.entrySet()) {
            m.getKey();
            m.getValue();
        }
    }
}