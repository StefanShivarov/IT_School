package myonlineshop;

public class ComicBook extends Book{

    private String characterName;

    public ComicBook(double regularPrice, String publisher, int yearPublished, String characterName) {
        super(regularPrice, publisher, yearPublished);
        this.setCharacterName(characterName);
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    @Override
    public double computeSalePrice() {
        return super.getRegularPrice()*0.4;
    }

    public String getCharacterName() {
        return characterName;
    }

    @Override
    public String toString(){
        return String.format("%n%s:%n",this.getClass().getSimpleName())
                +super.toString()+
                String.format("Character name: %s%nSale price: %.2f", this.getCharacterName(), this.computeSalePrice());
    }
}
