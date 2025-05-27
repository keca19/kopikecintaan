Public class DemoManusia {
    Public static void main (String[]args){ //program utama
    Manusia arrMns{}=new Manusia{3};//buat array of object
        Manusia objMns1=new Manusia();//constructor pertama
        objMns1.setNama("Aurellia");
        objMns1.setUmur(17);
        Manusia pnjMns2= new Manusia("Keisha");
        //constructor kedua
    Manusia objMns2=new Manusia ("Lelia,20");//constructor ketiga
    arrMns[0]=objMns1;
    arrMns[1]=objMns2;
    arrMns[2]=objMns3;
    for(int i=0;i<3;i++){
        System.out.println("Nama:"+arrMns[i].getNama());
        System.out.println("Umur:"+arrMns[i].getUmur());
        System.out.println();
    }        
    }
}