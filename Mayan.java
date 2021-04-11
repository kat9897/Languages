class Mayan extends Language {
  Mayan(String name, int numSpeakers) {
    super(name, numSpeakers, "Central America", "verb-object-subject");
  }

  @Override
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". The language follows the word order: " + this.wordOrder + " Fun fact: " + this.name + " is an ergative language.");
  }
}
