package ct.model;

import java.sql.Timestamp;

public class ReplyVO {
private int rp_id;//(����Ϸù�ȣ) <<pk>>
private int id;//(��id) <<fk>>
private int com_id;//(�Խù��Ϸù�ȣ) <<fk>>
private String rp_content;
private int rp_depth;
private int rp_sort;
private Timestamp rp_createdAt;
}
