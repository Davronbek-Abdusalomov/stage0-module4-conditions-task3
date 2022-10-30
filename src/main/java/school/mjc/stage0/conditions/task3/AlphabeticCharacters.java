package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character>='A' && character<='z'){
            if (character=='A' || character=='a' || character=='E' || character=='e' || character=='I' || character=='i' || character=='U' || character=='u' || character=='O' || character=='o'){
                System.out.println("Vowel");
            }
            else System.out.println("Consonant");
        }
        else System.out.println("wrong alphabet!");
    }
}
