public class YuksekLisans extends Ogrenci{
    String program;
    String danisman;

    public YuksekLisans(String Name_Surname,int age,String Id,String bolum,String program,String danisman,String memleket) {
        this.Name_Surname=Name_Surname;
        this.Id=Id;
        this.age=age;
        this.bolum=bolum;
        this.program=program;
        this.danisman=danisman;
        this.memleket=memleket;
    }
}
