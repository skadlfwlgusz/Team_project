package ct.model;

import java.sql.Timestamp;

public class CommunityVO {
private int com_id;//(�Խù��Ϸù�ȣ) <<pk>>
private int st_id;//(�����Ϸù�ȣ) <<fk>>
private int id;//(��id) <<fk>>
private String com_img; 
private String com_content;
private String com_tag;
private Timestamp com_createdAt;
}
