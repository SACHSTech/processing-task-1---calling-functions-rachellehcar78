import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   ***/
  public void settings() {
	// put your size call here
    size(500, 800);
  }

  /**   
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(94, 218, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff    
    // Petal #1
    stroke(87);
    fill(255, 122, 235);
    ellipse(200, 250, 100, 100);
    
    // Petal #2
    stroke(87);
    fill(255, 122, 235);
    ellipse(200, 300, 100, 100);
    
    // Petal #3
    stroke(87);
    fill(255, 122, 235);
    ellipse(250, 325, 100, 100);
    
    // Petal #4
    stroke(87);
    fill(255, 122, 235);
    ellipse(305, 300, 100, 100);
    
    // Petal #5
    stroke(87);
    fill(255, 122, 235);
    ellipse(305, 250, 100, 100);
    
    // Petal #6
    stroke(87);
    fill(255, 122, 235);
    ellipse(275, 200, 100, 100);
    
    // Petal #7
    stroke(87);
    fill(255, 122, 235);
    ellipse(225, 200, 100, 100);
    
	  // Middle Part
    stroke(87);
    fill(255, 238, 56);
    ellipse(250, 260, 50, 50);
    
    // Stem
    stroke(87);
    fill(21, 191, 30);
    rect(245, 375, 10, 300);
  }

}
