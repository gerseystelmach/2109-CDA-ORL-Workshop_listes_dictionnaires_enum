public enum TitleEnum {

    /*Associando um pronome de tratamento a um enun */
    Monsieur("Mr."),
    Madame("Mme."),
    Autre("Autre");


    private final String title;

    TitleEnum(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
