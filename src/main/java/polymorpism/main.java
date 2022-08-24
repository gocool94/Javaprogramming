package polymorpism;

class Movie {
    private String name;

    public String getName() {
        return name;
    }

    public Movie (String name){
        this.name = name;
    }

    public String plot() {
        System.out.println("No plots here");

        return "No plots here";
    }


}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A Shart eats lot of people";
    }
}


class IndependeDay extends Movie {
    public IndependeDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens take over the world";
    }
}

class MazeRunner extends Movie {
    @Override
    public String plot() {
        return "Maze runner is an runner within the maze";
    }

    public MazeRunner() {
        super("Maze runner");
    }
}

class StarWar extends Movie {
    public StarWar() {
        super("Starwar");
    }

    @Override
    public String plot() {
        return "Star wars starshipp";
    }
}

class ForgetableMovie extends Movie {

    public ForgetableMovie() {
        super("Forgetable movie");
    }

    //No plot name
}

public class main {

    public static void main(String[] args){
        for (int i = 0 ;i<5;i++) {
            Movie movie = RandomMovie();

            System.out.println("Movie #   " + i + ":" +movie.getName()+"" +
                    "Plot :"+movie.plot());
        }

    }


    public static Movie RandomMovie() {

        int randomNumber = (int) ((Math.random() * 5) + 1);

        System.out.println("Random number generated " + randomNumber);

        switch (randomNumber) {

            case 1:
                return new Jaws();

            case 2:
                return new IndependeDay();

            case 3:
                return  new StarWar();

            case 4:
                return new ForgetableMovie();


        }
        return null;
    }
}
