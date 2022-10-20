import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Country name: ");
        String country_name = sc.next();
        System.out.print("Enter Country population: ");
        int population = sc.nextInt();
        System.out.print("Enter Country area: ");
        int area = sc.nextInt();
        System.out.print("Enter Country capital: ");
        String capital_city = sc.next();


        Country bangladesh = new Country();
        bangladesh.country_name = "Bangladesh";
        bangladesh.population = 166303498;
        bangladesh.area = 148460;
        bangladesh.capital_city = "Dhaka";
        System.out.println("Density of " + bangladesh.country_name + " is " + bangladesh.getDensity());

        Country another_country = new Country(country_name, area, population, capital_city);
        System.out.println("Density of " + another_country.country_name + " is " + another_country.getDensity());

    }
}
