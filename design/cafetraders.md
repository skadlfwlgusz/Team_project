#cafe traders ����
>SRS(�䱸���� ��Ȯȭ )����

##����


###�����ͽ�Ű��
-member�����//��Ű���ϼ�
-CEO�����//��Ű���ϼ�
-store //��Ű���ϼ�
-order
-community
-menu
-good
-reply(���)
-review(���帮��)
-qna
-infrom(��������)
-filter  //��Ű���ϼ�
-tag
-activity(Ȱ������)
####��ƼƼ ��Ű��

####memberVO
id int(11) AI PK 
email_id varchar(45) 
password varchar(45) 
birth date 
phone varchar(45) 
point int(11) 
following varchar(512) 
created_at datetime 
updated_at datetime
####ceoVO
ceo_id int(11) AI PK 
ceo_email varchar(45) 
ceo_password varchar(45) 
ceo_birth datetime 
ceo_phone varchar(45) 
ceo_license varchar(45) 
created_at datetime
####storeVO
st_id int(11) AI PK 
ceo_id int(11) 
st_name varchar(45) 
st_pic varchar(512) 
st_inform varchar(128) 
st_place varchar(512) 
st_latlng varchar(128) 
st_post text 
st_mood int(11) 
st_zone varchar(256) 
created_at datetime 
updated_at datetime
####orderVO
or_id int(11) PK 
me_id varchar(20) 
id int(11) 
st_name varchar(45) 
or_sumprice int(11) 
or_quntity int(11) 
or_situation varchar(45) 
or_temper int(11) 
or_cup int(11) 
or_shot int(11) 
or_whip int(11) 
or_syrup int(11) 
created_at datetime

####menuVO
me_id int(11) PK 
st_id int(11) 
me_name varchar(45) 
me_price int(11) 
me_img varchar(512) 
me_temper tinyint(4) 
me_shot tinyint(4) 
me_whip tinyint(4) 
me_syrup tinyint(4) 
me_create_at datetime

####communityVO
com_id int(11) PK 
st_id int(11) 
id int(11) 
com_img varchar(512) 
com_content varchar(512) 
com_tag varchar(45) 
com_created_at datetime

####goodVO
id int(11) <<FK>>
com_id int(11) <<FK>>

####replyVO
rp_id int(11) PK FK
id int(11) 
com_id int(11) FK
rp_content varchar(512) 
rp_depth int(11) 
rp_sort int(11) 
rp_created_at datetime

####reviewVO
rv_id int(11) PK 
id int(11) FK
st_id int(11) FK
rv_content varchar(100) 
rv_star int(11) 
rv_created_at datetime

####informVO
in_id int(11) PK 
in_title varchar(45) 
in_content longtext 
in_created_at datetime
 
####filterVO
-fi_id(�����Ϸù�ȣ)
-fi_num(�������������Ϸù�ȣ)
-fi_
####tagVO
id int(11) AI PK 
fi_num varchar(45) 
fi_mood varchar(45) 
fi_combination tinyint(4) 
created_at datetime

####activityVO
ac_id int(11) PK 
com_id int(11) FK
rp_id int(11)  FK
ac_subject varchar(45) 
ac_object varchar(45) 
ac_created_at datetime

## �ֿ���
1.����

2.ȸ�����԰���(�ߺ��ȵ�)

2.ȸ���� �α���/�α׾ƿ� ����

3.ȸ���� Ŀ�´�Ƽ ���� 
�α����� �ߴٴ� �����Ͽ� �����Ѵ�.
-���ͷ� ����Ͽ� ������ ����Ʈ�� �˻��� �� �ִ�. 
-�۾��� ��ư�� Ŭ���� ���ۼ�(�����ø���, �۳��� �ۼ�, �±�÷��)�� �� �ִ�.
-Ȯ�ι�ư�� ������ �� ������ �ϼ��� �������� �����ϱ� ��ư�� ÷�ε� �������� �� ���ִ�.
-�������� �� �� �ִ�.

4.store ����
-�������� ī��˻� �ϸ� ��ó ī�䰡 �˻��ȴ�.
-������, ���䰡 ���� ī������� �� �� �ִ�.
-������ �ϳ� Ŭ������ �� ī��󼼺��Ⱑ �����ϴ�.(��ġ���� �� ī������)
-�޴����Ⱑ �����ϴ�.
-�޴��� Ŭ������ �� �ֹ��� �����ϴ�.
-�ֹ� �� �ֹ������� �� �� �ִ�.
-�ֹ��ϷḦ �ϸ� ����â���� �Ѿ��.
-���������� �� �� �ִ�.

5. ��������
-admin�� ���������� �ø� �� �ִ�.
-ȸ���� ���������� Ȯ�� �� �� �ִ�.

6.����������
-����Ʈ�� Ȯ���� �� �ִ�.
-�� �ֹ������� Ȯ���� �� �ִ�.
-�� Ȱ���α׸� Ȯ���� �� �ִ�.
-���� �� �� ����Ʈ�� Ȯ���� �� �ִ�.
-�� ��������Ʈ�� �� �� �ִ�.
-�� ���������� �����ϴ�.

-------------------------------
<<�Ǹ���>>
2.ȸ�����԰���(�ߺ��ȵ�)
3.�������
-�������� �����ϴ�
-��������� �����ϴ�.

4.���Կ
- �Ǹ��ڰ� �ֹ����� ����Ʈ�� �� �� �ִ�.
- �Ǹ��ڰ� �ֹ� ���� ���¸� ������ �� �ִ�.
- �Ǹ��ڰ� ���� ����Ʈ�� �� �� �ִ�.
- �Ǹ��ڰ� �޴� ����Ʈ�� �� �� �ִ�.
- �Ǹ��ڰ� �޴� ���ε� �� �� �ִ�.
- �Ǹ��ڰ� �޴� ������ �� �� �ִ�.
- �Ǹ��ڰ� ���� ����Ʈ�� �� �� �ִ�. 

<<admin>>

/admin/*
- ������ �������� ����Ʈ�� �� �� �ִ�.
- ������ ���������� ���ε� �� �� �ִ�.
- ������ ���������� ������ �� �ִ�.
- ������ ���������� ������ �� �ִ�.
- ������ ���� ����Ʈ�� �� �� �ִ�.
- ������ ȸ�� ����Ʈ�� �� �� �ִ�.
- ������ ��� ����Ʈ�� �� �� �ִ�.
- ������ ����� ���� �� �� �ִ�.
- ������ ����� ���� �� �� �ִ�. 



###url ����
*.ct
1.����

2.ȸ�����԰���(�ߺ��ȵ�)
>join.ct(�������)
>join2.ct(ȸ�������Է�)
>join_proc.ct(dao����)

2.ȸ���� �α���/�α׾ƿ� ����
>login.ct
>login_proc.ct

3.ȸ���� Ŀ�´�Ƽ ���� 
- ��ȸ��/ȸ���� Ŀ�´�Ƽ ����Ʈ�� �� �� �ִ�.
>commu_list.ct
- ȸ���� Ŀ�´�Ƽ �Խñ��� �ۼ��� �� �ִ�.
>commu_add.ct
>commu_add_porc.ct
- ȸ���� Ŀ�´�Ƽ �Խñ��� ������ �� �ִ�.
>commu_add.ct
>commu_add_porc.ct
- ȸ���� Ŀ�´�Ƽ �Խñ��� ������ �� �ִ�.
>commu_list.ct
- ȸ���� Ŀ�´�Ƽ �Խñۿ� ����� �ۼ��� �� �ִ�.
>commu_list.ct
- ȸ���� Ŀ�´�Ƽ �Խñۿ� ����� ������ �� �ִ�.
>commu_list.ct
- ȸ���� Ŀ�´�Ƽ �Խñۿ� ����� ������ �� �ִ�.
>commu_list.ct
- ȸ���� Ŀ�´�Ƽ �Խñۿ� ���ƿ並 �� �� �ִ�.
>commu_list.ct
- ��ȸ��/ȸ���� ���� ���������� �� �� �ִ�.
>sto_list.ct

4.store ����
- ��ȸ��/ȸ���� ���� ����Ʈ�� �� �� �ִ�.
> sto_list.ct
- ��ȸ��/ȸ���� ���� �˻��� �� �� �ִ�.
> sto_list.ct
> sto_list_porc.ct
- ��ȸ��/ȸ���� ���� ���� ����Ʈ�� �� �� �ִ�.
> sto_list.ct
- ��ȸ��/ȸ���� ���� ���������� �� �� �ִ�.
>sto_list_proc.ct
- ��ȸ��/ȸ���� ���� �Ŵ� ����Ʈ�� �� �� �ִ�.
>sto_menu_list.ct
>sto_menu_list_proc.ct
- ȸ���� ���� �޴� �ֹ� ����Ʈ�� �� �� �ִ�.
>sto_menu_order_list.ct
>sto_menu_order_list_proc.ct
- ȸ���� ���� �޴� �ֹ� �� �������� �� �� �ִ�.
>sto_menu_order_detail.ct
>sto_menu_order_detail_proc.ct
- ȸ���� ���� �޴� �ֹ� Ȯ�� �������� Ȯ�� �� �� �ִ�.
>sto_menu_order.ct
>sto_menu_order_proc.ct
5. ��������
- ȸ���� �������� ����Ʈ�� �� �� �ִ�.
> member_inform_list.ct
- ȸ���� �������� �󼼺��⸦ �� �� �ִ�.
> member_inform.ct

6.����������
-ȸ���� ����Ʈ�� Ȯ���� �� �ִ�.
>user.ct
-ȸ���� �ֹ����� ����Ʈ�� Ȯ���� �� �ִ�.
>user_orderlist.ct
-ȸ���� Ȱ���α� ����Ʈ�� Ȯ���� �� �ִ�.
>user_log_list.ct
-ȸ���� �ۼ��� �Խñ� ����Ʈ�� Ȯ���� �� �ִ�.
>user_comm_list.ct
-ȸ���� ��������Ʈ�� �� �� �ִ�.
>user_inform_list.ct
-ȸ���� ������ ���� �� �� �ִ�.
>user_inform_edit.ct
>user_inform_edit_proc.ct

-------------------------------
<<�Ǹ���>>
2.ȸ�����԰���(�ߺ��ȵ�)
3.�������
-�������� �����ϴ�
-��������� �����ϴ�.

4.���Կ
- �Ǹ��ڰ� �ֹ����� ����Ʈ�� �� �� �ִ�.
>ceo/order_list.ct
- �Ǹ��ڰ� �ֹ� ���� ���¸� ������ �� �ִ�.
>ceo/order_list_status.ct
- �Ǹ��ڰ� ���� ����Ʈ�� �� �� �ִ�.
>ceo/sale_list.ct
- �Ǹ��ڰ� �޴� ����Ʈ�� �� �� �ִ�.
>ceo/menu_list.ct
- �Ǹ��ڰ� �޴� ���ε� �� �� �ִ�.
> ceo/new_menu.ct
> ceo/new_menu_proc.ct
- �Ǹ��ڰ� �޴� ������ �� �� �ִ�.
>ceo/menu_edit.ct
>ceo/menu_edit_proc.ct
- �Ǹ��ڰ� ���� ����Ʈ�� �� �� �ִ�. 
>ceo/review_list.ct

<<admin>>

/admin/*
- ������ �������� ����Ʈ�� �� �� �ִ�.
/admin/inform_list.ct
- ������ ���������� ���ε� �� �� �ִ�.
/admin/new_inform.ct
/admin/new_inform_proc.ct
- ������ ���������� ������ �� �ִ�.
/admin/inform_edit.ct
/admin/infrom_edit_proc.ct
- ������ ���������� ������ �� �ִ�.
/admin/infrom.ct
- ������ ���� ����Ʈ�� �� �� �ִ�.
/admin/sale_list.ct
- ������ ȸ�� ����Ʈ�� �� �� �ִ�.
/admin/member_list.ct
- ������ ȸ���� ������ �� �ִ�.
/admin/member_edit.ct
/admin/member_edit_proc.ct
- ������ ȸ���� ���� �� �� �ִ�.
/admin/menber_list.ct
- ������ ��� ����Ʈ�� �� �� �ִ�.
/admin/reply_list.ct
- ������ ����� ���� �� �� �ִ�.
/admin/reply_edit.ct
/admin/reply_edit_proc.ct
- ������ ����� ���� �� �� �ִ�. 
/admin/reply_list.ct


##���͸� ������

WebContent/
WebContent/CEOmanage
WebContent/common
WwebContent/community
WebContent/css/CEOmanage
WebContent/css/community
WebContent/css/join
WebContent/css/mypage
WebContent/css/sellor
WebContent/css/service
WebContent/css/store
WebContent/image/community
WebContent/image/follow
WebContent/image/home
WebContent/image/join
WebContent/image/login
WebContent/image/service
WebContent/image/store
WebContent/join
WebContent/js
WebContent/js/bxslider-4-4.2.12
WebContent/mypage
WebContent/pieces_txt
WebContent/sellor
WebContent/service
WebContent/store

### ��Ű�� ������
src/
src/ct.dao
src/ct.dao.inf.IMemberDAO
src/ct.dao.inf.ICeoDAO
src/ct.dao.inf.IStoreDAO
src/ct.dao.inf.IOrderDAO
src/ct.dao.inf.ICommunityDAO
src/ct.dao.inf.IMenuDAO
src/ct.dao.inf.IGoodDAO
src/ct.dao.inf.IReplyDAO
src/ct.dao.inf.IReviewDAO
src/ct.dao.inf.IQnaDAO
src/ct.dao.inf.IInformDAO
src/ct.dao.inf.IFilterDAO
src/ct.dao.inf.ITagsDAO
src/ct.dao.inf.IActivityDAO

src/ct.dao.inf.MemberMysqlDAOimpl
src/ct.dao.inf.CeoMysqlDaoimpl
src/ct.dao.inf.StoreMysqlDaoimpl
src/ct.dao.inf.OrderMysqlDaoimpl
src/ct.dao.inf.CommunityMysqlDaoimpl
src/ct.dao.inf.MenuMysqlDaoimpl
src/ct.dao.inf.GoodMysqlDaoimpl
src/ct.dao.inf.ReplyMysqlDaoimpl
src/ct.dao.inf.ReviewMysqlDaoimpl
src/ct.dao.inf.QnaMysqlDaoimpl
src/ct.dao.inf.InformMysqlDaoimpl
src/ct.dao.inf.FilterMysqlDaoimpl
src/ct.dao.inf.TagsMysqlDaoimpl
src/ct.dao.inf.ActivityMysqlDaoimpl

src/ct.model.memberVO
src/ct.model.CEOVO
src/ct.model.storeVO
src/ct.model.orderVO
src/ct.model.communityVO
src/ct.model.menuVO
src/ct.model.goodVO
src/ct.model.replyVO
src/ct.model.reviewVO
src/ct.model.qnaVO
src/ct.model.infromVO
src/ct.model.filterVO  
src/ct.model.tagVO
src/ct.model.activityVO

src/ct.svc.controller.frontController

src/ct.svc.impl.MemberAddsvcimpl
src/ct.svc.inf.memberAddsvc

src/ct.svc.impl.MemberLogInOutsvcimpl
src/ct.svc.inf.memberLogInOutsvc


src/ct.svc.impl.CommunityEditsvcimpl
src/ct.svc.inf.CommunityEditsvc

src/ct.svc.impl.CommunityEditsvcimpl
src/ct.svc.inf.CommunityEditsvc

src/ct.svc.impl.CommunityEditsvcimpl
src/ct.svc.inf.CommunityEditsvc

src/ct.svc.impl.StoreOrderListsvcimpl
src/ct.svc.inf.StoreOrderListsvc

src/ct.svc.impl.StoreDetailListsvcimpl
src/ct.svc.inf.StoreDetailListsvc

src/ct.svc.impl.StoreOrderListsvcimpl
src/ct.svc.inf.StoreOrderListsvc

src/ct.svc.impl.StoreMenuOrdersvcimpl
src/ct.svc.inf.StoreMenuOrdersvc

src/ct.svc.impl.StoreOrderListsvcimpl
src/ct.svc.inf.StoreOrderListsvc

src/ct.svc.impl.UserEditsvcimpl
src/ct.svc.inf.UserEditsvc

src/ct.svc.impl.UserEditsvcimpl
src/ct.svc.inf.UserEditsvc

src/ct.svc.impl.CeoMenuAddsvcimpl
src/ct.svc.inf.CeoMenuAddsvc

src/ct.svc.impl.CeoMenuEditsvcimpl
src/ct.svc.inf.CeoMenuEditsvc

src/ct.svc.impl.CeoMenuAddsvcimpl
src/ct.svc.inf.CeoMenuAddsvc

src/ct.svc.impl.AdminInformAddsvcimpl
src/ct.svc.inf.AdminInformAdd

src/ct.svc.impl.AdminInformEditimpl
src/ct.svc.inf.AdminInformEditsvc

src/cvc.impl.AdminReplyEditimpl
src/cvc.inf.AdminReplyEditsvc

src/cvc.impl.AdminInformEditimpl
src/cvc.inf.AdminInformEditsvc

