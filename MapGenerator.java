/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.brickbreakergame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
    public int map[][];
    public int brickWidth;
    public int brickHeight;
    
    public MapGenerator(int row, int col) {
        map = new int[row][col];
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                map[i][j] = 1;
            }
        }
        
        brickWidth =  500 / col;
        brickHeight = 150 / row;
    }
    
    public void setBrick(int value, int r, int c) {
        map[r][c] = 0;
    }
    public void draw(Graphics2D g) {
        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map[0].length; j++) {
                if(map[i][j] > 0) {
                    g.setColor(Color.green);
                    g.fillRect(j*brickWidth+ 80, i*brickHeight + 45, brickWidth, brickHeight);
                    
                    g.setColor(Color.DARK_GRAY);
                    g.setStroke(new BasicStroke(3));
                    g.drawRect(j*brickWidth+ 80, i*brickHeight + 45, brickWidth, brickHeight);
                }
            }
        }
    }
}