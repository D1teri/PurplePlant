/**
 Author: D1teri or Dima K.
 Version 1.0.0
**/
public class RedBukkit
{
    int x = 1007;
    int y = 0;
    public void run() {
    while (x > 0) {
        x -= 7;
        System.out.println(x);
        while(y < 300000000){
            y += 1;
        }
        y = 0;
    }
    }
    public static void main(String[] args) 
    {
        RedBukkit sp = new RedBukkit();
        sp.run();
    }
}
