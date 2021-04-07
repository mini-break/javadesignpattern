package cn.javass.dp.proxy.example5;

/**
 * ��������Ľӿڶ���
 */
public interface OrderApi {
    /**
     * ��ȡ���������Ĳ�Ʒ����
     *
     * @return ���������Ĳ�Ʒ����
     */
    String getProductName();

    /**
     * ���ö��������Ĳ�Ʒ����
     *
     * @param productName ���������Ĳ�Ʒ����
     * @param user        ������Ա
     */
    void setProductName(String productName, String user);

    /**
     * ��ȡ��������������
     *
     * @return ��������������
     */
    int getOrderNum();

    /**
     * ���ö�������������
     *
     * @param orderNum ��������������
     * @param user     ������Ա
     */
    void setOrderNum(int orderNum, String user);

    /**
     * ��ȡ������������Ա
     *
     * @return ������������Ա
     */
    String getOrderUser();

    /**
     * ���ô�����������Ա
     *
     * @param orderUser ������������Ա
     * @param user      ������Ա
     */
    void setOrderUser(String orderUser, String user);
}