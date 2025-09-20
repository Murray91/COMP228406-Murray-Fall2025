package Lab1;

public class SingerDriver {
    public static void main(String[] args) {

        Singer singer1 = new Singer();

        // To display the default values
        System.out.println("Default values of singer1:");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getAlbumsPublished());
        System.out.println();

        // To set all of the values at once
        singer1.setAll(101, "I See Stars", "Albany, NY", "2006-06-06", 5);

        // To display the updated values
        System.out.println("Values after setting all at once:");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getAlbumsPublished());
        System.out.println();

        // To change the values individually
        singer1.setSingerId(102);
        singer1.setSingerName("Dream On Dreamer");
        singer1.setSingerAddress("Melbourne, Australia");
        singer1.setDateOfBirth("2006-08-08");
        singer1.setAlbumsPublished(4);

        // To display the final values
        System.out.println("Values after individual updates:");
        System.out.println("ID: " + singer1.getSingerId());
        System.out.println("Name: " + singer1.getSingerName());
        System.out.println("Address: " + singer1.getSingerAddress());
        System.out.println("Date of Birth: " + singer1.getDateOfBirth());
        System.out.println("Number of Albums Published: " + singer1.getAlbumsPublished());
    }
}


