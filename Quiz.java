import java.util.*;
public class Quiz {
    public static void main(String[] args){
        String q1 = "What were OU"+"'"+"s Original colors\n (a) Crimson and Champagne\n (b) Red and White\n (c) Crimson and Cream\n (d) Crimson and Corn\n";
        String q2 = "How many fires did Evan’s Hall have\n (a) 0\n (b) 1\n (c) 2\n (d) 3\n";
        String q3 = "Who was the first president\n (a) David Ross Boyd\n (b) James S. Buchanan\n (c) George Lynn Cross\n (d) Willaim Bizzell\n";
        String q4 = "What year was OU founded\n (a) 1875\n (b) 1890\n (c) 1900\n (d) 1906\n";
        String q5 = "Who is the original OU mascot\n (a) Boomer\n (b) Mex the dog\n (c) Sooner\n (d) Max the Scissortail\n";
        String q6 = "How many presidents have we had\n (a) 14\n (b) 16\n (c) 17\n (d) 13\n";
        String q7 = "Rumor has it these animals were imported\n (a) Geese\n (b) Birds\n (c) Rats\n (d) Squirrels\n";
        String q8 = "Can we still use the red phone booth\n (a) No\n (b) Yes\n";
        String q9 = "What % of OU is affiliated with greek life\n (a) 23%\n (b) 53%\n (c) 29%\n (d) 46%\n";
        Question[] questions = {
            new Question(q1, "d"),
            new Question(q2, "c"),
            new Question(q3, "a"),
            new Question(q4, "b"),
            new Question(q5, "b"),
            new Question(q6, "a"),
            new Question(q7, "d"),
            new Question(q8, "b"),
            new Question(q9, "c")
        };
        triviaQuiz(questions);
    }
    public static void triviaQuiz(Question[] questions){
        int score = 0;
        Scanner stdin = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i].prompt);
            String response = stdin.nextLine();
            if(response.equalsIgnoreCase(questions[i].answer)){
                score++;
            }
        }
        System.out.println("your score is " + score + "/" + questions.length);
    }
}
