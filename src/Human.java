public class Human {
    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    public Human(String name, int yearOfBirth, String town, String job) {
        if (name.length() <= 0 || name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town.length() <= 0 || town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        this.yearOfBirth = yearOfBirth;
        this.job = job;
    }

    public int getYearOfBirth() {
        return this.yearOfBirth;
    }
    public int setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
            return this.yearOfBirth;
        }
        return this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return this.name;
    }
    public String setName(String name) {
        return this.name = name;
    }

    public String getTown() {
        return this.town;
    }
    public String setTown(String town){
        return this.town = town;
    }

    public String getJob() {
        return this.job;
    }
    public String setJob(String job) {
        if (job.length() <= 0 || job == null) {
            this.job = "Информация не указана";
            return this.job;
        }
        return this.job = job;
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился в "
                + getYearOfBirth() + " году. Я работаю на должности " + getJob() + ". Будем знакомы!";
    }

    public static void printAllHuman(Human[] human) {
        for (Human human1 : human) {
            if (human1 != null) {
                System.out.println(human1.toString());
            }
        }

    }
}

