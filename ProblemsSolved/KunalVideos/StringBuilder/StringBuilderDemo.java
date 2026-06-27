package KunalVideos.StringBuilder;

public class StringBuilderDemo {
    static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        //To print any index
        System.out.println(sb.charAt(0));

        //to set a character at index
        sb.setCharAt(0,'B');
        System.out.println(sb);

        //to insert
        sb.insert(1,"h");
        System.out.println(sb);

        //to delete
        sb.delete(0,1);
        System.out.println(sb);

        //Appending to make a whole new String
        StringBuilder sb2 = new StringBuilder("");
        sb2.append('H');
        sb2.append('e');
        sb2.append('l');
        sb2.append('l');
        sb2.append('o');
        System.out.println(sb2);
        System.out.println(sb2.length());
    }
}
