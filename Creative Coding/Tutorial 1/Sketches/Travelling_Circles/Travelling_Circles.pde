float x1 = 250;
float y1 = 250;
float x2 = 250;
float y2 = 250;
float x3 = 250;
float y3 = 250;
float x4 = 250;
float y4 = 250;

float circle = 30;

void setup()
{
  size(500, 500);
}

void draw()
{
  ellipse(x1, y1, circle, circle);
  x1 = x1 + 1;
  y1 = y1 + 1;

  ellipse(x2, y2, circle, circle);
  x2 = x2 + 1;
  y2 = y2 - 1;

  ellipse(x3, y3, circle, circle);
  x3 = x3 - 1;
  y3 = y3 + 1;
  
  ellipse(x4, y4, circle, circle);
  x4 = x4 - 1;
  y4 = y4 - 1;
}
