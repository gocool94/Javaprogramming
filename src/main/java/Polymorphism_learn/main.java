package Polymorphism_learn;

class Movie {
    private String name;

    public String getName() {

        return this.name;
    }

    public Movie(String name) {

        this.name = name;
    }

    public String plot() {
        System.out.println("No plots here");
        return "No plots here";
    }
}

class Spiderman extends Movie {

    public Spiderman() {

        super("Spiderman");
    }

    @Override
    public String plot() {
        return "A Spider bitten guy saves US";
    }
}

class Avengers extends Movie {

    public Avengers() {

        super("Avengers");
    }

    @Override
    public String plot() {
        return "Team of fighters join together for a war against Thanos";
    }
}

class Moonfall extends Movie {

    public Moonfall() {

        super("Moonfall");
    }

    @Override
    public String plot() {
        return "Action movie -> MoonLight";
    }
}

class Titanic extends Movie {

    public Titanic() {

        super("Titanic");
    }

    @Override
    public String plot() {
        return "A poor guy loves a girl in a sinking ship";
    }
}

class Tenet extends Movie {

    public Tenet() {
        super("Tenet");

    }

    //Not giving a plot

}

class Interstellar extends Movie {

    public Interstellar() {
        super("Interstellar");

    }

    //Not giving a plot

}












public class main {
    public static void main(String[] args) {

        for(int i = 0;i<11;i++) {

            Movie movie =  RandomMovie();



            System.out.println("Movie ## " + i + " : " +movie.getName()+ " " + "Plot :" + movie.plot() );
        }


    }


    public static Movie RandomMovie() {

        int randomNumber = (int)(Math.random() * 5) +1;

        System.out.println("The random Number generated is " + randomNumber);

        switch (randomNumber) {

            case 1:
                return new Spiderman();

            case 2:
                return new Avengers();

            case 3:
                return new Tenet();

            case 4:
                return new Interstellar();

            case 5:
                return new Moonfall();

            case 6:
                return new Titanic();


        }

        return null;


    }





}
