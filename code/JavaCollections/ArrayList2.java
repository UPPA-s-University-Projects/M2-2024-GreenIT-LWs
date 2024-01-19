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

public class ArrayList2 {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();

        // Insert 100 000 000 elements
        for (int i = 0; i < 100000000; i++) {
            list.add("Number is " + i);
        }
        
        // Accessing elements
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            itr.next();
        }

        // Removing first 50 000 000 elements
        for (int i = 0; i < 50000000; i++) {
            list.remove(i);
        }

        // Accessing elements
        Iterator itr2 = list.iterator();
        while (itr2.hasNext()) {
            itr2.next();
        }
    }
}