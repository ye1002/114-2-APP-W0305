public class W0305 {
    public static void main(String[]args){
        int grade = 80 ;
        char type = 'm';
        if(grade > 60 && type=='m'){
            System.out.println("course:"+type+"you can't pass\n"+grade);
        }else{
            System.out.println("you can pass");
        }
    }
}
