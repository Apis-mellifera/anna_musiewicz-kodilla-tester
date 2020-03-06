package com.kodilla.collections.adv.immutable;

class BookHacked extends Book {
    private String realTitle;

    public BookHacked(String author, String title) {
        super(author, title);
        realTitle = title;
    }

    @Override
    public String getTitle() {
        return realTitle;
    }

    public void modifyTitle(String newTitle) {
        realTitle = newTitle;
    }

}
