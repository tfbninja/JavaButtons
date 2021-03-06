package javabuttons;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 *
 * @author Tim Barber
 */
public class JavaButtonsTester extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Canvas canvas;
    private static Color bg = Color.ROYALBLUE;

    @Override
    public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();

        canvas = new Canvas(WIDTH, HEIGHT);

        root.getChildren().add(canvas);

        Scene primaryScene = new Scene(root, WIDTH, HEIGHT);

        // Graphics code goes here
        int buttonX = WIDTH / 2;
        int buttonY = HEIGHT / 2;
        int buttonW = 100;
        int buttonH = 40;
        int alpha = 80;
        PresetButtons.drawModernButton(canvas, buttonX, buttonY, buttonW, buttonH, 15, Color.web("FFFFFF"), Color.BROWN, alpha, "Click Me", new Font("Gabriola", 15));
        stage.setScene(primaryScene);
        stage.setTitle("Title");
        stage.show();

        primaryScene.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                int mX = (int) event.getX();
                int mY = (int) event.getY();
                if (mX > buttonX && mX < buttonX + buttonW && mY > buttonY && mY < buttonY + buttonH) {
                    GraphicsContext gc = canvas.getGraphicsContext2D();
                    bg = bg.invert();
                    gc.setFill(bg);
                    gc.fillRect(0, 0, WIDTH, HEIGHT); // clear
                    PresetButtons.drawModernButton(canvas, WIDTH / 2, HEIGHT / 2, 100, 40, 15, Color.web("FFFFFF"), Color.BROWN, alpha, "Click Me", new Font("Gabriola", 15));
                }
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
/*
 * The MIT License
 *
 * Copyright (c) 2018 Tim Barber.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
