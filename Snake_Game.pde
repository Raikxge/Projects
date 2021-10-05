int angle=0;
int snakesize=5;
int gametime=0;
int[] snakeheadx= new int[2500];
int[] snakeheady= new int[2500];
int munchyx=(round(random(47))+1)*8;
int munchyy=(round(random(47))+1)*8;
boolean redo = true;
boolean stopgame = false;
void setup()
{
  restart();
  size(700,700);
  textAlign(CENTER);
}
void draw()
{
  if (stopgame)
  {
  }
  else
  {
  gametime+=1;
  fill(255,0,0);
  stroke(0);
  rect(munchyx,munchyy,8,8);
  fill(0);
  stroke(0);
  rect(0,0,width,8);
  rect(0,height-8,width,8);
  rect(0,0,8,height);
  rect(width-8,0,8,height);
  if ((gametime % 5)==0)
  {
    travel();
    display();
    checkdead();
  }
  }
}
void keyPressed()
{
  if (key == CODED)
  {
    if (keyCode == UP && angle!=270 && (snakeheady[1]-8)!=snakeheady[2])
    {
      angle=90;
    }
    if (keyCode == DOWN && angle!=90 && (snakeheady[1]+8)!=snakeheady[2])
    {
      angle=270;
    }if (keyCode == LEFT && angle!=0 && (snakeheadx[1]-8)!=snakeheadx[2])
    {
      angle=180;
    }if (keyCode == RIGHT && angle!=180 && (snakeheadx[1]+8)!=snakeheadx[2])
    {
      angle=0;
    }
    if (keyCode == SHIFT)
    {
      restart();
    }
  }
}
void travel()
{
  for(int i=snakesize;i>0;i--)
  {
    if (i!=1)
    {
      snakeheadx[i] = snakeheadx[i-1];
      snakeheady[i] = snakeheady[i-1];
    }
    else
    {
      switch(angle)
      {
        case 0:
        snakeheadx[1]+=8;
        break;
        case 90:
        snakeheady[1]-=8;
        break;
        case 180:
        snakeheadx[1]-=8;
        break;
        case 270:
        snakeheady[1]+=8;
        break;
      }
    }
  }
  
}
void display()
{
 
  if (snakeheadx[1] == munchyx && snakeheady[1] == munchyy)
  {
    snakesize+=round(random(3)+1);
    redo=true;
    while(redo)
    {
      munchyx=(round(random(47))+1)*8;
      munchyy=(round(random(47))+1)*8;
      for(int i=1;i<snakesize;i++)
      {
        
        if (munchyx==snakeheadx[i] && munchyy==snakeheady[i])
        {
          redo=true;
        }
        else
        {
          redo=false;
          i=1000;
        }
      }
    }
  }
  
  stroke(sinecolor(1),sinecolor(0),sinecolor(.5));
  fill(0);
  rect(snakeheadx[1],snakeheady[1],8,8);
  fill(255);
  rect(snakeheadx[snakesize],snakeheady[snakesize],8,8);
  
}
void checkdead()
{
  for(int i=2;i<=snakesize;i++)
  {
    if (snakeheadx[1] == snakeheadx[i] && snakeheady[1] == snakeheady[i])
    {
      fill(255);
      rect(125,125,160,100);
      fill(0);
      text("GAME OVER",200,150);
      text("Score:  "+str(snakesize-1)+" units long",200,175);
      text("To restart, press Shift.",200,200);
      stopgame=true;
    }
    if (snakeheadx[1]>=(width-8) || snakeheady[1]>=(height-8) || snakeheadx[1]<=0 || snakeheady[1]<=0)
    {
      fill(255);
      rect(125,125,160,100);
      fill(0);
      text("GAME OVER",200,150);
      text("Score:  "+str(snakesize-1)+" units long",200,175);
      text("To restart, press Shift.",200,200);
      stopgame=true;
    }
  }
}
void restart()
{
  background(255);
  snakeheadx[1]=200;
  snakeheady[1]=200;
  for(int i=2;i<1000;i++)
  {
    snakeheadx[i]=0;
    snakeheady[i]=0;
  }
  stopgame=false;
  munchyx=(round(random(47))+1)*8;
  munchyy=(round(random(47))+1)*8;
  snakesize=5;
  gametime=0;
  angle=0;
  redo=true;
}
float sinecolor(float percent)
{
  float slime=(sin(radians((((gametime +(255*percent)) % 255)/255)*360)))*255;
  return slime;
}