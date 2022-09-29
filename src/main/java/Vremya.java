import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vremya
{
    public static void Clocks()

    {
        String input = "Кокунин не сдал экзамен по вождению в: 11:55";
        Pattern pattern = Pattern.compile("(2[0-3]|[0-1]\\d):[0-5]\\d");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
        {
            System.out.println(matcher.group());
        }
    }

}