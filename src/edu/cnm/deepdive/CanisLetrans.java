package edu.cnm.deepdive;

public class CanisLetrans extends Canis{

  private static int instanceCount = 0;

  public CanisLetrans(){
    instanceCount++;
  }

  @Override
  public void hunt() {
    System.out.println("hunt in packs kill small things alone");
  }

  @Override
  public void speak() {
    System.out.println("Howl, bark, or yap.");
  }

  public static int getInstanceCount() {
    return instanceCount;
  }
}
