# Title

[a link!](https://something.com)
[another link!](some-page.html)

some paragraph text after the links

@Test
    public void testFile3() throws IOException {
        String contents= Files.readString(Path.of("./lab8test3.md"));
        List<String> expect = List.of("https://www.twitter.com", "https://ucsd-cse15l-w22.github.io/", "https://cse.ucsd.edu/");
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }