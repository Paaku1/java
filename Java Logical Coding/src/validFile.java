public class validFile {
    public static void main(String[] args) {
        String[] files = { "files_2", "files_4", "files_1" };
        int max = -1;
        for (String file : files) {
            if (file.matches("files_[0-9]")) {
                max = Math.max(Integer.parseInt(file.substring(file.indexOf('_') + 1, file.length())), max);
            }
        }
        System.out.println(max);
    }
}
