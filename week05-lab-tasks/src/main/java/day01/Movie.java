package day01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private List<LocalDateTime> starts;

    public Movie(String title, List<LocalDateTime> starts) {
        this.title = title;
        this.starts = starts;
    }

    public String getTitle() {
        return title;
    }

    public List<LocalDateTime> getStarts() {
        return starts;
    }
}
