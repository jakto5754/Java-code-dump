import java.util.Scanner;

class SwitchGame {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MINI ADVENTURE ===");
        System.out.println("Choose your character:");
        System.out.println("1 - Warrior");
        System.out.println("2 - Mage");
        System.out.println("3 - Barbarian");
        System.out.println("4 - Archer");

        int character = input.nextInt();

        switch (character) {
            case 1:
                System.out.println("You chose Warrior!");
                System.out.println("Choose your weapon:");
                System.out.println("1 - Sword");
                System.out.println("2 - Axe");

                int warriorWeapon = input.nextInt();

                switch (warriorWeapon) {
                    case 1:
                        System.out.println("You strike the dragon with your sword...");
                        System.out.println("It bounces off right into your face.");
                        youlose();
                        break;
                    case 2:
                        System.out.println("You strike the dragon with your axe...");
                        System.out.println("The dragon has been decapitated in one swift motion.");
                        youwin();
                        break;
                    default:
                        System.out.println("Invalid weapon choice.");
                }
                break;

            case 2:
                System.out.println("You chose Mage!");
                System.out.println("Choose your magic:");
                System.out.println("1 - Ice");
                System.out.println("2 - Fire");

                int mageMagic = input.nextInt();

                switch (mageMagic) {
                    case 1:
                        System.out.println("You cast Ice magic...");
                        System.out.println("The dragon is weak to cold. It's frozen solid.");
                        youwin();
                        break;
                    case 2:
                        System.out.println("You cast Fire magic...");
                        System.out.println("The dragon is immune to heat. It fries you with its breath.");
                        youlose();
                        break;
                    default:
                        System.out.println("Invalid magic choice.");
                }
                break;

            case 3:
                System.out.println("You chose Barbarian!");
                System.out.println("Choose your weapon:");
                System.out.println("1 - Mace");
                System.out.println("2 - Fists");

                int barbarianWeapon = input.nextInt();

                switch (barbarianWeapon) {
                    case 1:
                        System.out.println("You strike the dragon with your mace...");
                        System.out.println("You crush the dragons skull.");
                        youwin();
                        break;
                    case 2:
                        System.out.println("You strike the dragon with nothing but bare fists...");
                        System.out.println("After a violent battle, you managed to take down the beast.");
                        youwin();
                        break;
                    default:
                        System.out.println("Invalid weapon choice.");
                }
                break;

            case 4:
                System.out.println("You chose Archer!");
                System.out.println("Choose your weapon:");
                System.out.println("1 - Shortbow");
                System.out.println("2 - Crossbow");

                int archerWeapon = input.nextInt();

                switch (archerWeapon) {
                    case 1:
                        System.out.println("You attack the dragon with your shortbow...");
                        System.out.println("The arrows fail to penetrate the dragon's skin. You're eaten alive.");
                        youlose();
                        break;
                    case 2:
                        System.out.println("You attack the dragon with your crossbow...");
                        System.out.println("The dragon crushes you before you were even able to load the crossbow.");
                        youlose();
                        break;
                    default:
                        System.out.println("Invalid weapon choice.");
                }
                break;

            default:
                System.out.println("Invalid character choice.");
        }

        input.close();
    }
    public static void youlose(){
        System.out.println("You lose! Game Over!");
    }
    public static void youwin(){
        System.out.println("You win! Game Over!");
    }
}
