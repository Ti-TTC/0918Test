class Student {
    private String _name;//氏名
    private String _address;//住所

    public Student(String name, String address){
        _name=name;
        _address=address;
    }

    public String getName(){
        return _name;
    }
    public  String getAddress(){
        return _address;
    }
    public void work(){
        System.out.println("仕事をします。");
    }
}

class IPStudent extends Student {
    public IPStudent(String name, String address){
        super(name, address);
    }
    public void work(){
        System.out.println("プログラムを作成します");
    }
}


class WEBStudent extends Student {
    public WEBStudent(String name, String address){
        super(name, address);
    }
    public void work(){
        System.out.println("webサイトのデザインを行います。");
    }
}



class Test {
    public static void main(String[] args) {
        IPStudent ip = new IPStudent("tanaka","東京都");
        WEBStudent web = new WEBStudent("suzuki","埼玉県");

        execute(ip);
        execute(web);;
    }
    //executeメソッドはひとつなのに、
    //IPStudentの特有の処理もWEBStudent特有の処理も実行できる。
    public static void execute(Student s) {
        s.work();
    }
}