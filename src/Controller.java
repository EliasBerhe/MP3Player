import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class Controller implements Initializable {

    @FXML
    private Pane pane;

    @FXML
    private Label label;
    @FXML
    private Slider volumeSlider;
    @FXML
    private Button playButton;


    @FXML
    private Button pauseButton;


    @FXML
    private Button resetButton;

    @FXML
    private Button previousButton;

    @FXML
    private Button nextButton;

    @FXML
    private ComboBox<String> speedBox;

    @FXML
    private ProgressBar progressBar;

    private File[] files;

    private ArrayList<File> songs;
    private int songNumber;

    private int[] speeds = {25, 50, 75, 100, 125, 150, 175, 200};

    private Timer timer;

    private TimerTask task;

    private boolean running;

    private Media media;

    private MediaPlayer mediaPlayer;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File song1 = new File("src/music/song1.mp3");
        File song2 = new File("src/music/song2.mp3");
        File song3 = new File("src/music/song3.mp3");
        songs = new ArrayList<File>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);

        media  = new Media(songs.get(songNumber).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        label.setText(songs.get(songNumber).getName());

        for(int i=0; i<speeds.length;i++){
            speedBox.getItems().add(Integer.toString(speeds[i])+ "%");
        }
        speedBox.setOnAction(this::changeSpeed); // call changeSpeed
        volumeSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                mediaPlayer.setVolume(volumeSlider.getValue()*0.01);
            }
        });
        progressBar.setStyle("-fx-accent: #00FF00");
    }
    public void playMedia(){

    }
    public void pauseMedia(){

    }
    public void previousMedia(){

    }
    public void nextMedia(){

    }
    public void resetMedia(){

    }

    public void changeSpeed(ActionEvent event){

    }


}
