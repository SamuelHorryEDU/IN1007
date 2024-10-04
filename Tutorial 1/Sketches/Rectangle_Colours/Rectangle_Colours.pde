void setup()
{
  size(510, 300);
  background(255, 236, 149);
  fill(203, 118, 122);
}

void draw()
{
  background(255, 236, 149);
  fill(203, 118, 122);
  fill(mouseX / 2, mouseY / 2, 150);
  rect(mouseX, mouseY, 120, 80);
}
