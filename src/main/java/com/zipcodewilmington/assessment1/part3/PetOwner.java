package com.zipcodewilmington.assessment1.part3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    private String name = "";
    private Pet[] pets;

    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.pets = pets;
        if (pets != null) {
            for (Pet pet : pets) {
                pet.setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        ArrayList<Pet> petsList;
        if (this.pets != null) {
            petsList = new ArrayList<>(Arrays.asList(this.pets));
        } else {
            petsList = new ArrayList<>();
        }
        petsList.add(pet);
        pet.setOwner(this);
        this.pets = petsList.toArray(new Pet[petsList.size()]);

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for (int i = 0; i < this.pets.length; i++) {
            if (this.pets[i].equals(pet)) {
                this.pets[i] = null;
            }
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for (Pet eachPet : this.pets) {
            if (eachPet.equals(pet)) {
                return true;
            }

        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int age = this.pets[0].getAge();
        for (int i = 1; i < this.pets.length; i++) {
            if (this.pets[i].getAge() < age) {
                age = this.pets[i].getAge();

            }
        }
        return age;
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int age = this.pets[0].getAge();
        for (int i = 1; i < this.pets.length; i++) {
            if (this.pets[i].getAge() > age) {
                age = this.pets[i].getAge();

            }
        }
        return age;

    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int sumOfAge = 0;
        for (Pet pet : this.pets) {
            sumOfAge += pet.getAge();
        }

        return (float) sumOfAge / this.pets.length;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {

        return this.pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }
}
