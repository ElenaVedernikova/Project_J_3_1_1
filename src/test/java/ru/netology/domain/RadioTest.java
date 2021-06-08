package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldCurrentStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }

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
    public void shouldCurrentStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
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
        radio.setPrevStation(0);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationBeforeMin() {
        Radio radio = new Radio();
        radio.setPrevStation(-1);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStationAfterMin() {
        Radio radio = new Radio();
        radio.setPrevStation(1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationMax() {
        Radio radio = new Radio();
        radio.setNextStation(9);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldsetNextStationBeforeMax() {
        Radio radio = new Radio();
        radio.setNextStation(8);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStationAfterMax() {
        Radio radio = new Radio();
        radio.setNextStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevVolumeMin() {
        Radio radio = new Radio();
        radio.setPrevVolume(0);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldPrevVolumeBeforeMin() {
        Radio radio = new Radio();
        radio.setPrevVolume(-1);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldPrevVolumeAfterMin() {
        Radio radio = new Radio();
        radio.setPrevVolume(1);
        assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldNextVolumeMax() {
        Radio radio = new Radio();
        radio.setNextVolume(10);
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldNextVolumeBeforeMax() {
        Radio radio = new Radio();
        radio.setNextVolume(9);
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void shouldNextVolumeAfterMax() {
        Radio radio = new Radio();
        radio.setNextVolume(11);
        assertEquals(10, radio.getVolume());
    }
}
