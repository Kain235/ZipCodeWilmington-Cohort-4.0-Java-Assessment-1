package com.zipcodewilmington.assessment1.part2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;
        for (Object object : objectArray) {
            if (object.equals(objectToCount)) {
                count++;
            }

        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove){
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i].equals(objectToRemove)) {
                for (int j = i + 1; j <objectArray.length; j++) {
                    int duplicateI = i;
                    objectArray[duplicateI] = objectArray[j];
                    duplicateI++;

                }
                objectArray = Arrays.copyOf(objectArray, objectArray.length - 1);
                i--;
            }
        }

        return objectArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object mostCommon = null;
        int mostCommonCount = 0;
        for (Object object: objectArray) {
            int count = 0;
            for (Object object2: objectArray) {
                if (object.equals(object2)) {
                    count++;

                }

            }
            if (count > mostCommonCount) {
                mostCommon = object;
                mostCommonCount = count;
            }

        }
        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object leastCommon = null;
        int leastCommonCount = 100;
        for (Object object: objectArray) {
            int count = 0;
            for (Object object2: objectArray) {
                if (object.equals(object2)) {
                    count++;

                    }

                }
            if (count < leastCommonCount) {
                leastCommon = object;
                leastCommonCount = count;

            }

        }
        return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        int originalLength = objectArray.length;
        Object[] newArray = Arrays.copyOf(objectArray, objectArray.length + objectArrayToAdd.length);
        int count = 0;
        for (int i = originalLength; i < newArray.length; i++) {
            newArray[i] = objectArrayToAdd[count];
            count++;
        }
        return newArray;
    }
}
