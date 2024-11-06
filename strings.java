public class strings {
    public static void main(String[] arg){
        String word ="   Hello world"+"!!"  ;
        System.out.println(word.endsWith("ld"));
        System.out.println(word.startsWith("w"));
        System.out.println(word.length());
        System.out.println(word.replace("world","baby"));
        System.out.println(word.indexOf("e"));
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println(word.trim());
        System.out.println(word);
    }
}
