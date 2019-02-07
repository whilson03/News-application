package com.olabode.wilson.news;

/*
    created by wilson olabode adeyoriju
 */
public class News {
    private String mDescription;
    private String mTitle;
    private String mAuthor;
    private String mImageUrl;
    private String mNewsUrl;
    private String mContent;


    public News(String mDescription, String imageUrl, String mTitle, String mAuthor, String newsUrl, String content) {
        this.mDescription = mDescription;
        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
        this.mNewsUrl = newsUrl;
        this.mImageUrl = imageUrl;
        this.mContent = content;
    }


    // GET the news url from api
    public String getNewsUrl() {
        return mNewsUrl;
    }


    // get the news description.
    public String getDescription() {
        return mDescription;
    }


    // get the news title.
    public String getTitle() {
        return mTitle;
    }


    // get the author of the article.
    public String getAuthor() {
        return mAuthor;
    }


    // get the image url  of news.
    public String getImageUrl() {
        return mImageUrl;
    }


    // get the news content.
    public String getContent() {
        return mContent;
    }
}

