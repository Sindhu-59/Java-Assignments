class Article {
    String title;
    String author;
    String topic;
    int wordCount;
	
	Article(String title,String author,String topic,int wordCount){
		this.title=title;
		this.author=author;
		this.topic=topic;
		this.wordCount=wordCount;
	}

    public void getArticleInfo() {
        System.out.println("Article Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Topic: " + topic);
        System.out.println("Word Count: " + wordCount);
    }
}
