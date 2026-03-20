public class Exceptionhandling
{
    @SuppressWarnings({ "unused", "null" })
    public static void main(String[] args) {
        try {
            String str = null;

            int num = Integer.parseInt(str); // may throw NumberFormatException
            System.out.println(str.length()); // may throw NullPointerException

        } catch (NumberFormatException e) {
            System.out.println("Wrong number format");
        } catch (NullPointerException e) {
            System.out.println("Null value found");
        }
    }
}
