import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void setCurrentStation() {  //установка текущей станции
        Radio radio = new Radio();

        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStation2() {  //установка текущей станции
        Radio radio = new Radio(8);

        radio.setCurrentStation(6);

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationMoreMax() {  //установка текущей станции выше МАХ
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCStationLessMin() {  //установка текущей станции ниже MIN
        Radio radio = new Radio();
        radio.setCurrentStation(-2);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCStationLessMin2() {  //установка текущей станции ниже MIN
        Radio radio = new Radio(10);
        radio.setCurrentStation(-2);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextStation() {  //переключение на следующую станцию
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.next();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation2() {  //переключение на следующую станцию
        Radio radio = new Radio(8);
        radio.setCurrentStation(6);

        radio.next();

        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationAfterMax() {  //установка текущей станции после Max
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationAfterMax2() {  //установка текущей станции после Max
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.next();


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {  //переключение на предыдущую станию
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation2() {  //переключение на предыдущую станию
        Radio radio = new Radio(6);
        radio.setCurrentStation(4);

        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterMin() {  //переключение станции назад с MIN текущей станции
        Radio stat = new Radio();
        stat.setCurrentStation(0);

        stat.prev();

        int expected = 9;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationAfterMin2() {  //переключение станции назад с MIN текущей станции
        Radio stat = new Radio(10);
        stat.setCurrentStation(0);

        stat.prev();

        int expected = 9;
        int actual = stat.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void reduceVolume() {  //уменьшение громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.reduceVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {  //увеличение громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 11;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeLessMin() {  //уменьшение громкости ниже MIN
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMoreMax() {  //увеличение громкости больше MAX
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setCurrentVolumeValid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

   @Test
   public void setCurrentVolumeNegativeMin() {
       Radio radio = new Radio();
       radio.setCurrentVolume(-10);

       int expected = 0;
       int actual = radio.getCurrentVolume();

       Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeNegativeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(102);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}