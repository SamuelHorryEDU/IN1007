class Car {
  float x;
  float y;
  color carColor;
  float speed;

  Car(float tempX, float tempY, color tempColor, float tempSpeed) {
    x = tempX;
    y = tempY;
    carColor = tempColor;
    speed = tempSpeed;
  }

  void display() {
    fill(carColor);
    rect(x, y, 60, 30);
    fill(0);
    ellipse(x+10, y+30, 15, 15);
    ellipse(x+50, y+30, 15, 15);
  }

  void move() {
    x = x + speed;
    if (x > width) {
      x = -60;
    }
  }
}
