//java Conditions   judge

int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."

variable = (condition) ? expressionTrue :  expressionFalse;


switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}


//java loop

while (condition) {
  // code block to be executed
}


do {
  // code block to be executed
}
while (condition);


for (int i = 0; i < 5; i++) {
  System.out.println(i);
}

//The break statement can also be used to jump out of a loop
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}


//The continue statement breaks one iteration (in the loop), 
//if a specified condition occurs, and continues with the next iteration in the loop.

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}


