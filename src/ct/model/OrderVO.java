package ct.model;

import java.sql.Timestamp;

public class OrderVO {
	private int or_id;//(�ֹ�������ȣ)<<pk>>
private int me_id;//(�Ŵ�������ȣ) <<fk>>
private int id;// (��id)<<fk>>
private String st_name;//(�����) <<fk>>
private int or_sumprice;
private int or_quntity;//(�ֹ���)
private String or_situation;//(�ֹ�����)
private int or_temper;
private int or_cup;
private int or_shot;
private int or_whip;
private int or_syrup;
private Timestamp or_createdAt;//(�ֹ��ð�)
}
