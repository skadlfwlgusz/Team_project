package ct.model;

import java.sql.Timestamp;

public class ReviewVO {
private int rv_id;//(���忡 �޸��� ���������ȣ) <<pk>>
private int id;//(��id) <<fk>>
private int st_id;//(�����Ϸù�ȣ)<<fk>>
private String rv_content;
private int rv_star;//(����)
private Timestamp rv_createdAt;
}
