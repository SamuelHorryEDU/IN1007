Car myCar;
Car greenCar;
Car redCar;

void setup() {
  size(800, 400);
  myCar = new Car(100, 100, color(0, 0, 255), 2);
  greenCar = new Car(100, 200, color(0, 255, 0), 3);
  redCar = new Car(100, 300, color(255, 0, 0), 4);
}

void draw() {
  background(255);
  myCar.move();
  myCar.display();

  greenCar.move();
  greenCar.display();

  redCar.move();
  redCar.display();
}
