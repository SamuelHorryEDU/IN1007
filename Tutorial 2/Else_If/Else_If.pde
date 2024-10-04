float ran;

void setup()
{
  size(200, 200);
  fill(0);
  textSize(48);
  textAlign(CENTER);

  ran = random(6);
  println(ran);
}

void draw()
{
  background(255);
  String message="";

  if (ran < 1)
  {
    message = "ONE";
  } else if (ran < 2)
  {
    message = "TWO";
  } else if (ran < 3)
  {
    message = "THREE";
  } else if (ran < 4)
  {
    message = "FOUR";
  } else if (ran < 5)
  {
    message = "FIVE";
  } else
  {
    message = "SIX";
  }
  // Can you write the code for the remaining cases?

  text(message, width/2, height/2);
}
