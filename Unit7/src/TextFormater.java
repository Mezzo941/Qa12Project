public class TextFormater extends Unit7Task2 {

    private String[] string1;
    private String[] string2;

    @Override
    public boolean getPoly(String str) {

        String buffStr = "";
        boolean check = true;
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '.' || str.charAt(i) == ',') {
                if (super.getPoly(String.valueOf(buffStr)) == false) {
                    check = false;
                    buffStr = "";
                    index = 0;
                } else {
                    check = true;
                    break;
                }
            } else {
                buffStr += String.valueOf(str.charAt(i));
                index++;
            }
        }
        return check;
    }

    public TextFormater(String[] string1, String[] string2) {

        this.string1 = string1;
        this.string2 = string2;

        int index = 0;

        for (int i = 0; i < this.string1.length; i++) {
            this.string1[i]=this.string1[i].trim();
            if (wordsCounter(this.string1[i]) >= 3 && wordsCounter(this.string1[i]) <= 5 || getPoly(this.string1[i])) {
                this.string2[index] = this.string1[i];
                index++;
            }
        }
    }

    void printFinalText() {
        for (int i = 0; i < this.string2.length; i++) {
            if (this.string2[i] == null) {
                break;
            } else {
                System.out.println(this.string2[i]);
            }
        }
    }


    public int wordsCounter(String str) {

        String buffStr = "";
        String[] finalString = new String[50];
        int index = 0;
        int wordCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '.' || str.charAt(i) == ',') {
                finalString[index] = buffStr;
                index++;
                buffStr = "";
            } else {
                buffStr += String.valueOf(str.charAt(i));
            }
        }

        for (int i = 0; i < finalString.length; i++) {
            if (finalString[i] != null) {
                wordCounter++;
            } else break;
        }
        return wordCounter;
    }

    public static void main(String[] args) {

        //Чтобы все работало - в конце предложения должна стоять точка

        String[] story = {"Я ел мясо.", "Тимми не нравится городская мадам, поэтому он возвращается домой.", "Тимми ел городских котов.",
                "Старушка рада любой находке и не теряет оптимизма и хорошего настроения."};
        String[] story1 = {"      В моей машине сломался недавно купленный ротор.    ", "Папа, мне не нужны деньги.", " кабкуак.  ", "Кошкин маленький комочек.", "Кошкин комок."};
        String[] finalStory = new String[20];
        TextFormater text = new TextFormater(story, finalStory);
        text.printFinalText();
    }
}

