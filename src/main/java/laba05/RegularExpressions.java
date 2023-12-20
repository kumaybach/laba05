package laba05;

public class RegularExpressions {
    static boolean isPhoneNumberValide(String phoneNumber) {
        String regex = "\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}";
        return phoneNumber.matches(regex);
    }

    static String removeWrongSpace(String text) {
        return text.replaceAll("\\s+", " ");
    }

    static String removeHtmlTag(String text) {
        return text.replaceAll("<[^>]+>", "");
    }

}
