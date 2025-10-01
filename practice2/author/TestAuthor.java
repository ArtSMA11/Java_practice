package practice2.author;

class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Artem",18);
        System.out.println(author);
        author.setName("Ivan");
        author.setAge(15);
        System.out.println(author);
    }
}