public class prac4_1 {
    static class parent {
        public void primary() {

            System.out.println("This is parent class");

        }

        static class child extends parent {
            public void secondary() {
                System.out.println("This is a child class");

            }

        };

    };

    public static void main(String[] args) {
        parent c1 = new parent();
        c1.primary();
        parent.child c2 = new parent.child();
        c2.secondary();
        c2.primary();

    }
}