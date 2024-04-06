public class Monster {
    int eyes;
    int legs;
    int hands;

    Monster() {
        this.eyes = 2;
        this.legs = 2;
        this.hands = 2;
    }

    Monster(int eyes) {
        this.eyes = eyes;
        this.legs = 2;
        this.hands = 2;
    }

    Monster(int eyes, int legs) {
        this.eyes = eyes;
        this.legs = legs;
        this.hands = 2;
    }

    Monster(int eyes, int legs, int hands) {
        this.eyes = eyes;
        this.legs = legs;
        this.hands = hands;
    }

    void voice() {
        System.out.println("Голос");
    }

    void voice(int i) {
        for(int a = 0; a < i; a++) {
            System.out.println("Голос");
        }
    }

    void voice(int i, String word) {
        for(int a = 0; a < i; a++) {
            System.out.println(word);
        }
    }
}
