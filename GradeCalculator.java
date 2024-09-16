public class GradeCalculator
{
  public static void main(String[] args)
  {
    String courseName = "AP Computer Science A";

    int avgTime = 135;
    int hrs = avgTime/60;
    int mins = avgTime%60;

    int hwScore1 = 75;
    int hwScore2 = 99;
    int hwScore3 = 80;
    int hwScore4 = 100;
    double avgHwScore = ((double) hwScore1+hwScore2+hwScore3+hwScore4)/4;

    double quizScore1 = 89.2;
    double quizScore2 = 98.1;
    double avgQuizScore = (quizScore1+quizScore2)/2;

    double finalScore = 87.58;

    int overallGrade = (int) ((avgHwScore * .35) + (avgQuizScore * .15) + (finalScore * .5) + .5);

    System.out.println("course name: " + courseName);
    System.out.println("average time spend in a week for this course in minutes: " + avgTime);
    System.out.println("homework grades for this course: " + hwScore1 + " " + hwScore2 + " " + hwScore3 + " " + hwScore4);
    System.out.println("quiz grades for this course: " + quizScore1 + " " + quizScore2);
    System.out.println("final exam grade for this course: " + finalScore);
    System.out.println("weekly time spent: " + hrs + "h" + mins);
    System.out.println("average homework grade: " + avgHwScore);
    System.out.println("average quiz grade: " + avgQuizScore);
    System.out.println("final exam grade: " + finalScore);
    System.out.println("overall grade: " + overallGrade);

  }
}
