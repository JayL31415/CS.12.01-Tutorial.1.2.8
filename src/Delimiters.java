import java.util.ArrayList;

public class Delimiters {
    private String openDel;
    private String closeDel;

    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    public String getOpenDel() {
        return openDel;
    }

    public String getCloseDel() {
        return closeDel;
    }

    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> result = new ArrayList<>();
        for (String token : tokens) {
            if (token.equals(openDel) || token.equals(closeDel))
                result.add(token);
        }
        return result;
    }

    public boolean isBalanced(ArrayList<String> delimiters) {
        int open = 0, close = 0;
        for (String delimiter : delimiters) {
            if (delimiter.equals(openDel)) open++;
            else if (delimiter.equals(closeDel)) close++;
            if (open < close) return false;
        }


        return open == close;
    }
}