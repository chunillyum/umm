package javabook;//챗지피티가 짜준 버전
//리턴해서 쓰는 버전임

public class areYouMyFriendChatGPT {
    static String info = "hi";

    static class EleSchool {
        static String[] getHometown() {
            String[] hometown = {"hanbit", "hobin", "dongwoo", "dongman", "chanyang"};
            return hometown;
        }
    }

    static class MiddleSchool {
        static String[] getHometown() {
            String[] hometown = {"minjun", "jaewoong", "hyenwoo", "jaeho"};
            return hometown;
        }
    }

    static class HighSchool {
        static String[] getHometown() {
            String[] hometown = {"sicksick", "jaesung"};
            return hometown;
        }
    }
//..
    public static void main(String[] args) {
        String[] eleSchoolHometown = EleSchool.getHometown();
        String[] middleSchoolHometown = MiddleSchool.getHometown();
        String[] highSchoolHometown = HighSchool.getHometown();

        System.out.println(info);

        for (String friend : eleSchoolHometown) {
            System.out.println(friend);
        }

        for (String friend : middleSchoolHometown) {
            System.out.println(friend);
        }

        for (String friend : highSchoolHometown) {
            System.out.println(friend);
        }
    }
}