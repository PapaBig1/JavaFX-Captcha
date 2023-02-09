package com.example.captchagenerator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;




public class HelloApplication extends Application {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private int button_one = 1;
    private int button_two = 2;
    private int button_three = 3;
    private int button_four = 4;
    private int button_five = 5;
    private int button_six = 6;
    private int button_seven = 7;
    private int button_eight = 8;
    private int button_nine = 9;
    private int correct1;
    private int incorrect2;

    private TextField correct;
    private TextField incorrect;


    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Zachary's Captcha Generator");
        GridPane grid = new GridPane();
        VBox appContainer = new VBox(10);
        //appContainer.setPrefWidth(300);
        appContainer.setSpacing(20);
        appContainer.setPadding(new Insets(15,15,15,15));

        //setButtonValues();

        button1 = new Button(String.valueOf(button_one));
        grid.add(button1,0,0);
        button1.setOnAction(event -> buttonOne(button_one));

        button2 = new Button(String.valueOf(button_two));
        grid.add(button2,1,0);
        button2.setOnAction(event -> buttonOne(button_two));

        button3 = new Button(String.valueOf(button_three));
        grid.add(button3,2,0);
        button3.setOnAction(event -> buttonOne(button_three));

        button4 = new Button(String.valueOf(button_four));
        grid.add(button4,0,1);
        button4.setOnAction(event -> buttonOne(button_four));

        button5 = new Button(String.valueOf(button_five));
        grid.add(button5,1,1);
        button5.setOnAction(event -> buttonOne(button_five));

        button6 = new Button(String.valueOf(button_six));
        grid.add(button6,2,1);
        button6.setOnAction(event -> buttonOne(button_six));

        button7 = new Button(String.valueOf(button_seven));
        grid.add(button7,0,2);
        button7.setOnAction(event -> buttonOne(button_seven));

        button8 = new Button(String.valueOf(button_eight));
        grid.add(button8,1,2);
        button8.setOnAction(event -> buttonOne(button_eight));

        button9 = new Button(String.valueOf(button_nine));
        grid.add(button9,2,2);
        button9.setOnAction(event -> buttonOne(button_nine));

        grid.add(new Label("Click 5"),4,5);

        grid.add(new Label("Correct"),4,6);
        correct = new TextField();
        correct.setEditable(false);
        grid.add(correct,5,6);

        grid.add(new Label("Incorrect"),4,7);
        incorrect = new TextField();
        incorrect.setEditable(false);
        grid.add(incorrect,5,7);

        Button exit = new Button("Exit");
        grid.add(exit,6,7);
        exit.setOnAction(event -> exitButton());


        Scene scene = new Scene(grid, 400, 200);
        stage.setScene(scene);
        stage.show();
    }

    private void exitButton() {
        System.exit(0);
    }

    private void setButtonValues() {
        ArrayList<Integer> choices = new ArrayList<Integer>();
        for(int x=1;x<10;x++) {
            choices.add(x);
        }
        Random rand = new Random();

        //button one
        int choice1 = choices.get(rand.nextInt(choices.size()));
        choices.remove(Integer.valueOf(choice1));
        int choice2 = choices.get(rand.nextInt(choices.size()));
        choices.remove(Integer.valueOf(choice2));
        int choice3 = choices.get(rand.nextInt(choices.size()));
        choices.remove(Integer.valueOf(choice3));
        int choice4 = choices.get(rand.nextInt(choices.size()));
        choices.remove(Integer.valueOf(choice4));
        int choice5 = choices.get(rand.nextInt(choices.size()));
        choices.remove(Integer.valueOf(choice5));
        int choice6 = choices.get(rand.nextInt(choices.size()));
        choices.remove(Integer.valueOf(choice6));
        int choice7 = choices.get(rand.nextInt(choices.size()));
        choices.remove(Integer.valueOf(choice7));
        int choice8 = choices.get(rand.nextInt(choices.size()));
        choices.remove(Integer.valueOf(choice8));
        int choice9 = choices.get(rand.nextInt(choices.size()));
        choices.remove(Integer.valueOf(choice9));


        button_one = choice1;
        button_two = choice2;
        button_three = choice3;
        button_four = choice4;
        button_five = choice5;
        button_six = choice6;
        button_seven = choice7;
        button_eight = choice8;
        button_nine = choice9;

        button1.setText(String.valueOf(button_one));
        button2.setText(String.valueOf(button_two));
        button3.setText(String.valueOf(button_three));
        button4.setText(String.valueOf(button_four));
        button5.setText(String.valueOf(button_five));
        button6.setText(String.valueOf(button_six));
        button7.setText(String.valueOf(button_seven));
        button8.setText(String.valueOf(button_eight));
        button9.setText(String.valueOf(button_nine));


    }

    private void buttonOne(int i) {
        setButtonValues();
        System.out.println(i);
        if(i == 5) {
            correct1 ++;
            correct.setText(String.valueOf(correct1));
        } else {
            incorrect2 ++;
            incorrect.setText(String.valueOf(incorrect2));
        }

    }

    public static void main(String[] args) {
        launch();
    }
}