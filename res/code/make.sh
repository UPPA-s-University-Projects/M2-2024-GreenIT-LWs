#!/bin/bash

# Compile Java files
javac ArrayList2.java
javac HashMap2.java
javac LinkedHashMap2.java
javac LinkedList2.java
javac TreeMap2.java
javac WeakHashMap2.java

# Function to run a Java program
run_java_program() {
    for i in {1..5}
    do
        start_time=$(date)
        echo "Start Time: $start_time" >> file.csv

        # Create a temporary file for Powerjoular output
        tmp_file="powerjoular_temp_$i.csv"

        # Start Powerjoular monitoring (if available)
        powerjoular -f $tmp_file &
        PID=$!

        # Run the Java program
        java $1

        # Stop Powerjoular monitoring
        kill $PID

        # Append Powerjoular data to the main file and delete temporary file
        cat $tmp_file >> file.csv
        rm $tmp_file

        end_time=$(date)
        echo "End Time: $end_time" >> file.csv

        # Sleep for 10 seconds
        sleep 10
    done
}

# Run each Java program
run_java_program ArrayList2
run_java_program HashMap2
run_java_program LinkedHashMap2
run_java_program LinkedList2
run_java_program TreeMap2
run_java_program WeakHashMap2
