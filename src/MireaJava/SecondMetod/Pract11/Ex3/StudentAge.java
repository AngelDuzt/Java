package MireaJava.SecondMetod.Pract11.Ex3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentAge {
    private long id;
    private String name;
    private int Score;
    private Date BirthDate;

    public StudentAge(Long id, String name, int Score, Date birthDate) {
        this.id = id;
        this.name = name;
        this.Score = Score;
        this.BirthDate = birthDate;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.BirthDate = birthDate;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public String toString(int how) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        switch (how){
            case 0: {
                sdf = new SimpleDateFormat("dd/MM/yyyy");
                break;
            }
            case 1: {
                sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
                break;
            }

            case 2: {
                sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm AA");
                break;
            }
        };
        return String.format("Student: " + "name = " +
                name + " id = " + id + " Score = " + Score + "BirthDate = " + sdf.format(BirthDate));
    }
}
