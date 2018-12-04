package javabuttons;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

/**
 *
 * @author Tim Barber
 */
public class PresetButtons {

    public static void drawModernButton(Canvas canvas, int xPos, int yPos, int width, int height, int radius, Color borderColor, String text, Font font) {
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setStroke(borderColor);
        graphics.setFont(font);
        graphics.setLineWidth(5);
        graphics.strokeRoundRect(xPos, yPos, width, height, radius, radius);
        int xPadding = (int) (width - (font.getSize() * text.length()) / 2);
        int yPadding = (int) (height - font.getSize() / 2);
        graphics.fillText(text, xPos + xPadding, yPos + yPadding);
        graphics.strokeRoundRect(xPos, yPos, width, height, radius, radius);
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
