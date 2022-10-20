class Country {
    // Instances
    public String country_name;
    public int area;
    public int population;
    public String capital_city;

    // Method
    public int getDensity(){
        int density = population/ area;
        return density;
    }

    // Constructor
    public Country(){
        // nothing
    }

    public Country(String country_name, int area, int population, String capital_city){
        this.country_name = country_name;
        this.area = area;
        this.population = population;
        this.capital_city = capital_city;
    }
}
