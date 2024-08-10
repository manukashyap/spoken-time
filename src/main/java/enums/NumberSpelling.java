package src.main.java.enums;

public enum NumberSpelling {
    ONE(1, "one"),
    TWO(2, "two"),
    THREE(3, "three"),
    FOUR(4, "four"),
    FIVE(5, "five"),
    SIX(6, "six"),
    SEVEN(7, "seven"),
    EIGHT(8, "eight"),
    NINE(9, "nine"),
    TEN(10, "ten"),
    ELEVEN(11, "eleven"),
    TWELVE(12, "twelve"),
    THIRTEEN(13, "thirteen"),
    FOURTEEN(14, "fourteen"),
    FIFTEEN(15, "fifteen"),
    SIXTEEN(16, "sixteen"),
    SEVENTEEN(17, "seventeen"),
    EIGHTEEN(18, "eighteen"),
    NINETEEN(19, "nineteen"),
    TWENTY(20, "twenty"),
    TWENTY_ONE(21, "twenty one"),
    TWENTY_TWO(22, "twenty two"),
    TWENTY_THREE(23, "twenty three"),
    TWENTY_FOUR(24, "twenty four"),
    TWENTY_FIVE(25, "twenty five"),
    TWENTY_SIX(26, "twenty six"),
    TWENTY_SEVEN(27, "twenty seven"),
    TWENTY_EIGHT(28, "twenty eight"),
    TWENTY_NINE(29, "twenty nine"),
    THIRTY(30, "thirty");

    private final int number;
    private final String spelling;

    NumberSpelling(int number, String spelling) {
        this.number = number;
        this.spelling = spelling;
    }

    public int getNumber() {
        return number;
    }

    public String getSpelling() {
        return spelling;
    }

    public static NumberSpelling fromNumber(int number) {
        for (NumberSpelling ns : NumberSpelling.values()) {
            if (ns.getNumber() == number) {
                return ns;
            }
        }
        throw new IllegalArgumentException("Invalid number: " + number);
    }

    @Override
    public String toString() {
        return number + " - " + spelling;
    }
}