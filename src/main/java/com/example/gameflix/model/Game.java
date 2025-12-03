
package com.example.gameflix.model;

public class Game {
    private Long id;
    private String title;
    private String platform;

    public Game() {}

    public Game(Long id, String title, String platform) {
        this.id = id;
        this.title = title;
        this.platform = platform;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}

