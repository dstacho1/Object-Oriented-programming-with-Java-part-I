public class StringUtils {
    public static boolean included(String word, String searched){
        if (word == null || searched == null){
            return false;
        }else {
            searched = searched.toUpperCase().trim();
            word = word.toUpperCase();
            if (word.contains(searched)){
                return true;
            }else {
                return false;
            }
        }
    }
}
