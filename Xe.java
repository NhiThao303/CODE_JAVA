/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maytinh;

/**
 *
 * @author NHI THAO
 */
class Xe {

    Xe(String Tesla, int par) {
    }
    private String hangXe;
    private int namSanXuat;

    public String getHangXe() {
        return this.hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    @Override
    public String toString() {
        return "Xe [hangXe=" + hangXe + ", namSanXuat=" + namSanXuat + "]";
    }
}
