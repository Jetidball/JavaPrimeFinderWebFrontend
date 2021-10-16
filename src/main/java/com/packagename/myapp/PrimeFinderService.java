package com.packagename.myapp;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class PrimeFinderService implements Serializable {
    
    public String inputPrimeNum(String inputNum) {
        try{
            int x = Integer.parseInt(inputNum);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
            return "Not a Number";

        }

        int num = Integer.parseInt(inputNum);
        num = num+1;
        boolean[] bool = new boolean[num];
        int primeList[] = new int[num];
        StringBuilder prime1 = new StringBuilder("Your Primes are: ");

        if (inputNum.equals("1") || inputNum.matches("^[-a-zA-Z._]+") || inputNum.equals("0") || primeList.equals(null)) {
            return "No Number";
        }

        else {
            for (int i = 2; i< bool.length; i++) {
                bool[i] = true;
            }
            for (int i = 2; i< Math.sqrt(num); i++) {
                if(bool[i]) {
                    for(int j = (i*i); j<(bool.length); j = j+i) {
                        bool[j] = false;
                    }
                }

            }

            for (int i = 0; num > i; i++) {
                if(bool[i]) {
                    prime1.append(i).append(", ");
                }
            }

        }
        return prime1.toString();
    }

}
