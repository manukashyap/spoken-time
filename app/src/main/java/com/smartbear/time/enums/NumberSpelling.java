package com.smartbear.time.enums;

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
    THIRTY(30, "thirty"),
    THIRTY_ONE(31, "thirty one"),
    THIRTY_TWO(32, "thirty two"),
    THIRTY_THREE(33, "thirty three"),
    THIRTY_FOUR(34, "thirty four"),
    THIRTY_FIVE(35, "thirty five"),
    THIRTY_SIX(36, "thirty six"),
    THIRTY_SEVEN(37, "thirty seven"),
    THIRTY_EIGHT(38, "thirty eight"),
    THIRTY_NINE(39, "thirty nine"),
    FORTY(40, "forty"),
    FORTY_ONE(41, "forty one"),
    FORTY_TWO(42, "forty two"),
    FORTY_THREE(43, "forty three"),
    FORTY_FOUR(44, "forty four"),
    FORTY_FIVE(45, "forty five"),
    FORTY_SIX(46, "forty six"),
    FORTY_SEVEN(47, "forty seven"),
    FORTY_EIGHT(48, "forty eight"),
    FORTY_NINE(49, "forty nine"),
    FIFTY(50, "fifty"),
    FIFTY_ONE(51, "fifty one"),
    FIFTY_TWO(52, "fifty two"),
    FIFTY_THREE(53, "fifty three"),
    FIFTY_FOUR(54, "fifty four"),
    FIFTY_FIVE(55, "fifty five"),
    FIFTY_SIX(56, "fifty six"),
    FIFTY_SEVEN(57, "fifty seven"),
    FIFTY_EIGHT(58, "fifty eight"),
    FIFTY_NINE(59, "fifty nine");

    private final int number;
    private final String spelling;

    NumberSpelling(int number, String spelling) {
        this.number = number;
        this.spelling = spelling;
    }

    public int getNumber() {
        return number;
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
        return spelling;
    }
}