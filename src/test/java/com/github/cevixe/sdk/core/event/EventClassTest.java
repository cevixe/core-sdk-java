package com.github.cevixe.sdk.core.event;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static jdk.dynalink.linker.support.Guards.isNull;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

@DisplayName("Test the event class enum")
class EventClassTest {

    @ParameterizedTest
    @MethodSource("generateEventClass")
    @DisplayName("Test event class enum toShortName")
    void eventClassToShortNameTest(EventClass eventClass) {
        List<String> shortNameList = List.of("B", "C", "D", "S");
        Assertions.assertTrue(shortNameList.contains(eventClass.getShorName()));
    }

    @ParameterizedTest
    @MethodSource("generateCorrectShortNames")
    @DisplayName("Test event class enum of method when short name is correct")
    void eventClassOfTest(String shortName) {
        assertThat(EventClass.of(shortName), notNullValue());
    }

    @ParameterizedTest
    @MethodSource("generateEquivalenceArgument")
    @DisplayName("Test in the short name and event class enum convertion are equivalent")
    void eventClassShortNameEquivalence(EventClass eventClass, String shortName) {
        assertThat(EventClass.of(shortName), is(eventClass));
        assertThat(eventClass.getShorName(), is(shortName));
    }

    @ParameterizedTest
    @MethodSource("generateIncorrectShortName")
    @DisplayName("Test in the short name is incorrect")
    void eventClassNullIfIncorrectShortName(String shortName) {
        assertThat(EventClass.of(shortName), nullValue());
    }

    static Stream<String> generateIncorrectShortName() {
        String letterUpperCase = "AEFGHIJKLMNOPQRTUVWXYZ0123456789";
        String letterLowerCase = letterUpperCase.toLowerCase();

        return Stream.of(letterUpperCase, letterLowerCase)
                .flatMapToInt(String::chars)
                .mapToObj(c -> (char) c)
                .map(String::valueOf);
    }


    static Stream<Arguments> generateEquivalenceArgument() {
        return Stream.of(
                Arguments.of(EventClass.BUSINESS_EVENT, "B"),
                Arguments.of(EventClass.COMMAND_EVENT, "C"),
                Arguments.of(EventClass.DOMAIN_EVENT, "D"),
                Arguments.of(EventClass.SYSTEM_EVENT, "S")
        );
    }

    static Stream<String> generateCorrectShortNames() {
        return Stream.of("B", "C", "D", "S");
    }

    static Stream<EventClass> generateEventClass() {
        return Stream.of(
                EventClass.BUSINESS_EVENT,
                EventClass.COMMAND_EVENT,
                EventClass.DOMAIN_EVENT,
                EventClass.SYSTEM_EVENT
        );
    }


}
