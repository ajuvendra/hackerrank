package org.home.string;
import java.io.*;
import java.util.*;

public class Solution {

	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        int size = (s.length() + 1) - k; 
        String arr[] = new String[size];
        for(int i = 0; i < size; i++) {
        	arr[i] = s.substring(i, i + k);
        	if(smallest.length() < k || smallest.compareTo(arr[i]) > 0) {
        		smallest = arr[i];
        	}
        	if(largest.length() < k || largest.compareTo(arr[i]) < 0) {
        		largest = arr[i];
        	}
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
    	System.out.println(getSmallestAndLargest("ZASKFDLklhfsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH", 1));
        
    }
}
