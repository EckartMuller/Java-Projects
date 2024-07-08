import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
public class FlappyBird extends JPanel implements ActionListener, KeyListener {
    int boardWith = 360;
    int boardHeight = 640;

    //Resimler
    Image backgroundImg;
    Image birdImg;
    Image topPipeImg;
    Image bottomPipeImg;

    //Kuscuk
    int birdX = boardWith/8;
    int birdY = boardHeight/2;
    int birdWidth = 34;
    int birdHeight = 24;

    

    class Bird{
        int x = birdX;
        int y = birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;

        Bird(Image img){
            this.img = img;
        }
    }
    //borular
    int pipeX = boardWith;
    int pipeY = 0;
    int pipeWidth = 64;
    int pipeHeight = 512;

    class Pipe{
        int x = pipeX;
        int y = pipeY;
        int width = pipeWidth;
        int height = pipeHeight;
        Image img;
        boolean passed = false;

        Pipe(Image img){
            this.img = img;
        }
    }

    //Oyun mantigi
    Bird bird;
    int velocityX = -4;//boru sol hareket(aslında saga)
    int velocityY = 0;
    int gravity = 1; 

    ArrayList<Pipe> pipes;
    Random random = new Random();

    Timer gameLoop;
    Timer placePipesTimer;
    boolean gameOver = false;
    double score = 0;

    FlappyBird(){
        setPreferredSize(new Dimension(boardWith, boardHeight));
        //setBackground(Color.BLUE);

        setFocusable(true);
        addKeyListener(this);

        //resimler yükle
        backgroundImg = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        bottomPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();
        
        //kuscuk
        bird = new Bird(birdImg);
        pipes = new ArrayList<Pipe>();
        //places pipes timerrs
        placePipesTimer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                placePipes();
            }
        });

        placePipesTimer.start();
        //oyun timer loop
        gameLoop = new Timer(1000/60, this);
        gameLoop.start();
   
    }

    public void placePipes(){
        //boru boyu ayarlari üst
        int randomPipeY = (int)(pipeY-pipeHeight/4 - Math.random()*(pipeHeight/2));
        int openingSpace = boardHeight/4;
        
        Pipe topPipe = new Pipe(topPipeImg);
        topPipe.y = randomPipeY;
        pipes.add(topPipe);
        //asagi borular
        Pipe bottomPipe = new Pipe(bottomPipeImg); 
        bottomPipe.y = topPipe.y + pipeHeight + openingSpace;
        pipes.add(bottomPipe);



    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);

    }
    public void draw(Graphics g){
        
        //arka plan
        g.drawImage(backgroundImg, 0, 0, boardWith, boardHeight, null);
        
        //kus
        g.drawImage(bird.img, bird.x, bird.y, bird.width, bird.height, null);
    
        //borular
        for(int i = 0;i < pipes.size();i++){
            Pipe pipe = pipes.get(i);
            g.drawImage(pipe.img, pipe.x, pipe.y, pipe.width, pipe.height, null);
        }

        //skor kısmı
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        if(gameOver)
        {
            g.drawString("Game Over: " + String.valueOf((int)score), 10, 35);
        }
        else
            g.drawString(String.valueOf((int)score), 10, 35);

    }

    public void move(){
        //kuscuk hareket

        velocityY += gravity; // yer cekimi
        //kus asagi
        bird.y += velocityY;
        bird.y = Math.max(bird.y, 0);

        //borular hareket
        for(int i = 0;i<pipes.size();i++){
            Pipe pipe = pipes.get(i);
            pipe.x += velocityX;

            if(!pipe.passed && bird.x > pipe.x + pipe.width){
                pipe.passed = true;
                score += 0.5;
            }

            if(collision(bird, pipe)){
                gameOver = true;
            }
        }

        if(bird.y > boardHeight){
            gameOver = true;
        }
    }

    public boolean collision(Bird a, Pipe b){//carpısma borulara kuralı
        
        return a.x < b.x + b.width && 
               a.x + a.width > b.x &&
               a.y < b.y + b.height &&
               a.y + a.height > b.y;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
       move(); 
       repaint();
       if(gameOver){
        placePipesTimer.stop();
        gameLoop.stop();
       }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            velocityY = -9;
            if(gameOver){
                //oyunu tekrar baslat
                bird.y = birdY;
                velocityY = 0;
                pipes.clear();
                score = 0;
                gameOver = false;
                gameLoop.start();
                placePipesTimer.start();
            }
        }
        
    }

   

    @Override
    public void keyReleased(KeyEvent e) {}


}
