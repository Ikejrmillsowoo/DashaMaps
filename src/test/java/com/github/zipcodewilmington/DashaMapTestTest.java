package com.github.zipcodewilmington;

import com.github.zipcodewilmington.sample.Person;
import com.github.zipcodewilmington.sample.PersonInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
class DashaMapTestTest {
    @ParameterizedTest
    @ValueSource(strings = {"Jimmy", "Jonah", "Iron", "Kelvin"})
    public void testSetFirstName(String firstName) {
        // given
        String expected = firstName;
        Person person = new Person();
        PersonInterface personInterface = (PersonInterface)person;
        personInterface.setFirstName(expected);

        // when
        String actual = personInterface.getFirstName();

        // then
        Assertions.assertEquals(expected, actual);
    }


}