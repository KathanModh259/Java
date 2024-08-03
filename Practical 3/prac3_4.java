
public class prac3_4 {

    public static class tarik {
        int day;
        int year;
        int month;

        public tarik(int day, int month, int year) {
            this.month = month;
            this.day = day;
            this.year = year;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        // int putdate(){
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter date,month and year respectively");
        // int day=sc.nextInt();
        // int month = sc.nextInt();
        // int year = sc.nextInt();
        // sc.close();
        // this.day=day;
        // this.month=month;
        // this.year=year;

        String displayDate() {
            return day + "/" + month + "/" + year;
        }

    }

    public static void main(String[] args) {
        tarik d = new tarik(15, 04, 2005);
        System.out.println("date:" + d.displayDate());
        System.out.println("\n\nThis Practical is made by 23CS046-Kathan Modh");

    }

}
