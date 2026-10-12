public class StaticTest {
    static class Example {
        public static final int INITIAL_COUNT = 10;
        private static int count = 0;
        private int instanceId;

        Example() {
            count++;
            instanceId = count + INITIAL_COUNT;
        }

        // static 필드는 클래스 단위로 공유됨
        // INITIAL_COUNT는 상수 풀에 저장되고, 클래스 메타데이터에서 관리됨
        public static int getLastInstanceId() {
            return count + INITIAL_COUNT;
        }

        public static int getCount() {
            return count;
        }

        public int getInstanceId() {
            return instanceId;
        }
    }

    public static void main(String[] args) {
        Example e1 = new Example();
        Example e2 = new Example();
        Example e3 = new Example();

        System.out.println("count = " + Example.getCount());
        System.out.println("last instance id = " + Example.getLastInstanceId());
        System.out.println("e1.id = " + e1.getInstanceId());
        System.out.println("e2.id = " + e2.getInstanceId());
        System.out.println("e3.id = " + e3.getInstanceId());
    }
}
