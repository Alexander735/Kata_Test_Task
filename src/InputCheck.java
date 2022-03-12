public class InputCheck {

    private boolean isInputCorrect;

    public void checkInput(String input) {
        if (input.matches("^([0-9]|10)\\s[\\-|\\+|\\*|\\/]\\s([0-9]|10)$|" +
                "^(I|II|III|IV|V|VI|VII|VIII|IX|X)\\s[\\-|\\+|\\*|\\/]\\s(I|II|III|IV|V|VI|VII|VIII|IX|X)$")) {

            isInputCorrect = true;
        } else {isInputCorrect = false;}
    }


    public boolean getIsInputCorrect() {
        return isInputCorrect;
    }
}


