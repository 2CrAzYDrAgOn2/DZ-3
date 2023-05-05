enum Seasons {
    Весна(10),
    Лето(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    Осень(15),
    Зима(-5);

    private int averageTemperature;

    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}

public class Main {
    public static void main(String[] args) {
        Seasons favoriteSeason = Seasons.Лето;
        System.out.println("Моё любимое время года - " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + favoriteSeason.getDescription());

        for (Seasons season : Seasons.values()) {
            System.out.println(season + " - " + season.getAverageTemperature() + " градусов, " + season.getDescription());
        }

        switch (favoriteSeason) {
            case Лето:
                System.out.println("Я люблю лето");
                break;
            case Весна:
                System.out.println("Я люблю весну");
                break;
            case Осень:
                System.out.println("Я люблю осень");
                break;
            case Зима:
                System.out.println("Я люблю зиму");
                break;
        }
    }
}