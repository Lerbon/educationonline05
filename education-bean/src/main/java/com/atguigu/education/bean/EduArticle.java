package com.atguigu.education.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author York
 * @create 2018-11-30 10:21
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class EduArticle implements Serializable {
    private String articleId;
    private String title;
    private String summary;
    private String keyWord;
    private String ImageUrl;
    private String source;
    private String author;
    private String createTime;
    private String publishTime;
    private String link;
    private String articleType;
}
