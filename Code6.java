// Date:15-03-2024 ,This is the journey of learning
//CodeWithSaumya: Code6
//Long Data Type
public class Code6 {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60; // convert to seconds
        distance = lightspeed * seconds; // compute distance
        System.out.println("In " + days);
        System.out.println("days light will travel about");
        System.out.println(distance + " miles");
    }
}
