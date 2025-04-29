package exam01;

@MyAnno(value = "안녕", min=20, max={200,300,400})
public class Ex01 {

    @MyAnno("안녕2")
    public Ex01(){

    }

    @MyAnno(value="안녕3", min=5, max=20)
    void method(){

    }
}
