package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldCurrentStationBeforeMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationBeforeMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentStationAfterMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationMin() {
        Radio radio = new Radio(20,0);
        radio.setPrevStation();
        assertEquals(20, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationAfterMin() {
        Radio radio = new Radio(20, 1);
        radio.setPrevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationMax() {
        Radio radio = new Radio(20, 20);
        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSetNextStationBeforeMax() {
        Radio radio = new Radio(20, 19);
        radio.setNextStation();
        assertEquals(20, radio.getCurrentStation());
    }


    @Test
    public void shouldPrevVolumeMin() {
        Radio radio = new Radio(0);
        radio.setPrevVolume();
        assertEquals(0, radio.getVolume());
    }


    @Test
    public void shouldPrevVolumeAfterMin() {
        Radio radio = new Radio(1);
        radio.setPrevVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldNextVolumeMax() {
        Radio radio = new Radio(100);
        radio.setNextVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    public void shouldNextVolumeBeforeMax() {
        Radio radio = new Radio(99);
        radio.setNextVolume();
        assertEquals(100, radio.getVolume());
    }
}
