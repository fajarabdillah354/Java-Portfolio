package ExerciseLogic;

import java.util.ArrayList;
import java.util.List;

abstract class Karyawan{
    protected String name;
    protected int idPewagai;
    protected int gaji;

    public Karyawan(String name, int idPewagai, int gaji) {
        this.name = name;
        this.idPewagai = idPewagai;
        this.gaji = gaji;
    }

    abstract int gaji();

    @Override
    public String toString() {
        return "name = " + name + "\n" + "idPewagai = "  + idPewagai + "\n" + "TotalGajiPerBulan = " + gaji() ;
    }
}


class KepalaSekolah extends Karyawan{
    private String jabatan;
    private int bonusGaji;

    private int tunjungan;

    public KepalaSekolah(String name, int idPewagai, int gaji, String jabatan, int bonusGaji, int tunjungan) {
        super(name, idPewagai, gaji);
        this.jabatan = jabatan;
        this.bonusGaji = bonusGaji;
        this.tunjungan = tunjungan;
    }

    public int getBonusGaji() {
        return bonusGaji;
    }

    public void setBonusGaji(int bonusGaji) {
        this.bonusGaji = bonusGaji;
    }


    @Override
    int gaji() {
        return bonusGaji + tunjungan + gaji;
    }

    @Override
    public String toString() {
        return "KepalaSekolah{\n" +
                super.toString() + "\n" +
                "jabatan = " + jabatan + "\n" +
                "gaji = "+ gaji + "\n" +
                "bonusGaji = " + bonusGaji + "\n" +
                "tunjungan = " + tunjungan +
                '}';
    }
}


class Guru extends Karyawan{
    private int menitKerjaPerMinggu;

    public Guru(String name, int idPewagai, int gaji, int menitKerjaPerMinggu) {
        super(name, idPewagai, gaji);
        this.menitKerjaPerMinggu = menitKerjaPerMinggu;
    }

    @Override
    int gaji() {
        return 4 * menitKerjaPerMinggu;
    }

    @Override
    public String toString() {
        return "Guru{\n" +
                super.toString()+ "\n" +
                "menitKerjaPerMinggu = " + menitKerjaPerMinggu +
                '}';
    }
}

class TU extends Karyawan{
    private int lamaKerjaPerTahun;
    private int bonus;

    private int gaji = 2000;

    public int getGaji() {
        return gaji;
    }

    public TU(String name, int idPewagai, int gaji, int lamaKerjaPerTahun, int bonus) {
        super(name, idPewagai, gaji);
        this.lamaKerjaPerTahun = lamaKerjaPerTahun;
        this.bonus = bonus;
    }

    @Override
    int gaji() {
        return gaji + (lamaKerjaPerTahun * bonus);
    }

    @Override
    public String toString() {
        return "TU{\n" +
                super.toString()+ "\n" +
                "lamaKerjaPerTahun =" + lamaKerjaPerTahun + "\n" +
                "gaji = " + gaji + "\n"+
                "bonus =" + bonus +
                '}';
    }
}

public class SekolahOop {

    public static void main(String[] args) {
        List<Karyawan> list = new ArrayList<>();

        list.add(new KepalaSekolah("Kwartin", 1, 7000, "Kepala Sekolah", 3000, 2000));
        list.add(new Guru("Elvi Sugigi", 2, 2000, 1500));
        list.add(new TU("Supriadi", 3, 2000, 4, 500));

        for (var getPrint : list) {
            System.out.println(getPrint);
        }

        int totalGajiKaryawan = list.stream().mapToInt(Karyawan::gaji).sum();
        System.out.println("TOTAL GAJI SEMUANYA = "+totalGajiKaryawan);



    }



}
