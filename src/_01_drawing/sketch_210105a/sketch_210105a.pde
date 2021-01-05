PImage pic;

int x=250;
int y=5;

int a=300;
int b=3;


void setup(){
  size(600,600);
  pic=loadImage("fistPump.png");
}


void draw(){
  background(#380DFF);
  image(pic, x,a, 100,100);
  
  if(mousePressed){
   
  x=x+y;
  a=a+b;
  }
 if(x>600){
   y=-y;
   
 }
 
 if(x<0){
   y = -y;
 }
  
  if(a>600){
  b=-b;
  
  
  }
  
  if(a<0){
    b=-b;
  }
  
}
