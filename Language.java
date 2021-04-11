class Language {
  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
    this.name = name;
    this.numSpeakers = numSpeakers;
    this.regionsSpoken = regionsSpoken;
    this.wordOrder = wordOrder;
  }

  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". The language follows the word order: " + this.wordOrder);
  } 

  public static void main(String[] args) {
    Language Spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
    Spanish.getInfo();
    Mayan Chontal = new Mayan("Chontal", 36810);
    Chontal.getInfo();
    SinoTibetan Mandarin = new SinoTibetan("Mandarin Chinese", 18000000);
    SinoTibetan Burmese = new SinoTibetan("Burmese", 5490000);
    Mandarin.getInfo();
    Burmese.getInfo();
  }
}
