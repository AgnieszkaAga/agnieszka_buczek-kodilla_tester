public class UserApplication {
    public static void main(String[] args) {


        User aga = new User("Aga", 38);
        User tomek = new User("Tomek", 20);
        User iga = new User("Iga", 12);
        User roman = new User("Roman", 50);
        User marta = new User("Marta", 10);
        User peter = new User("Peter", 41);
        User livia = new User("Livia", 2);

        User[] board = {aga, tomek, iga, roman, marta,peter,livia};

        UserApplication averageAge = new UserApplication();

        int resultAge = averageAge.getAverageAge(board);
        System.out.println("Below average age: "+resultAge+" are:");

        String resultName = averageAge.getName(board);
        System.out.println(resultName);

    }
    int average = 0;

    public int getAverageAge(User[] board) {

        int sum = 0;

        for (int i = 0; i < board.length; i++) {
            sum = sum + board[i].age;
            average = sum / board.length;
        }
        return average;
    }
        public String getName (User[]board){
            String userName = "";
            for (int i = 0; i < board.length; i++) {
                if (average > board[i].age) {
                    System.out.println(board[i].name);
                }
            }
            return userName;
        }
}

