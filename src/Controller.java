import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Controller {

    @FXML
    private Pane pane;

    @FXML
    private Label label;

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

    public void changeSpeed(){

    }
}
