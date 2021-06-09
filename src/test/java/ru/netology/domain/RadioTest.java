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
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevStation();
        assertEquals(9, radio.getCurrentStation());
    }


    @Test
    public void shouldPrevStationAfterMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.setPrevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldsetNextStationBeforeMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.setNextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldCurrentVolumeBeforeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        assertEquals(9, radio.getVolume());
    }

    @Test
    public void shouldCurrentVolumeAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldCurrentVolumeBeforeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldCurrentVolumeAfterMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        assertEquals(1, radio.getVolume());
    }

    @Test
    public void shouldPrevVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setPrevVolume();
        assertEquals(0, radio.getVolume());
    }


    @Test
    public void shouldPrevVolumeAfterMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.setPrevVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldNextVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setNextVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldNextVolumeBeforeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.setNextVolume();
        assertEquals(10, radio.getVolume());
    }


}
